package com.luana.course.repositories;

import com.luana.course.entities.Category;
import com.luana.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
