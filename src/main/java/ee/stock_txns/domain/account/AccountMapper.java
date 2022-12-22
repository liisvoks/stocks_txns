package ee.stock_txns.domain.account;

import ee.stock_txns.business.dto.AccountResponse;
import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface AccountMapper {
    @Mapping(source = "accountId", target = "id")
    @Mapping(source = "accountName", target = "name")
    Account toAccount(AccountResponse accountResponse);


    @Mapping(source = "id", target = "accountId")
    @Mapping(source = "name", target = "accountName")
    AccountResponse toAccountResponse(Account account);

    List<AccountResponse> toAccountResponses (List<Account> accounts);

}
