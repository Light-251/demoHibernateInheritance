package com.example.demohibernateinheritance.repository;

import com.example.demohibernateinheritance.domain.Operatore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OperatoreRepository extends JpaRepository<Operatore, Integer> {
}
