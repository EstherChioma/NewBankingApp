package com.bankingApp.mapper;

import com.bankingApp.dto.AccountDto;
import com.bankingApp.dto.CreatAccountRequestDto;
import com.bankingApp.models.Account;

import java.util.Optional;

public class AccountMapper {

    public static Account mapToAccount(CreatAccountRequestDto creatAccountRequestDto) {

        Account account = new Account();
        account.setAccountName(creatAccountRequestDto.getAccountName());
        account.setBalance(creatAccountRequestDto.getBalance());
        return account;
    }

    public static AccountDto mapToAccountDto(Account account) {
        AccountDto accountDto = new AccountDto();
        accountDto.setAccountName(account.getAccountName());
        accountDto.setBalance(account.getBalance());
        return accountDto;
    }

    public static AccountDto mapToAccountDto(Optional<Account> account) {
        return null;
    }
}
