package com.greyson.gycptest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.greyson.gycptest.util.LogUtil;
@Component
public class OwnUserDetailsService implements UserDetailsService {
    
    @Autowired
    private PasswordEncoder passwordEncoder;
    
    
    
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        LogUtil.info("用户的用户名: {}",username);
        String password = passwordEncoder.encode("123456");
        LogUtil.info("用户的密码: {}",password);
        User user = new User(username, password,
                AuthorityUtils.commaSeparatedStringToAuthorityList("admin"));
        return user;
    }
}
