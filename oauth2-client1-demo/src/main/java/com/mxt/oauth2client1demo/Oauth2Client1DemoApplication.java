package com.mxt.oauth2client1demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

@SpringBootApplication
//开启单点登录
@EnableOAuth2Sso
public class Oauth2Client1DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(Oauth2Client1DemoApplication.class, args);
    }

}
