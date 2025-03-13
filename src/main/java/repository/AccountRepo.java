package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.Account;
import jakarta.persistence.Id;

public interface AccountRepo extends JpaRepository <Account,Long>{

}