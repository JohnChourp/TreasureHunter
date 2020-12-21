package org.codegrinders.treasure_hunter.repository;

import org.codegrinders.treasure_hunter.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserRepository extends MongoRepository<User, String> {

    boolean existsByUsername(String username);

    User findUserByUsername(String username);


    User findUserByEmail(String email);

    @Query(fields = "{'_id' : 0, 'username' : 1, 'points' : 1}")
    List<User> findAllByOrderByPointsDesc();
}
