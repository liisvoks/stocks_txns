package ee.stock_txns.business.dto;

import ee.stock_txns.domain.transaction.Transaction;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * A DTO for the {@link Transaction} entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionInfo implements Serializable {
    private Integer currencyId;
    private Integer accountId;
    @NotNull
    private LocalDate date;
    @Size(max = 5)
    @NotNull
    private String ticker;
    @Size(max = 10)
    @NotNull
    private String type;
    @NotNull
    private BigDecimal price;
    @NotNull
    private Integer amount;
    private BigDecimal fee;
    private BigDecimal tax;
}