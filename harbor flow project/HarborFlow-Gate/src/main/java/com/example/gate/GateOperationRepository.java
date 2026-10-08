package com.example.gate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository public interface GateOperationRepository extends JpaRepository<GateOperation,Integer> {}
