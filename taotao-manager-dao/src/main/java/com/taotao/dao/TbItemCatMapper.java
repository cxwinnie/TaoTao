package com.taotao.dao;

import com.taotao.entity.TbItemCat;

import java.util.List;

public interface TbItemCatMapper {
    List<TbItemCat> selectBySelective(TbItemCat tbItemCat);
}