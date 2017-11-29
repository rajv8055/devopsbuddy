package com.devopsbuddy.utils;

import com.devopsbuddy.backend.persistence.domain.backend.User;

public class UserUtils {

    private UserUtils() {
        throw new AssertionError("Non instantiable");
    }

    public static User createBasicUser(String username, String email) {

        User user = new User ();
        user.setUsername(username);
        user.setPassword("secret");
        user.setEmail(email);
        user.setFirstName("firstName");
        user.setLastName("lastName");
        user.setPhoneNumber("123456789123");
        user.setCountry("USA");
        user.setEnabled(true);
        user.setDescription("A basic User");
        user.setProfileImageUrl("https://blabla.images.com/basicUser");
        return user;

    }
}
