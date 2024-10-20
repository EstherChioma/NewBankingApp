package com.bankingApp.service.impl;

import com.bankingApp.dto.AccountDto;
import com.bankingApp.dto.CreatAccountRequestDto;
import com.bankingApp.mapper.AccountMapper;
import com.bankingApp.models.Account;
import com.bankingApp.repository.AccountRepository;
import com.bankingApp.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@Service
public class AccountServiceImpl implements AccountService {


    private AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public AccountDto createAccount (CreatAccountRequestDto creatAccountRequestDto) {
        log.info("request to create account {} ", creatAccountRequestDto);

        Account account = new Account();
        account.setAccountName(creatAccountRequestDto.getAccountName());
        account.setBalance(creatAccountRequestDto.getBalance());

         account = accountRepository.save(account);
        log.info("successfully saved account {} ", account);

        AccountDto accountDto = new AccountDto();
        accountDto.setAccountName(account.getAccountName());
        accountDto.setBalance(account.getBalance());

        return accountDto;
    }



    @Override
    public AccountDto getAccountById(long id) {

        Optional<Account> account = accountRepository.findById(id);
        return   AccountMapper.mapToAccountDto(account);
    }

    @Override
    public AccountDto deposit(Long id, double amount) {
        return null;
    }
}
