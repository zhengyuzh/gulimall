package com.atguigu.gulimall.thirdparty;

import com.aliyun.oss.OSSClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

@SpringBootTest
class GulimallThirdPartyApplicationTests {

    @Autowired
    OSSClient ossClient;

    @Test
    public void testOssDemo() throws FileNotFoundException {

        //上传文件流
        FileInputStream inputStream = new FileInputStream("F:\\Users\\lenovo\\Documents\\HBuilderProjects\\西南大学静态网页\\img\\401.jpg");
        ossClient.putObject("gulimall-zhengyu","国企2.jpg",inputStream);

        //关闭OSSCLient
        ossClient.shutdown();
        System.out.println("上传成功...");




    }

    @Test
    void contextLoads() {
    }

}
