package service;

import org.springframework.stereotype.Service;

import dto.AccountDto;
import entity.Account;
import mapper.AccountMapper;
import repository.AccountRepo;

@Service
public class AccountServiceImpl implements AccountService{
	
	private AccountRepo accountrepo;
	

	public AccountServiceImpl(AccountRepo accountrepo) {
		super();
		this.accountrepo = accountrepo;
	}


	@Override
	public AccountDto createAccount(AccountDto accountdto) {
		
		Account account = AccountMapper.mapToAccount(accountdto);
		Account savedAccount = accountrepo.save(account);
		
		return AccountMapper.maptoAccountDto(savedAccount);
	}


	@Override
	public AccountDto getAccountById(Long id) {
		
		Account account = accountrepo.findById(id).orElseThrow(() -> new RuntimeException("Account does not exist"));
		return AccountMapper.maptoAccountDto(account);
	}
	
	

}
