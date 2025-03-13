package service;

import dto.AccountDto;
import entity.Account;

public interface AccountService {
	
	//Account createAccount(Account account);

	AccountDto createAccount(AccountDto accountdto);
	
	AccountDto getAccountById(Long id);
	
	AccountDto deposit(Long id, double balance);

}
