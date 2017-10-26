package com.officedepot.eai.data;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;


@ConfigurationProperties("as400.datasource")
public class ODDataSource {
	
	private String serverName;
	private String naming; 
	private String userName;
	private String password; 
	private String driver;
	private String schemaName; 
	private String dataSourceName; 
	private Boolean trace;
	private String jdbcUrl; 
	
	@Bean
	public DataSource dataSource() {
		/**
		 * @author Michael-Costello
		 * TODO set init sql and other connection properties 
		 */
		BasicDataSource dataSource = new BasicDataSource(); 
		dataSource.setUrl(jdbcUrl);
		//dataSource.setDefaultCatalog(schemaName);
		dataSource.setDriverClassName(driver);
		dataSource.setUsername(userName);
		dataSource.setPassword(password);
		dataSource.setValidationQuery("SELECT 1 FROM sysibm.sysdummy1");
		return dataSource;
	}


	public String getServerName() {
		return serverName;
	}


	public void setServerName(String serverName) {
		this.serverName = serverName;
	}


	public String getNaming() {
		return naming;
	}


	public void setNaming(String naming) {
		this.naming = naming;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getDriver() {
		return driver;
	}


	public void setDriver(String driver) {
		this.driver = driver;
	}


	public String getSchemaName() {
		return schemaName;
	}


	public void setSchemaName(String schemaName) {
		this.schemaName = schemaName;
	}


	public String getDataSourceName() {
		return dataSourceName;
	}


	public void setDataSourceName(String dataSourceName) {
		this.dataSourceName = dataSourceName;
	}


	public Boolean getTrace() {
		return trace;
	}


	public void setTrace(Boolean trace) {
		this.trace = trace;
	}


	public String getJdbcUrl() {
		return jdbcUrl;
	}


	public void setJdbcUrl(String jdbcUrl) {
		this.jdbcUrl = jdbcUrl;
	}
	
	 
	
}
