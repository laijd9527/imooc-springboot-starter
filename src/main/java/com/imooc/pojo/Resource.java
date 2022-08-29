
package com.imooc.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration											//代表public class Resource会引用资源文件
@ConfigurationProperties(prefix="com.imooc.opensource")//添加前缀，这一段表示所要加载的前缀，最终映射时只会把前缀后面的字段映射到资源的字段里去
@PropertySource(value = "classpath:application.properties")//设置资源文件的一个source，地址设置为classpath下的application.properties

public class Resource {
	private String name;
	private String webseite;
	private String language;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWebseite() {
		return webseite;
	}
	public void setWebseite(String webseite) {
		this.webseite = webseite;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	
}
