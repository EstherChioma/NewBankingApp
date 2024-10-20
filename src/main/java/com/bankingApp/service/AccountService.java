package com.bankingApp.service;

import com.bankingApp.dto.AccountDto;
import com.bankingApp.dto.CreatAccountRequestDto;
import com.bankingApp.models.Account;
import org.springframework.stereotype.Service;

@Service
public interface AccountService {


    AccountDto createAccount(CreatAccountRequestDto creatAccountRequestDto);

    AccountDto getAccountById(long id);

    AccountDto deposit(Long id, double amount);


}
