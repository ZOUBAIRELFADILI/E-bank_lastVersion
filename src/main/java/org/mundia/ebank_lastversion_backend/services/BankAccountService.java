package org.mundia.ebank_lastversion_backend.services;

import org.mundia.ebank_lastversion_backend.dtos.*;
import org.mundia.ebank_lastversion_backend.entities.BankAccount;
import org.mundia.ebank_lastversion_backend.entities.CurrentAccount;
import org.mundia.ebank_lastversion_backend.entities.Customer;
import org.mundia.ebank_lastversion_backend.entities.SavingAccount;
import org.mundia.ebank_lastversion_backend.exceptions.BalanceNotSufficentException;
import org.mundia.ebank_lastversion_backend.exceptions.BankAccountNotFoundException;
import org.mundia.ebank_lastversion_backend.exceptions.CustomerNotFoundException;

import java.util.List;

public interface BankAccountService {
    CustomerDTO saveCustomer(CustomerDTO customerDTO);
    CurrentBankAccountDTO saveCurrentBankAccount(double initialBalance, double overDraft, Long customerId) throws CustomerNotFoundException;
    SavingBankAccountDTO saveSavingBankAccount(double initialBalance, double intersetRate, Long customerId) throws CustomerNotFoundException;
    List<CustomerDTO> listCustomers();
    BankAccountDTO getBankAccount(String accountId) throws BankAccountNotFoundException;
    void debit(String accountId, double amount, String desctription) throws BankAccountNotFoundException, BalanceNotSufficentException;
    void credit(String accountId, double amount, String desctription) throws BankAccountNotFoundException;
    void transfer(String accountIdSource, String accountIdDestination, double amount) throws BankAccountNotFoundException, BalanceNotSufficentException;

    //definie une methode que n'exist pas dans interface
    List<BankAccountDTO> bankAccountList();

    CustomerDTO getCustomer(Long customerId) throws CustomerNotFoundException;

    CustomerDTO updateCustomer(CustomerDTO customerDTO);

    void deletCustomer(Long cutomerId);

    //Ajouter cette methode a interface
    List<AccountOperationDTO> accountHistory(String accountId);

    AccountHistoryDTO getAccountHistory(String accountId, int page, int size) throws BankAccountNotFoundException;
}
