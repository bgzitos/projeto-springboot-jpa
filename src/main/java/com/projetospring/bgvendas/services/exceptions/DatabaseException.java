package com.projetospring.bgvendas.services.exceptions;

import java.io.Serial;

public class DatabaseException extends RuntimeException{

    @Serial
    private static final long serialVersionUID = -1302001209473918454L;

    public DatabaseException(String msg) {
        super(msg);
    }
}
