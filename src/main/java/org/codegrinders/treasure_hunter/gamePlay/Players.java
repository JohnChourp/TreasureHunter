package org.codegrinders.treasure_hunter.gamePlay;

import org.codegrinders.treasure_hunter.model.User;

import java.util.ArrayList;
import java.util.List;


public class Players {
    public static List<User> players = new ArrayList<>();

    public List<User> getPlayers() {
        return players;
    }


    public void setPlayers(List<User> players) {
        Players.players = players;
    }

    public void addPlayer(User user){
        players.add(user);
    }
}
