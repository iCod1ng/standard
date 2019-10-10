package com.bb.standard;

import org.jasypt.util.text.BasicTextEncryptor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StandardApplicationTests {

    @Test
    public void contextLoads() {
        BasicTextEncryptor textEncryptor = new BasicTextEncryptor();

        textEncryptor.setPassword("bb@1995intheforest");

        String envName = textEncryptor.encrypt("dev");
        String envConfig = textEncryptor.encrypt("127.0.0.1:8081");
        System.out.println("name: "+envName);
        System.out.println("config: "+envConfig);

    }

}
