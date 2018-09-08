package com.shop.accounts.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@Component("myFeature")
@ConfigurationProperties(prefix = "my")
public class MyFeatureProperties {

	private Boolean featureEnabled;

	public Boolean getFeatureEnabled() {
		return featureEnabled;
	}

	public void setFeatureEnabled(Boolean featureEnabled) {
		this.featureEnabled = featureEnabled;
	}

}
