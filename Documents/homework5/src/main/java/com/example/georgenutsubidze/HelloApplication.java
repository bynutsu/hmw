package com.example.georgenutsubidze;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Label locationLabel = new Label("საიდან");

        ChoiceBox saidanChoicebox = new ChoiceBox();
        saidanChoicebox.getItems().addAll(
                "Kobuleti", "Telavi", "Gori", "Borjomi",
                "Poti", "Batumi"
        );
        Label mimatulebaLabel = new Label("Where");

        ChoiceBox mimartulebaChoicebox = new ChoiceBox();
        mimartulebaChoicebox.getItems().addAll(
                "Over The Rainbow"
        );
        Label dobLabel = new Label("Flight date");
        DatePicker datePicker = new DatePicker();

        Label educationLabel = new Label("Number of Passengers");

        ListView quantity = new ListView();
        ObservableList data = FXCollections.observableArrayList();
        data.addAll("1", "2", "3", "4");
        quantity.setItems(data);
        quantity.setPrefSize(100, 100);

        Button buttonRegister = new Button("Register");

        GridPane gridPane = new GridPane();

        gridPane.setMinSize(500, 500);

        gridPane.setPadding(new Insets(10, 10, 10, 10));

        gridPane.setVgap(5);
        gridPane.setHgap(5);

        gridPane.setAlignment(Pos.CENTER);


        gridPane.add(dobLabel, 0, 1);
        gridPane.add(datePicker, 1, 1);

        gridPane.add(educationLabel, 0, 4);
        gridPane.add(quantity, 1, 4);
        gridPane.add(mimatulebaLabel, 0, 8);
        gridPane.add(mimartulebaChoicebox, 1, 8);
        gridPane.add(locationLabel, 0, 5);
        gridPane.add(saidanChoicebox, 1, 5);
        gridPane.add(buttonRegister, 2, 9);

        buttonRegister.setStyle(
                "-fx-background-color: #2990aa;-fx-textfill:white"

        );
        gridPane.setStyle("-fx-backhround-color:BEIGE;");
        Scene scene = new Scene(gridPane);

        stage.setTitle("air flights form");
        stage.setScene(scene);
        stage.show();
    };


    public void insert(Data data) {
        String insertsql = "INSERT INTO Data(date, quantity, wherefrom, whereto) VALUES(" +
                "'" + data.getDate() + "', " +
                "'" + data.getQuantity() + "', " +
                "'" + data.getWhereFrom() + "', " +
                "'" + data.getWhereTo() + "', ";

        try {
            DB.getStatement().executeQuery(insertsql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public ObservableList<Data> getPassenger() {
        ObservableList<Data> data = FXCollections.observableArrayList();

        String selectsql = "SELECT * FROM flight3";

        try {
            ResultSet resultSet = DB.getStatement().executeQuery(selectsql);

            while (resultSet.next()) {
                data.add(new Data(
                        resultSet.getDate("Date"),
                        resultSet.getString("quantity"),
                        resultSet.getDate("where from"),
                        resultSet.getInt("where to")
                ));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return data;
    }

            public static void main (String[]args){
                launch();
            }
        }
