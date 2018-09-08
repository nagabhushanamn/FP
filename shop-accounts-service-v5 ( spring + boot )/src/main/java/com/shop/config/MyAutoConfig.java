package com.shop.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;

import com.shop.accounts.model.Account;

@Configuration
@ConditionalOnProperty(prefix = "my", name = "custom")
public class MyAutoConfig {

	// @Bean methods.....

}
