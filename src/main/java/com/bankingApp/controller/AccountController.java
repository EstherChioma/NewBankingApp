package com.bankingApp.controller;

import com.bankingApp.dto.AccountDto;
import com.bankingApp.dto.CreatAccountRequestDto;
import com.bankingApp.service.AccountService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {

private AccountService accountService;

    public AccountController(AccountService accountService) {

        this.accountService= accountService;
    }


    //Add Account REST API

    @PostMapping("/create")
    public ResponseEntity<AccountDto> addAccount(@RequestBody CreatAccountRequestDto creatAccountRequestDto){

        return new ResponseEntity<>(accountService.createAccount(creatAccountRequestDto), HttpStatus.OK);
    }
}
