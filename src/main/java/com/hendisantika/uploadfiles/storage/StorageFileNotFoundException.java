package com.hendisantika.uploadfiles.storage;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-image
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 12/11/17
 * Time: 07.48
 * To change this template use File | Settings | File Templates.
 */
public class StorageFileNotFoundException extends StorageException {
    public StorageFileNotFoundException(String message) {
        super(message);
    }

    public StorageFileNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
