module JavaFxApplication {
    requires javafx.fxml;
    requires javafx.controls;

    opens Application.views;
    opens Application.controller;
    opens Application;
}