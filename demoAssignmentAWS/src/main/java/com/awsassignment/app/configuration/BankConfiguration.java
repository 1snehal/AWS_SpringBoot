package com.awsassignment.app.configuration;
import java.util.Properties;
import javax.sql.DataSource;
import org.hibernate.jpa.HibernatePersistenceProvider;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import com.awsassignment.app.pojo.Bank;
@Configuration
@ComponentScan(basePackages = {"com.awsassignment.app.dao","com.awsassignment.app.service"})
@EnableTransactionManagement
@EnableAutoConfiguration
@PropertySource("classpath:application.properties")
public class BankConfiguration {
	@Value("${spring.jpa.database-platform}")
	String hinernate_dilect;
	@Value("${spring.jpa.show-sql}")
	String hibernate_sql;
	@Value("${spring.datasource.username}")
	String usernames;
	@Value("${spring.datasource.password}")
	String passwords;
	@Value("${spring.datasource.url}")
	String urls;
	@Value("${spring.datasource.driver-class-name}")
	String driver_name;
	@Bean
	public Bank bankcreate() {
		return new Bank();
	}
	@Bean 
	PlatformTransactionManager orderTransactionManager() {
		return new JpaTransactionManager(orderEntityManagerFactory().getObject()); 
	}
	@Bean 
	LocalContainerEntityManagerFactoryBean orderEntityManagerFactory() {
		LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();
		factoryBean.setDataSource(BookDataSource());
		factoryBean.setPersistenceProviderClass(HibernatePersistenceProvider.class);
		factoryBean.setPackagesToScan(BankConfiguration.class.getPackage().getName());
		factoryBean.setJpaProperties(hibernateproperties());
		return factoryBean; 
	}
	@Bean
	public Properties hibernateproperties() {
		Properties p=new Properties();
		p.put(p,hinernate_dilect);
		p.put(p, hibernate_sql);
		return p;
	}
	@Bean
	@Primary
	public DataSource BookDataSource() {
		return DataSourceBuilder.create() .username(usernames) .password(passwords) .url(urls) .driverClassName(driver_name) .build();
	}
}
