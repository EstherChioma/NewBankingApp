package com.bankingApp.models;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
//@Table(name = "account")
//@Column(insertable=false, updatable=false)

public class Account {



    @Id
    @GeneratedValue(strategy =   GenerationType.IDENTITY)
    private Long id;
    private String accountName;
    private double balance;

}
