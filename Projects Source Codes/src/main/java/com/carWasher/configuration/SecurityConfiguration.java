package com.carWasher.configuration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
//clase para customizar la seguridad
@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Autowired
	private UserDetailsService userDetailsService;
	
	@Autowired
	private DataSource dataSource;
	
	//Aqui se customiza la seguridad en los request
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		//permitir todos los request a los siguientes patrones de url
		http.authorizeRequests().antMatchers("/actuator/*", "/login.html", "/h2-console/**").permitAll();
		//Para el resto de patrones url, tiene que estar autenticado
		http.authorizeRequests().anyRequest().authenticated();
		//Redireccionar a la pagina del login cuando no este autenticado.
		//Se registra la pagina del login, el proceso de login y la pagina del login cuando falla
		http.formLogin().loginPage("/login.html").loginProcessingUrl("/login")
				.failureForwardUrl("/login.html?loginFailed=true");
		http.rememberMe().userDetailsService(userDetailsService);
		//Validacion de la autorizacion mediante token = csrf
		http.csrf().disable();
		http.headers().frameOptions().disable();
	}
	//autenticaion con usuario de la base de datos
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.jdbcAuthentication().dataSource(dataSource);
	}
	
}
