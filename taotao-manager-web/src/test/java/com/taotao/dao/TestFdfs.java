package com.taotao.dao;

import org.csource.fastdfs.*;
import org.junit.Test;

/**
 * Created by Xianda Xu on 2017/6/22.
 */
public class TestFdfs {


    @Test
    public void testFdfs() throws Exception{
        // 1、把FastDFS提供的jar包添加到工程中
        // 2、初始化全局配置。加载一个配置文件。
        ClientGlobal.init("D:\\important\\AllCode\\TaoTao\\taotao-manager-web\\src\\main\\resources\\properties\\client.conf");
        // 3、创建一个TrackerClient对象。
        TrackerClient trackerClient = new TrackerClient();
        // 4、创建一个TrackerServer对象。
        TrackerServer trackerServer = trackerClient.getConnection();
        // 5、声明一个StorageServer对象，null。
        StorageServer storageServer = null;
        // 6、获得StorageClient对象。
        StorageClient storageClient = new StorageClient(trackerServer, storageServer);
        // 7、直接调用StorageClient对象方法上传文件即可。
        String[] strings = storageClient.upload_file("D:\\1.jpg", "jpg", null);
        for (String string : strings) {
            System.out.println(string);
        }

    }

}
