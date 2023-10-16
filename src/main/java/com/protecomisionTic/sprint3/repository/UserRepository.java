package com.protecomisionTic.sprint3.repository;

import com.protecomisionTic.sprint3.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {
}
