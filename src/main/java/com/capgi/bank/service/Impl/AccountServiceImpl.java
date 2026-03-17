package com.capgi.bank.service.Impl;

import com.capgi.bank.config.CustomMapper;
import com.capgi.bank.entity.Account;
import com.capgi.bank.entity.dto.AccountDto;
import com.capgi.bank.repository.AccountRepository;
import com.capgi.bank.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.DialectOverride;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;

    @Override
    public void createAccount(AccountDto accountDto){
        Account account = CustomMapper.mapAccountDtoToAccount(accountDto, new Account());
        accountRepository.save(account);
    }


}
