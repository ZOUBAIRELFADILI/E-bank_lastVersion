package org.mundia.ebank_lastversion_backend.dtos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.mundia.ebank_lastversion_backend.entities.BankAccount;
import org.mundia.ebank_lastversion_backend.enums.OperationType;

import java.util.Date;

@Data
public class AccountOperationDTO {
    private Long id;
    private Date operationDate;
    private double amount;
    private OperationType type;
    private String description;
}
//@Data : Getter&Setter @NoArgsConstructor: Constructor sans parameters @AllArgsConstructor: Constructor avec parameters
