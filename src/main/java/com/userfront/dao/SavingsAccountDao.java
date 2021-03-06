package com.userfront.dao;

//import com.userfront.domain.SavingsAccount;
import com.userfront.model.SavingsAccount;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by z00382545 on 10/21/16.
 */
public interface SavingsAccountDao extends CrudRepository<SavingsAccount, Long> {

    SavingsAccount findByAccountNumber(int accountNumber);
}
