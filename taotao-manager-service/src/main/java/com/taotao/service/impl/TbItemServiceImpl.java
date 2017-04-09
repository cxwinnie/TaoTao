package com.taotao.service.impl;

import com.alibaba.druid.sql.ast.expr.SQLCaseExpr;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.common.entity.EasyUIDataGridResult;
import com.taotao.dao.TbItemMapper;
import com.taotao.entity.TbItem;
import com.taotao.service.TbItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Xianda Xu on 2017/3/23.
 */
@Service
public class TbItemServiceImpl implements TbItemService{

    @Autowired
    private TbItemMapper tbItemMapper;

    @Override
    public List<TbItem> getById(Long id) {
        return tbItemMapper.getById(id);
    }

    /**
     *
     * @param page   当前页
     * @param rows    行数
     * @return
     */
    @Override
    public EasyUIDataGridResult getTbItemList(int page, int rows){
        //分页处理
        PageHelper.startPage(page,rows);
        TbItem tbItem = new TbItem();
        List<TbItem> tbItemList = tbItemMapper.getAll(tbItem);
        //取分页信息
        PageInfo<TbItem> pageInfo = new PageInfo<>(tbItemList);
        //返回处理结果
        EasyUIDataGridResult result = new EasyUIDataGridResult();
        result.setTotal(pageInfo.getTotal());
        result.setRows(tbItemList);
        return result;
    }

}
