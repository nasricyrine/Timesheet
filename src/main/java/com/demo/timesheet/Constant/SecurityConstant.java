package com.demo.timesheet.Constant;

public class SecurityConstant {
    public static final long EXPIRATION_TIME = 432_000_000; //5days expressed in milliseconds
    public static final String TOKEN_PREFIX = "Bearer"; // who ever give me the verification I don't have to go further
    public static final String JWT_TOKEN_HEADER = "Jwt-Token";
    public static final String TOKEN_CANNOT_BE_VERIFIED = "Token Cannot Be Verified";
    public static final String GET_ARRAYS_LLC = "Get Arrays, LLC";
    public static final String GET_ARRAYS_ADMINISTRATION = "User Management Portal ";
    public static final String AUTHORITIES = "authorities";
    public static final String FORBIDDEN_MESSAGE = "You need to  log in to access to  this page";
    public static final String ACCESS_DENIED_MESSAGE ="You don't have permission to access to this page";
    public static final String OPTIONS_HTTP_METHOD = "Options";
    public static final String [] PUBLIC_URLS ={"/user/login", "/user/register", "/user/resetpassword/**", "user/image/**" };
}
