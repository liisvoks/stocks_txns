package ee.stock_txns.validation;

import ee.stock_txns.domain.user.User;
import ee.stock_txns.exception.BusinessException;

import java.util.Optional;

public class Validation {

    public static void validateUserCredentials(Optional<User> userOptional) {
        if (userOptional.isEmpty()) {
            throw new BusinessException(TransactionError.INCORRECT_CREDENTIALS.getMessage(), TransactionError.INCORRECT_CREDENTIALS.getErrorCode());
        }
    }
}
