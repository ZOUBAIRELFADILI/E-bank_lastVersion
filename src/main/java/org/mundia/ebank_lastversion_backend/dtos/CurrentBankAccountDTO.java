package org.mundia.ebank_lastversion_backend.dtos;


import lombok.Data;
import org.mundia.ebank_lastversion_backend.entities.BankAccount;
import org.mundia.ebank_lastversion_backend.enums.AccountStatus;

import java.util.Date;

@Data
public class CurrentBankAccountDTO extends BankAccountDTO {
    private String id;
    private double balance;
    private Date createdAt;
    private AccountStatus status;
    private CustomerDTO customerDTO;
    private double overDraft;
}
