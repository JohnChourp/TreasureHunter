package org.codegrinders.treasure_hunter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TreasureHunterApplication {
    private static String savedUsername="user1";
    private static String savedPassword="1234567890";

    public static void main(String[] args) {
        SpringApplication.run(TreasureHunterApplication.class, args);
    }
    public static void profileLogin(String username, String password){
        if(username.equals(savedUsername) && password.equals(savedPassword))
            System.out.println("You have successfully logged in to the game");
        else
            System.out.println("Wrong username or password");
    }

}
