package com.cybertek.services;

import com.cybertek.entity.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SecurityService implements UserDetailsService {

    private final UserService userService;

    public SecurityService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {

        User foundedUser = loadUser(s);

        if (foundedUser == null) throw new UsernameNotFoundException("User Not Founded! " + s);

        return new org.springframework.security.core.userdetails.User(foundedUser.getUsername(), foundedUser.getPassword(), listAuthorities(foundedUser));

    }

    public User loadUser(String value){

        boolean isEmail = value.contains("@");
        return isEmail ? userService.readByEmail(value) : userService.readByUsername(value);

    }

    private List<GrantedAuthority> listAuthorities(User user){

        List<GrantedAuthority> grantedAuthorityList = new ArrayList<>();
        grantedAuthorityList.add(new SimpleGrantedAuthority(user.getRole().name()));
        return grantedAuthorityList;

    }

}
