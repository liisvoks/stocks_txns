package ee.stock_txns.domain.transaction;

import ee.stock_txns.business.dto.TransactionInfo;
import ee.stock_txns.business.dto.TransactionResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface TransactionMapper {
    @Mapping(source = "currencyId", target = "currency.id")
    @Mapping(source = "accountId", target = "account.id")
    Transaction toTransaction(TransactionInfo transactionInfo);

    @Mapping(source = "currency.id", target = "currencyId")
    @Mapping(source = "id", target = "transactionId")
    @Mapping(source = "currency.name", target = "currencyName")
    @Mapping(source = "account.id", target = "accountId")
    @Mapping(source = "account.name", target = "accountName")
    TransactionResponse toTransactionResponse(Transaction transaction);

    List<TransactionResponse> toTransactionResponses(List<Transaction> transactions);

}

//
//    private Integer transactionId;
//    private Integer currencyId;
//    @Size(max = 10)
//    @NotNull
//    private String currencyName;
//    private Integer accountId;
//    @Size(max = 50)
//    @NotNull
//    private String accountName;
//    @NotNull
//    private LocalDate date;
//    @Size(max = 5)
//    @NotNull
//    private String ticker;
//    @Size(max = 10)
//    @NotNull
//    private String type;
//    @NotNull
//    private BigDecimal price;
//    @NotNull
//    private Integer amount;
//    private BigDecimal fee;
//    private BigDecimal tax;