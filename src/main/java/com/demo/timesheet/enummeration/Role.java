package com.demo.timesheet.enummeration;

import static com.demo.timesheet.Constant.Authority.ADMIN_AUTHORITIES;
import static com.demo.timesheet.Constant.Authority.USER_AUTHORITIES;
import static com.demo.timesheet.Constant.Authority.MANAGER_AUTHORITIES;

public enum Role {
    ROLE_USER(USER_AUTHORITIES),  ROLE_MANAGER(MANAGER_AUTHORITIES),
    ROLE_ADMIN(ADMIN_AUTHORITIES);

    private String[] authorities;

    Role(String... authorities) {
        this.authorities = authorities;
    }

    public String[] getAuthorities() {
        return authorities;
    }
    }
