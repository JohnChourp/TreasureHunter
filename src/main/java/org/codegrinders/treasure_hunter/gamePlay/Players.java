package org.codegrinders.treasure_hunter.gamePlay;

import org.codegrinders.treasure_hunter.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Players {
    private List<User> players = new ArrayList<>();

    public List<User> getPlayers() {
        return players;
    }


    public void setPlayers(List<User> listPlayers) {
        players = listPlayers;
    }

    public void addPlayer(User user){
        players.add(user);
    }
}
