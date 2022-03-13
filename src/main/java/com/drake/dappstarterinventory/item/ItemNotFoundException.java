package com.drake.dappstarterinventory.item;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ItemNotFoundException extends RuntimeException{
    public ItemNotFoundException(String message) {
        super(message);}

    public ItemNotFoundException(int itemId) {
        super("item not found. itemId: " + itemId);
    }
}
