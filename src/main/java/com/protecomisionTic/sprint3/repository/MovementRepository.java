package com.protecomisionTic.sprint3.repository;

import com.protecomisionTic.sprint3.entity.Movements;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovementRepository extends JpaRepository<Movements, Integer> {
}
