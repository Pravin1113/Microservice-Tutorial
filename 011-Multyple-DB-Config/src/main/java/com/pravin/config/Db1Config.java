package com.pravin.config;

import java.util.HashMap;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef = "entityManagerFactory",
basePackages = {
		"com.pravin.db1.entity"
})


public class Db1Config {
	
	@Primary
	@Bean(name="dataSource")
	@ConfigurationProperties(prefix = "spring.db1.datasource")
	public DataSource dataSource(){
		return DataSourceBuilder.create().build();
	}
	
	public LocalContainerEntityManagerFactoryBean entityManagerFactory(EntityManagerFactoryBuilder builder, 
			@Qualifier("dataSource") DataSource dataSource) {
		
		HashMap<String, Object> properties= new HashMap<>();
		properties.put("hibernate.hbm2ddl.auto","update");
		
		return builder.dataSource(dataSource)
				.properties(properties)
				.packages("com.pravin.db1.entity")
				.persistenceUnit("db1")
				.build();
		
	}
	
	public PlatformTransactionManager transactionManager(@Qualifier("entityManagerFactory") EntityManagerFactory entityManagerFactory) {
		return transactionManager(entityManagerFactory);	}
}
