package com.ioto.exceptions;

/**
 * Creater dengting on 2018/3/26
 */
public class ShopOperationException extends RuntimeException {
    private static final long serialVersionUID = 2361446884822298905L;

    public ShopOperationException(String msg) {
        super(msg);
    }
}
