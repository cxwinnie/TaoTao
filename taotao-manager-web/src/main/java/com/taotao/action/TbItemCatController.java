package com.taotao.action;

import com.taotao.common.entity.EasyUITreeNode;
import com.taotao.service.TbItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Xianda Xu on 2017/4/14.
 */
@Controller
@RequestMapping("/item/cat")
public class TbItemCatController {

    @Autowired
    private TbItemCatService tbItemCatService;

    @RequestMapping("/list")
    @ResponseBody
    public List<EasyUITreeNode> getTbItemCatList(@RequestParam(value="id",defaultValue ="") Long parentId){
        return tbItemCatService.getTbItemCatList(parentId);
    }

}
