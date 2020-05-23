package com.imooc.o2o.exceptions;

public class ShopOperationException extends RuntimeException{
    private static final long serialVersionUID = 4313564158210155831L;

    public ShopOperationException(String msg){
        super(msg);
    }
}
