package com.mouhamadjradeh;

import org.springframework.data.annotation.Id;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Entity;
import java.lang.annotation.Documented;

//@Entity
public class Todo {
    @Id
      private String Id;

    private String title;
    private String descr;
    private Long timestamp;
    public Todo(String id, String title, String descr) {
        Id = id;
        this.title = title;
        this.descr = descr;
        this.timestamp=System.currentTimeMillis();
    }

    public Todo() {
        this.timestamp=System.currentTimeMillis();
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }
}
