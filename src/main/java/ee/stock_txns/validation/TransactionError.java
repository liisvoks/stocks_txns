package ee.stock_txns.validation;

import lombok.Getter;

@Getter
public enum TransactionError {
    INCORRECT_CREDENTIALS("Sellist kasutajanime või parooli ei leitud", "123");

    private final String message;

    private final String errorCode;

    TransactionError(String message, String errorCode) {
        this.errorCode = errorCode;
        this.message = message;
    }

}
