package com.maruthi.springdata.transactionmanagement.repos;

import org.springframework.data.repository.CrudRepository;

import com.maruthi.springdata.transactionmanagement.entities.BankAccount;

public interface BankAccountRepository extends CrudRepository<BankAccount, Integer> {
	// functions

}
