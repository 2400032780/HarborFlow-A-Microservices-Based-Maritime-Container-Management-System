package com.example.container;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository public interface ContainerRepository extends JpaRepository<Container,Integer> {}
