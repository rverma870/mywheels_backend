package com.mywheels.Helper;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ConfigurationProperties(prefix = "cloud.aws.credentials")
@Configuration
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Test {

    @Value("${cloud.aws.credentials.access-key}")
	public String accesskey ;
    
}

