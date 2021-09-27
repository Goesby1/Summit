package com.maruthi.springdata.hibernateinheritance.repos;

import org.springframework.data.repository.CrudRepository;

import com.maruthi.springdata.hibernateinheritance.entities.Payment;

public interface PaymentRepository extends CrudRepository<Payment, Integer> {

}
