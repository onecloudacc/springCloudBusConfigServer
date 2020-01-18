package com.learn.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringCloudBusConfigServer {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudBusConfigServer.class, args);
	}
}
