package com.example.demohibernateinheritance.repository;

import com.example.demohibernateinheritance.domain.Coordinatore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoordinatoreRepository extends JpaRepository<Coordinatore, Integer> {
}
