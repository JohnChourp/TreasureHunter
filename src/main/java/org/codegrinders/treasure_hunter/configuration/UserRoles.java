package org.codegrinders.treasure_hunter.configuration;

import com.google.common.collect.Sets;

import java.util.Set;

import static org.codegrinders.treasure_hunter.configuration.UserAuthorities.*;

public enum UserRoles {
    //TODO check these authorities
    ADMIN(Sets.newHashSet(MARKER_GET,MARKER_POST,PUZZLE_GET, PUZZLE_POST,USER_GET,USER_POST)),
    PLAYER(Sets.newHashSet(MARKER_GET,PUZZLE_GET,PUZZLE_POST,USER_GET,USER_POST));

    private final Set<UserAuthorities> authorities;

    UserRoles(Set<UserAuthorities> authorities) {
        this.authorities=authorities;
    }
}
