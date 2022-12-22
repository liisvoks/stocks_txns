package ee.stock_txns.business;

import ee.stock_txns.business.dto.TransactionInfo;
import ee.stock_txns.business.dto.TransactionResponse;
import ee.stock_txns.domain.account.Account;
import ee.stock_txns.domain.account.AccountRepository;
import ee.stock_txns.domain.currency.Currency;
import ee.stock_txns.domain.currency.CurrencyRepository;
import ee.stock_txns.domain.transaction.Transaction;
import ee.stock_txns.domain.transaction.TransactionMapper;
import ee.stock_txns.domain.transaction.TransactionRepository;
import ee.stock_txns.domain.user.UserRepository;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class TransactionService {

    @Resource
    UserRepository userRepository;

    @Resource
    AccountRepository accountRepository;

    @Resource
    CurrencyRepository currencyRepository;

    @Resource
    TransactionRepository transactionRepository;

    @Resource
    TransactionMapper transactionMapper;

    public void addTransaction(TransactionInfo transactionInfo) {

        Transaction transaction = transactionMapper.toTransaction(transactionInfo);

        Optional<Account> accountOptional = accountRepository.findById(transactionInfo.getAccountId());
        Account account = accountOptional.get();

        Optional<Currency> currencyOptional = currencyRepository.findById(transactionInfo.getCurrencyId());
        Currency currency = currencyOptional.get();

        transaction.setAccount(account);
        transaction.setCurrency(currency);

        transactionRepository.save(transaction);






    }

    public List<TransactionResponse> getTransactionsBySorting(Integer accountId, Integer userId, LocalDate dateFrom, LocalDate dateTo, String type) {
        List<Transaction> transactions = transactionRepository.findBySortingParameters(accountId, userId, dateFrom, dateTo, type);
        List<TransactionResponse> transactionResponses = transactionMapper.toTransactionResponses(transactions);
        return transactionResponses;

    }
}
