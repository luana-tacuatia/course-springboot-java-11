package com.luana.course.repositories;

import com.luana.course.entities.Order;
import com.luana.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
