package com.taotao.action;

import com.taotao.common.entity.PictureResult;
import com.taotao.service.PictureService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

/**
 * 图片上传Controller
 * Created by Xianda Xu on 2017/6/22.
 */
@Controller
@RequestMapping("/pic")
public class PictureController {

    Log log = LogFactory.getLog(this.getClass());

    @Autowired
    private PictureService pictureService;

    @RequestMapping("/upload")
    @ResponseBody
    public PictureResult uploadFile(MultipartFile uploadFile){
        PictureResult pictureResult = pictureService.uploadPic(uploadFile);
        return pictureResult;
    }

}
