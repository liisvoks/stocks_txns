package ee.stock_txns.domain.transaction;

import ee.stock_txns.business.dto.TransactionInfo;
import ee.stock_txns.business.dto.TransactionResponse;
import ee.stock_txns.domain.account.Account;
import ee.stock_txns.domain.currency.Currency;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-16T16:10:51+0200",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Amazon.com Inc.)"
)
@Component
public class TransactionMapperImpl implements TransactionMapper {

    @Override
    public Transaction toTransaction(TransactionInfo transactionInfo) {
        if ( transactionInfo == null ) {
            return null;
        }

        Transaction transaction = new Transaction();

        transaction.setCurrency( transactionInfoToCurrency( transactionInfo ) );
        transaction.setAccount( transactionInfoToAccount( transactionInfo ) );
        transaction.setDate( transactionInfo.getDate() );
        transaction.setTicker( transactionInfo.getTicker() );
        transaction.setType( transactionInfo.getType() );
        transaction.setPrice( transactionInfo.getPrice() );
        transaction.setAmount( transactionInfo.getAmount() );
        transaction.setFee( transactionInfo.getFee() );
        transaction.setTax( transactionInfo.getTax() );

        return transaction;
    }

    @Override
    public TransactionResponse toTransactionResponse(Transaction transaction) {
        if ( transaction == null ) {
            return null;
        }

        TransactionResponse transactionResponse = new TransactionResponse();

        transactionResponse.setCurrencyId( transactionCurrencyId( transaction ) );
        transactionResponse.setTransactionId( transaction.getId() );
        transactionResponse.setCurrencyName( transactionCurrencyName( transaction ) );
        transactionResponse.setAccountId( transactionAccountId( transaction ) );
        transactionResponse.setAccountName( transactionAccountName( transaction ) );
        transactionResponse.setDate( transaction.getDate() );
        transactionResponse.setTicker( transaction.getTicker() );
        transactionResponse.setType( transaction.getType() );
        transactionResponse.setPrice( transaction.getPrice() );
        transactionResponse.setAmount( transaction.getAmount() );
        transactionResponse.setFee( transaction.getFee() );
        transactionResponse.setTax( transaction.getTax() );

        return transactionResponse;
    }

    @Override
    public List<TransactionResponse> toTransactionResponses(List<Transaction> transactions) {
        if ( transactions == null ) {
            return null;
        }

        List<TransactionResponse> list = new ArrayList<TransactionResponse>( transactions.size() );
        for ( Transaction transaction : transactions ) {
            list.add( toTransactionResponse( transaction ) );
        }

        return list;
    }

    protected Currency transactionInfoToCurrency(TransactionInfo transactionInfo) {
        if ( transactionInfo == null ) {
            return null;
        }

        Currency currency = new Currency();

        currency.setId( transactionInfo.getCurrencyId() );

        return currency;
    }

    protected Account transactionInfoToAccount(TransactionInfo transactionInfo) {
        if ( transactionInfo == null ) {
            return null;
        }

        Account account = new Account();

        account.setId( transactionInfo.getAccountId() );

        return account;
    }

    private Integer transactionCurrencyId(Transaction transaction) {
        if ( transaction == null ) {
            return null;
        }
        Currency currency = transaction.getCurrency();
        if ( currency == null ) {
            return null;
        }
        Integer id = currency.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String transactionCurrencyName(Transaction transaction) {
        if ( transaction == null ) {
            return null;
        }
        Currency currency = transaction.getCurrency();
        if ( currency == null ) {
            return null;
        }
        String name = currency.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    private Integer transactionAccountId(Transaction transaction) {
        if ( transaction == null ) {
            return null;
        }
        Account account = transaction.getAccount();
        if ( account == null ) {
            return null;
        }
        Integer id = account.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String transactionAccountName(Transaction transaction) {
        if ( transaction == null ) {
            return null;
        }
        Account account = transaction.getAccount();
        if ( account == null ) {
            return null;
        }
        String name = account.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }
}
