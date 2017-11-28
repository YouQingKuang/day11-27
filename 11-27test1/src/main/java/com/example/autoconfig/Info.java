package com.example.autoconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("myInfo")
public class Info {
	@Value("${spring.application.name}")
	private String appName;

	@Value("${app.count}")
	private int count;

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "Info [appName=" + appName + ", count=" + count + "]";
	}

}
