package com.anv.accountservice.repository;

import com.anv.accountservice.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountServiceRepostiory extends JpaRepository<Account,Long> {


}
