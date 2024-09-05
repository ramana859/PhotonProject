package org.example.repository;

import org.example.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OrderRepo extends JpaRepository<Order, Integer> {
/*    @Query(value = "SELECT * FROM mysql.orders u WHERE u.id =:id", nativeQuery = true)
    Optional<Order> findById(@Param("id") int id);*/
}
