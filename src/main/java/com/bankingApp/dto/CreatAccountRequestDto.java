package com.bankingApp.dto;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
public class CreatAccountRequestDto {
    private String accountName;
    private double balance;

}
