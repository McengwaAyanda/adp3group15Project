package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.Order;

import java.util.List;

/*
 * Author: Ayanda Mcengwa
 * Student No: 218335989
 * Subject: Applications development practice 3
 * Term 4 Submission
 * This is the Order Repository layer and acts as a Database
 * due date: 22/10/2023
 * */
@Repository
public interface IOrderRepository extends JpaRepository<Order, String> {
    List<Order> getAll();
}
