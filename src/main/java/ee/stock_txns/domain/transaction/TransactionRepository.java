package ee.stock_txns.domain.transaction;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.lang.Nullable;

import java.time.LocalDate;
import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Integer> {

@Query("SELECT t from Transaction t join Account a on a.id = t.account.id where (:accountId is null or :accountId = a.id)" +
        " and (:userId is null or :userId = a.user.id)" +
        "and ((cast(:dateFrom as date) is null ) or :dateFrom <= t.date) " +
        "and ((cast(:dateFrom as date) is null ) or :dateTo >= t.date) " +
        "and (:type is null  or :type = t.type)")
        List<Transaction> findBySortingParameters(@Param("accountId") Integer accountId, @Param("userId") Integer userId,
                                                  @Param("dateFrom") LocalDate dateFrom, @Param("dateTo") LocalDate dateTo,
                                                  @Param("type") String type);

}