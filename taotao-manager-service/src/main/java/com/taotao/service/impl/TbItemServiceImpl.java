package com.taotao.service.impl;

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
}
