package com.hendisantika.uploadfiles.storage;

import org.springframework.context.annotation.Configuration;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-image
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 12/11/17
 * Time: 07.45
 * To change this template use File | Settings | File Templates.
 */
@Configuration("storage")
public class StorageProperties {
    /**
     * Folder location for storing files
     */
    private String location = "/tmp/img";

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
