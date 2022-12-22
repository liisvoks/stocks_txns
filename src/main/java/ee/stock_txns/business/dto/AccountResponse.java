package ee.stock_txns.business.dto;

import ee.stock_txns.domain.account.Account;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * A DTO for the {@link Account} entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountResponse implements Serializable {
    private Integer accountId;
    @Size(max = 50)
    @NotNull
    private String accountName;
}