package service;

import org.springframework.stereotype.Service;

import dto.AccountDto;
import entity.Account;
import repository.AccountRepo;

@Service
public class AccountServiceImpl implements AccountService{
	
	private AccountRepo accountrepo;

	@Override
	public Account createAccount(AccountDto accountdto) {
		return null;
	}

}
