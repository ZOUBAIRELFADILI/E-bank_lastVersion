package org.mundia.ebank_lastversion_backend.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.mundia.ebank_lastversion_backend.enums.OperationType;

import java.util.Date;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class AccountOperation {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date operationDate;
    private double amount;
    @Enumerated(EnumType.STRING) //String : dans Base derd Donnes pur chaque type dans enum est string
    private OperationType type;
    @ManyToOne //plusieur operation pour un seule compte
    private BankAccount bankAccount;
    private String description;
}
//@Data : Getter&Setter @NoArgsConstructor: Constructor sans parameters @AllArgsConstructor: Constructor avec parameters
