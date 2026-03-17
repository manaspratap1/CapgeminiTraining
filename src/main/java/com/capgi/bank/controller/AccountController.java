package com.capgi.bank.controller;

import com.capgi.bank.constants.AccountConstant;
import com.capgi.bank.entity.dto.AccountDto;
import com.capgi.bank.entity.dto.ResponseDto;
import com.capgi.bank.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/account")
@RequiredArgsConstructor
public class AccountController {

    private final AccountService accountService;

    @PostMapping("/create")
    public ResponseEntity<ResponseDto> createAccount(@RequestBody AccountDto accountDto){
        accountService.createAccount(accountDto);

        return ResponseEntity.status(HttpStatus.CREATED).body(new ResponseDto(AccountConstant.STATUS_201, AccountConstant.MESSAGE_201));
    }

    @GetMapping
    public String hello(){
        return "Hello working boot!!";
    }

}
