package com.manthan.expensetracker;

import com.manthan.expensetracker.Filters.AuthFilter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import ch.qos.logback.core.filter.Filter;

@SpringBootApplication
public class ExpenseTrackerApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExpenseTrackerApiApplication.class, args);}
	
		@Bean
		public FilterRegistrationBean<AuthFilter> filterRegistrationBean(){
			FilterRegistrationBean<AuthFilter> registrationBean = new FilterRegistrationBean<>();
			AuthFilter authFilter = new AuthFilter();
			registrationBean.setFilter(authFilter);
			registrationBean.addUrlPatterns("/api/categories/*");
			return registrationBean;
		}

}
