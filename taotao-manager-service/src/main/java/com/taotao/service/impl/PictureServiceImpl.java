package com.taotao.service.impl;

import com.taotao.common.entity.PictureResult;
import com.taotao.service.PictureService;
import com.taotao.utils.FastDFSClient;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by Xianda Xu on 2017/6/22.
 */
@Service
public class PictureServiceImpl implements PictureService{
    @Override
    public PictureResult uploadPic(MultipartFile picFile) {
        PictureResult pictureResult = new PictureResult();
        //判断图片是否为空
        if(picFile.isEmpty()){
            pictureResult.setError(1);
            pictureResult.setMessage("图片为空");
            return pictureResult;
        }
        //上传到图片服务器
        try {
            //取文件扩展名
            String originalFilename = picFile.getOriginalFilename();
            String extName = originalFilename.substring(originalFilename.lastIndexOf(".") + 1);
            FastDFSClient fastDFSClient = new FastDFSClient("classpath:properties/client.conf");
            String url = fastDFSClient.uploadFile(picFile.getBytes(), extName);
            pictureResult.setUrl(url);
            pictureResult.setError(0);
        } catch (Exception e) {
            pictureResult.setError(1);
            pictureResult.setMessage("图片上传失败");
            e.printStackTrace();
        }
        return pictureResult;
    }
}
