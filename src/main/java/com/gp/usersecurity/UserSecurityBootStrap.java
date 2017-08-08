/**
 * 
 */
package com.gp.usersecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ganeshp
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class UserSecurityBootStrap {

	/**
	 * 
	 */
	public UserSecurityBootStrap() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(UserSecurityBootStrap.class, args);

	}

}
