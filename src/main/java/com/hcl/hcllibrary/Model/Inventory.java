package com.hcl.hcllibrary.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Inventory {

    @Id
    private Long Books_UUID;
    private String userId;
    private String status;
    private String date_borrow;
    private String date_return;
    private String total_fees;

    public Long getBooks_UUID() {
        return Books_UUID;
    }

    public void setBooks_UUID(Long books_UUID) {
        Books_UUID = books_UUID;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate_borrow() {
        return date_borrow;
    }

    public void setDate_borrow(String date_borrow) {
        this.date_borrow = date_borrow;
    }

    public String getDate_return() {
        return date_return;
    }

    public void setDate_return(String date_return) {
        this.date_return = date_return;
    }

    public String getTotal_fees() {
        return total_fees;
    }

    public void setTotal_fees(String total_fees) {
        this.total_fees = total_fees;
    }
}
