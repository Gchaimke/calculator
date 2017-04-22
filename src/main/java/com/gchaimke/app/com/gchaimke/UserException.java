package com.gchaimke;

/**
 * catch user exceptions
 * Created by chaim on 22.04.2017.
 */
class UserException extends Exception {
    UserException(final String message) {
        super(message);
    }
}
