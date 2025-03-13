package service;

import java.util.List;

import dto.AccountDto;
import entity.Account;

public interface AccountService {
	
	//Account createAccount(Account account);

	AccountDto createAccount(AccountDto accountdto);
	
	AccountDto getAccountById(Long id);
	
	AccountDto deposit(Long id, double amount);
	
	AccountDto withdraw (Long id, double amount);
	
	List<AccountDto> getAllAccounts();
	
	void deleteAccount(Long id);

}
