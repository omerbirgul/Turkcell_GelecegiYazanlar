package org.manager.entities;
import java.util.*;


public class BaseEntity<T> {
    private T id;

    private Date createdAt;
    private Date updatedAt;

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
