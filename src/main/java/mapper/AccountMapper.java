package mapper;

import dto.AccountDto;
import entity.Account;

/*
It provides two static methods to map between AccountDto and Account:

mapToAccount(AccountDto accountDto)

Converts an AccountDto into an Account entity.
Used when saving data to the database.
mapToAccountDto(Account account)

Converts an Account entity into an AccountDto.
Used when sending data from the database to external systems (e.g., APIs, UI).*/

public class AccountMapper {
	
	public static Account mapToAccount(AccountDto accountDto) {
		Account account = new Account(
				accountDto.getId(),
				accountDto.getName(),
				accountDto.getBalance()
			);
		return account;
	}
	
	public static AccountDto maptoAccountDto(Account account) {
		AccountDto accountDto = new AccountDto(
				account.getId(),
				account.getName(),
				account.getBalance()
				);
		return accountDto;
	}

}
