package com.greyson.gycptest.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.greyson.gycptest.comm.SecurityProperties;
import com.greyson.gycptest.validate.ValidateCodeSecurityConfig;
@Configuration
public class BrowerSecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private SecurityProperties securityProperties;
    
    @Autowired
    private ValidateCodeSecurityConfig validateCodeSecurityConfig;
    
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        
        http.apply(validateCodeSecurityConfig)
        .and()
        .formLogin()                    //  定义当需要用户登录时候，转到的登录页面。
        .loginPage("/login.html")
        .loginProcessingUrl("/user/login")
        .and()
        .authorizeRequests()        // 定义哪些URL需要被保护、哪些不需要被保护
        .antMatchers("/login.html").permitAll()//所有人都可以访问 
        .anyRequest()               // 任何请求,登录后可以访问
        .authenticated()
        .and()
        .csrf().disable();//Invalid CSRF token found for ...关闭内置的csrf Post请求会需要带token才可以访问而请求为GET|HEAD|TRACE|OPTIONS时则不开启
    }
    
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
    

}
