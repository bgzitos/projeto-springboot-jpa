package com.projetospring.bgvendas.services.exceptions;

import java.io.Serial;

public class ResourceNotFoundException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = 8276694179375375003L;

    public ResourceNotFoundException(Object id) {
        super("Resource not found. Id " + id);
    }
}
