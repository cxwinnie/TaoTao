package com.taotao.dao;

import com.taotao.entity.TbItem;

import java.util.List;

public interface TbItemMapper {
    List<TbItem> getById(Long id);

    List<TbItem> getAll(TbItem tbItem);
}