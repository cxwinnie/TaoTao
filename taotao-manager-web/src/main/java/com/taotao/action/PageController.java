package com.taotao.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Xianda Xu on 2017/3/24.
 */
@Controller
public class PageController {

    @RequestMapping("/")
    public String showIndex(){
        return "index";
    }

    @RequestMapping("/{pageIndex}")
    public String showPage(@PathVariable String pageIndex){
        return pageIndex;
    }
}
