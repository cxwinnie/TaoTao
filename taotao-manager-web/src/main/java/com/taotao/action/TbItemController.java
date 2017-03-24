package com.taotao.action;

import com.taotao.entity.TbItem;
import com.taotao.service.TbItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Xianda Xu on 2017/3/23.
 */
@Controller
public class TbItemController {

    @Autowired
    private TbItemService tbItemService;

    @RequestMapping("/item/{itemId}")
    @ResponseBody
    public TbItem getById(@PathVariable Long itemId){
        TbItem tbItem = null;
        List<TbItem> tbItemList = tbItemService.getById(itemId);
        if(tbItemList!=null && tbItemList.size()!=0){
            tbItem = tbItemList.get(0);
        }
        return tbItem;
    }

}
