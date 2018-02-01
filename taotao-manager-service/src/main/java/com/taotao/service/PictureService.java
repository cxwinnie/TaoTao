package com.taotao.service;

import com.taotao.common.entity.PictureResult;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by Xianda Xu on 2017/6/21.
 */
public interface PictureService {
    PictureResult uploadPic(MultipartFile picFile);
}
