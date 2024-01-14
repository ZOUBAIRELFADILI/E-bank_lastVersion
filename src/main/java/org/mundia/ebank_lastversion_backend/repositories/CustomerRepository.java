package org.mundia.ebank_lastversion_backend.repositories;

import org.mundia.ebank_lastversion_backend.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
