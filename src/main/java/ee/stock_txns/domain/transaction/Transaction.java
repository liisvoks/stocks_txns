package ee.stock_txns.domain.transaction;

import ee.stock_txns.domain.account.Account;
import ee.stock_txns.domain.currency.Currency;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.time.LocalDate;

@Setter
@Getter
@Entity
@Table(name = "transaction")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "currency_id", nullable = false)
    private Currency currency;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "account_id", nullable = false)
    private Account account;

    @NotNull
    @Column(name = "date", nullable = false)
    private LocalDate date;

    @Size(max = 5)
    @NotNull
    @Column(name = "ticker", nullable = false, length = 5)
    private String ticker;

    @Size(max = 10)
    @NotNull
    @Column(name = "type", nullable = false, length = 10)
    private String type;

    @NotNull
    @Column(name = "price", nullable = false, precision = 6, scale = 2)
    private BigDecimal price;

    @NotNull
    @Column(name = "amount", nullable = false)
    private Integer amount;

    @Column(name = "fee", precision = 6, scale = 2)
    private BigDecimal fee;

    @Column(name = "tax", precision = 6, scale = 2)
    private BigDecimal tax;


}