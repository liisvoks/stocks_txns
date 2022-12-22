package ee.stock_txns.business;


import ee.stock_txns.business.dto.AccountResponse;
import ee.stock_txns.domain.account.Account;
import ee.stock_txns.domain.account.AccountMapper;
import ee.stock_txns.domain.account.AccountRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AccountService {

    @Resource
    AccountRepository accountRepository;
    @Resource
    AccountMapper accountMapper;

    public List<AccountResponse> findAllAccountsBy(Integer userId) {
        List<Account> accounts = accountRepository.findAllAccountsBy(userId);
        List<AccountResponse> accountResponses = accountMapper.toAccountResponses(accounts);
        return accountResponses;
    }
}
