module JavaFxApplication {
    requires javafx.fxml;
    requires javafx.controls;
    requires java.sql;

    opens Application.views;
    opens Application.controller;
    opens Application;
}