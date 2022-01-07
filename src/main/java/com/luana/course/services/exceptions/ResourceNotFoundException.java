package com.luana.course.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {

    private static final long serialVersionUID = -8875217356056071169L;

    public ResourceNotFoundException(Object id) {
        super("Resource not found. Id " + id);
    }
}
