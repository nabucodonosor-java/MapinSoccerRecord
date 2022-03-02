package com.mapin.soccerrecords.repositories;

import com.mapin.soccerrecords.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
}
