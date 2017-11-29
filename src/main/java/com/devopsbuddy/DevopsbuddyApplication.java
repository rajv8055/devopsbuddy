package com.devopsbuddy;

import com.devopsbuddy.backend.persistence.domain.backend.Role;
import com.devopsbuddy.backend.persistence.domain.backend.User;
import com.devopsbuddy.backend.persistence.domain.backend.UserRole;
import com.devopsbuddy.backend.service.UserService;
import com.devopsbuddy.enums.PlansEnum;
import com.devopsbuddy.enums.RolesEnum;
import com.devopsbuddy.utils.UserUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.util.HashSet;
import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

        @SpringBootApplication
        public class DevopsbuddyApplication implements CommandLineRunner{

        private static final Logger LOG= LoggerFactory.getLogger(DevopsbuddyApplication.class);

        @Autowired
        private UserService userService;

        public static void main(String[] args) {
            SpringApplication.run(DevopsbuddyApplication.class, args);
        }

        @Override
        public void run(String... strings) throws Exception {

            String username="proUser";
            String email ="proUser@devopsbuddy.com";

            User user = UserUtils.createBasicUser(username, email);
            Set<UserRole> userRoles = new HashSet<>();
            userRoles.add(new UserRole(user, new Role(RolesEnum.BASIC)));
            LOG.debug("creating user with userName{}", user.getUsername());
            userService.createUser(user, PlansEnum.PRO, userRoles);
            LOG.info("user {} created", user.getUsername());

        }
    }