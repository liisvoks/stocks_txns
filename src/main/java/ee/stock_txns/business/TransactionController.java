package ee.stock_txns.business;

import ee.stock_txns.business.dto.AccountResponse;
import ee.stock_txns.business.dto.TransactionInfo;
import ee.stock_txns.business.dto.TransactionResponse;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.time.LocalDate;
import java.util.List;

@RestController
public class TransactionController {

    @Resource
    TransactionService transactionService;

    @Resource
    AccountService accountService;


    @PostMapping("/transaction")
    @Operation(summary = "Adds new transaction info under the corresponding account")
    public void addTransaction(@RequestBody TransactionInfo transactionInfo) {
        transactionService.addTransaction(transactionInfo);
    }

    @GetMapping("/transaction")
    @Operation(summary = "Finds userId transactions according to selected filters")
    public List<TransactionResponse> getTransactionsBySorting(@RequestParam @Nullable Integer accountId, @RequestParam Integer
            userId, @Nullable @RequestParam @DateTimeFormat  (iso = DateTimeFormat.ISO.DATE) LocalDate dateFrom,
                                                             @Nullable @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
                                                              LocalDate dateTo, @Nullable @RequestParam String type) {
        List<TransactionResponse> transactionResponses = transactionService.getTransactionsBySorting
                (accountId, userId, dateFrom, dateTo, type);
        return transactionResponses;}

        @GetMapping("transaction/account")
        @Operation(summary = "Get all account names and id-s")
        public List<AccountResponse> getAllAccounts (@RequestParam Integer userId) {
            List<AccountResponse> accountResponses = accountService.findAllAccountsBy(userId);
            return accountResponses;
        }
}
