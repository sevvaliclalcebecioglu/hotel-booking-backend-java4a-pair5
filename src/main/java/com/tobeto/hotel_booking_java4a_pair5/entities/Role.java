package com.tobeto.hotel_booking_java4a_pair5.entities;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
    USER,
    ADMIN,
    MANAGER;

    @Override
    public String getAuthority() {
        return name();
    }
}