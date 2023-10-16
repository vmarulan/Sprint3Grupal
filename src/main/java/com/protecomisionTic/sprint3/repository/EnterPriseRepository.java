package com.protecomisionTic.sprint3.repository;

import com.protecomisionTic.sprint3.entity.Enterprises;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnterPriseRepository extends JpaRepository<Enterprises, Integer> {
}
