package com.taotao.service.impl;

import com.taotao.common.entity.EasyUITreeNode;
import com.taotao.dao.TbItemCatMapper;
import com.taotao.entity.TbItemCat;
import com.taotao.service.TbItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Xianda Xu on 2017/4/14.
 */
@Service
public class TbItemCatServiceImpl implements TbItemCatService{

    @Autowired
    private TbItemCatMapper tbItemCatMapper;

    @Override
    public List<EasyUITreeNode> getTbItemCatList(Long parentId) {
        TbItemCat tbItemCat = new TbItemCat();
        tbItemCat.setParentId(parentId);
        List<TbItemCat> tbItemCats = tbItemCatMapper.selectBySelective(tbItemCat);
        List<EasyUITreeNode> easyUITreeNodes = new ArrayList<EasyUITreeNode>();
        for(TbItemCat temp : tbItemCats){
            EasyUITreeNode easyUITreeNode = new EasyUITreeNode();
            easyUITreeNode.setId(temp.getId());
            easyUITreeNode.setText(temp.getName());
            easyUITreeNode.setState(temp.getIsParent()?"closed":"open");
            easyUITreeNodes.add(easyUITreeNode);
        }
        return easyUITreeNodes;
    }
}
