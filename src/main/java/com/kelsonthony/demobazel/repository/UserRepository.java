package com.kelsonthony.demobazel.repository;

import com.kelsonthony.demobazel.domain.User;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
