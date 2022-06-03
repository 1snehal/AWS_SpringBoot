package com.book.configuration;
import java.util.Properties;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.hibernate.cfg.Environment;
import org.hibernate.jpa.HibernatePersistenceProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.book.dao.BookDao;
import com.book.dao.BookDaoImpl;
import com.book.pojo.Book;
import com.book.repository.BookRepository;
@Configuration
@PropertySource(value = { "classpath:application.properties" })
@EnableTransactionManagement
@EnableAutoConfiguration
@ComponentScan({"com.book.dao","com.book.service"})
public class BookConfiguration {
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
	public Book createbook() {
		return new Book();
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
		factoryBean.setPackagesToScan(BookConfiguration.class.getPackage().getName());
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
