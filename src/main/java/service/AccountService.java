package service;

import dto.AccountDto;
import entity.Account;

public interface AccountService {
	
	Account createAccount(AccountDto account);

}
