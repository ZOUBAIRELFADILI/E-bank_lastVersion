package org.mundia.ebank_lastversion_backend.repositories;

import org.mundia.ebank_lastversion_backend.entities.BankAccount;
import org.mundia.ebank_lastversion_backend.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount,String> {
}
