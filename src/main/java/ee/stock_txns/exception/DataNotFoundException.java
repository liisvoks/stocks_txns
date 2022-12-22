package ee.stock_txns.exception;

import lombok.Data;

@Data
public class DataNotFoundException extends RuntimeException{

    private final String message;
    private final  String errorCode;

    public DataNotFoundException(String message, String errorCode) {
        super();
        this.message = message;
        this.errorCode = errorCode;
    }
}
