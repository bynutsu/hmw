package com.example.georgenutsubidze;

import java.util.Date;

public class Data {
    private Date date;
    private Integer quantity;
    private String whereFrom;
    private String whereTo;

    public Data(Date date, Integer quantity, String whereFrom, String whereTo){
        this.date=date;
        this.quantity=quantity;
        this.whereFrom=whereFrom;
        this.whereTo=whereTo;
    }
    public Data(java.sql.Date date, String destination, java.sql.Date resultSetDate, int sits){}

    public Date getDate(){
        return date;
    }
    public void setDate(Date date){
        this.date=date;
    }
    public Integer getQuantity(){
        return quantity;
    }
    public void setQuantity(Integer quantity){
        this.quantity=quantity;
    }
    public String getWhereFrom(){
        return whereFrom;
    }
    public void setWhereFrom(String whereFrom){
        this.whereFrom=whereFrom;
    }
    public String getWhereTo(){
        return whereTo;

    }
    public void setWhereTo(String whereto){
        this.whereTo=whereto;
    }
}

