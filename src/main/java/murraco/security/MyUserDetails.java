package murraco.security;

import murraco.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import murraco.model.User;
import murraco.repository.UserRepository;

import java.util.Collections;

@Service
public class MyUserDetails implements UserDetailsService {

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {


    return org.springframework.security.core.userdetails.User//
            .withUsername(username)//
            .password("pwd")//
            .authorities(Collections.singletonList(Role.ROLE_ADMIN))//
            .accountExpired(false)//
            .accountLocked(false)//
            .credentialsExpired(false)//
            .disabled(false)//
            .build();
  }

}
