module com.example.georgenutsubidze {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires mysql.connector.java;


    opens com.example.georgenutsubidze to javafx.fxml;
    exports com.example.georgenutsubidze;
}