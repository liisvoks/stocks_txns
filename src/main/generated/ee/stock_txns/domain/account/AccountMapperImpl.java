package ee.stock_txns.domain.account;

import ee.stock_txns.business.dto.AccountResponse;
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
public class AccountMapperImpl implements AccountMapper {

    @Override
    public Account toAccount(AccountResponse accountResponse) {
        if ( accountResponse == null ) {
            return null;
        }

        Account account = new Account();

        account.setId( accountResponse.getAccountId() );
        account.setName( accountResponse.getAccountName() );

        return account;
    }

    @Override
    public AccountResponse toAccountResponse(Account account) {
        if ( account == null ) {
            return null;
        }

        AccountResponse accountResponse = new AccountResponse();

        accountResponse.setAccountId( account.getId() );
        accountResponse.setAccountName( account.getName() );

        return accountResponse;
    }

    @Override
    public List<AccountResponse> toAccountResponses(List<Account> accounts) {
        if ( accounts == null ) {
            return null;
        }

        List<AccountResponse> list = new ArrayList<AccountResponse>( accounts.size() );
        for ( Account account : accounts ) {
            list.add( toAccountResponse( account ) );
        }

        return list;
    }
}
