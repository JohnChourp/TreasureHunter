package org.codegrinders.treasure_hunter.configuration;

public enum UserAuthorities {

    PUZZLE_GET("puzzle:get"),
    PUZZLE_POST("puzzle:post"),
    MARKER_GET("marker:get"),
    MARKER_POST("marker:post"),
    USER_GET("user:get"),
    USER_POST("user:post");

    private final String authority;

    UserAuthorities(String authority) {
        this.authority = authority;
    }

    public String getAuthority(){
        return authority;
    }
}
