package org.mundia.ebank_lastversion_backend.web;


import lombok.AllArgsConstructor;
import org.mundia.ebank_lastversion_backend.dtos.AccountHistoryDTO;
import org.mundia.ebank_lastversion_backend.dtos.AccountOperationDTO;
import org.mundia.ebank_lastversion_backend.dtos.BankAccountDTO;
import org.mundia.ebank_lastversion_backend.entities.AccountOperation;
import org.mundia.ebank_lastversion_backend.enums.OperationType;
import org.mundia.ebank_lastversion_backend.exceptions.BankAccountNotFoundException;
import org.mundia.ebank_lastversion_backend.services.BankAccountService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BankAccountRestAPI {
    private BankAccountService  bankAccountService;

    public BankAccountRestAPI(BankAccountService bankAccountService){
        this.bankAccountService = bankAccountService;
    }

    @GetMapping("/accounts/{accountId}")
    public BankAccountDTO getBankAccount(@PathVariable String accountId) throws BankAccountNotFoundException {
        return bankAccountService.getBankAccount(accountId);

    }

    @GetMapping("/accounts")
    public List<BankAccountDTO> listAccountList(){
        return bankAccountService.bankAccountList();
    }

    @GetMapping("/accounts/{accountId}/operations")
    public List<AccountOperationDTO> getHistory(@PathVariable String accountId){
        return bankAccountService.accountHistory(accountId);
    }

    @GetMapping("/accounts/{accountId}/pageOperations")
    public AccountHistoryDTO getAccountHistory(@PathVariable String accountId,
                                               @RequestParam(name = "page",defaultValue = "0") int page,
                                               @RequestParam(name = "size", defaultValue = "5") int size) throws BankAccountNotFoundException {
       return bankAccountService.getAccountHistory(accountId,page,size);
    }


}
