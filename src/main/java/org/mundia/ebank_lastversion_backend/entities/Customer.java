package org.mundia.ebank_lastversion_backend.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Entity //pour le mapping
@Data
@NoArgsConstructor @AllArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    @OneToMany(mappedBy = "customer") //type de relation est One To Many
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY) //pour ne consulte pas Laliste des comptes , conulter just les client
    private List<BankAccount> bankAccounts;
}
