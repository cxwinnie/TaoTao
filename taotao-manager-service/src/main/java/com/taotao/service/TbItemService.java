package com.taotao.service;

import com.taotao.entity.TbItem;

import java.util.List;

/**
 * Created by Xianda Xu on 2017/3/23.
 */
public interface TbItemService {
    List<TbItem> getById(Long id);
}
