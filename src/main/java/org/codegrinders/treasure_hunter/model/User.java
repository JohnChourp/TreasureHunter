package org.codegrinders.treasure_hunter.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;


@Document(collection = "users")
public class User {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Id private String id;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String email;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String username;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String password;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private int points;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private boolean hasWon;
    @JsonSerialize(using = ToStringSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private LocalDateTime dateCreated = LocalDateTime.now();

    @PersistenceConstructor
    public User(String id, String email, String username, String password, int points,LocalDateTime dateCreated,boolean hasWon){
        this.id = id;
        this.email = email;
        this.username = username;
        this.password = password;
        this.points = points;
        this.dateCreated = dateCreated;
        this.hasWon = hasWon;
    }

    public User(String email, String username, String password, int points, LocalDateTime dateCreated) {
        this.email = email;
        this.username = username;
        this.password = password;
        this.points = points;
        this.dateCreated = dateCreated;
    }

    public User(String email, String username, String password){
        this.email = email;
        this.username = username;
        this.password = password;
    }

    public User(String id, String username, int points) {
        this.id = id;
        this.username = username;
        this.points = points;
    }

    public User() {
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public boolean isHasWon() {
        return hasWon;
    }

    public void setHasWon(boolean hasWon) {
        this.hasWon = hasWon;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id +
                ", email='" + email +
                ", username='" + username +
                ", password='" + password +
                ", points=" + points +
                ", Won=" + hasWon +
                ", date=" + dateCreated +
                '}';
    }
}