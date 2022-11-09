package com.incomm.springbootsample;

import org.jasypt.encryption.pbe.PBEStringCleanablePasswordEncryptor;
import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

//@PropertySource({"file:/opt/incomm-simplespringboot/config/testspringboot.properties" })
//@PropertySource({"classpath:qab/testspringboot.properties" })
//@PropertySource({"file:../../../../resources/qab/testspringboot.properties" })

@SpringBootApplication
public class SpringbootSampleApplication {
	
	/*
	 * @Bean public PBEStringCleanablePasswordEncryptor encryptorBean() {
	 * StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
	 * encryptor.setAlgorithm("PBEWithMD5AndDES");
	 * encryptor.setPassword(System.getenv("CAMEL_ENCRYPTION_PASSWORD")); return
	 * encryptor; }
	 */
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootSampleApplication.class, args);
	}
}
