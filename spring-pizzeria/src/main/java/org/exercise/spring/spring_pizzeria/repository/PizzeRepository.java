package org.exercise.spring.spring_pizzeria.repository;

import java.util.List;

import org.exercise.spring.spring_pizzeria.model.Pizze;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PizzeRepository extends JpaRepository<Pizze, Integer> {
    public List<Pizze> findByNome(String nome);

}
