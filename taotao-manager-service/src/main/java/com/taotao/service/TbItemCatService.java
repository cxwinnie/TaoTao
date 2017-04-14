package com.taotao.service;

import com.taotao.common.entity.EasyUITreeNode;

import java.util.List;

/**
 * Created by Xianda Xu on 2017/4/14.
 */
public interface TbItemCatService {
    List<EasyUITreeNode> getTbItemCatList(Long parentId);
}
