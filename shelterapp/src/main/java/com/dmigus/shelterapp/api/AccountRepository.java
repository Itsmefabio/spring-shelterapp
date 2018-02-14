package com.dmigus.shelterapp.api;

import com.dmigus.shelterapp.beans.Account;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account, Long> {
}
