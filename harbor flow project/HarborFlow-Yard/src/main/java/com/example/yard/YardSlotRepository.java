package com.example.yard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository public interface YardSlotRepository extends JpaRepository<YardSlot,Integer> {}
