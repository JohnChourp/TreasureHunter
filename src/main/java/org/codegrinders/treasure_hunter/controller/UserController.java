package org.codegrinders.treasure_hunter.controller;

import org.codegrinders.treasure_hunter.model.User;
import org.codegrinders.treasure_hunter.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/")
    public List<User> getAllUsers() {
        return userService.findAll();
    }

    @GetMapping(value = "/{id}")
    public Optional<User> getUser(@PathVariable String id) {
        return userService.findById(id);

    }

    @GetMapping(value = "/login")
    public User loginUser(@RequestParam("username") String username, @RequestParam("password") String password) {

        if (userService.loginApproval(username, password)) {
            return new User(userService.getUserByUsername(username).getId(), userService.getUserByUsername(username).getUsername(), userService.getUserByUsername(username).getPoints());
        }

        return new User();
    }

    @PostMapping(value = "/")
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @PutMapping(value = "/")
    private User updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") String id) {
        userService.delete(id);
    }

}

