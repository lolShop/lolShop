package edu.nf.lol.exception;

/**
 * @author Crazy
 * @date 2020/3/6
 */
public class LolException extends  RuntimeException {
    public LolException(String message) {
        super(message);
    }

    public LolException(String message, Throwable cause) {
        super(message, cause);
    }

    public LolException(Throwable cause) {
        super(cause);
    }
}