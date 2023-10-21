package za.ac.cput.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.SuppPickupAddress;
import za.ac.cput.domain.Supplier;

import java.util.List;
import java.util.Set;
/*
 * Author: Ayanda Mcengwa
 * Student No: 218335989
 * Subject: Applications development practice 3
 * Term 4 Submission
 * This is the Supplier Repository interface acts as a Database
 * due date: 22/10/2023
 * */
@Repository
public interface ISupplierRepository extends JpaRepository<Supplier, String> {
    List<Supplier> getAll();
}
