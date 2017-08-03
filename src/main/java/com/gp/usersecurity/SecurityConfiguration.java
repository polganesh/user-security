package com.gp.usersecurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@Configuration //indicates it is configuration class. these classes loaded at application startup
@EnableWebSecurity //security based annotation tells spring to enable web security for web application.
@EnableGlobalMethodSecurity (prePostEnabled=true)
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	/**
	 * For Simplicity We are adding in memory authentication but for real life it is better to use OAUTH or db authentication.
	 * @param builder
	 * @throws Exception
	 */
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder builder) throws Exception {
		builder.inMemoryAuthentication().withUser("ganesh").password("myauthenticationTest").roles("USER").and()
				.withUser("Admin").password("adminpassword").roles("USER", "ADMIN");
		;
	}

}
