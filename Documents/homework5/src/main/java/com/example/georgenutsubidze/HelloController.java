package com.example.georgenutsubidze;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private DatePicker date;
    private int getRaodenoba;
    private ChoiceBox saidanChoicebox;
    private ChoiceBox mimartulebaChoicebox;

    public DatePicker getDate(){
        return date;
    }

    public int getGetRaodenoba() {
        return getRaodenoba;
    }

    public ChoiceBox getMimartulebaChoicebox() {
        return mimartulebaChoicebox;
    }

    public ChoiceBox getSaidanChoicebox() {
        return saidanChoicebox;
    }

    public void setGetRaodenoba(int getRaodenoba) {
        this.getRaodenoba = getRaodenoba;
    }

    public void setDate(DatePicker date) {
        this.date = date;
    }

    public void setMimartulebaChoicebox(ChoiceBox mimartulebaChoicebox) {
        this.mimartulebaChoicebox = mimartulebaChoicebox;
    }

    public void setSaidanChoicebox(ChoiceBox saidanChoicebox) {
        this.saidanChoicebox = saidanChoicebox;
    }
}
