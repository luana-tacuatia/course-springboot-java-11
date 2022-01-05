package com.luana.course.repositories;

import com.luana.course.entities.OrderItem;
import com.luana.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
