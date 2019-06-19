package Application.controller;

import Application.Utils;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainMenuController implements Initializable {
    @FXML
    private AnchorPane Parent;

    Stage stage;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        stage = new Stage();
        stage.setScene(new Scene(Parent));
        stage.initStyle(StageStyle.UNDECORATED);

        stage.show();
    }

    public void btnPlant_Clicked() throws IOException {
        new Utils().fxmlLoader("/Application/views/Plant.fxml");
        stage.hide();
    }

    public void btnTemp_Clicked() throws IOException {
        new Utils().fxmlLoader("/Application/views/Temperature.fxml");
        stage.hide();
    }

    public void btnConfig_Clicked() throws IOException {
        new Utils().fxmlLoader("/Application/views/Config.fxml");
        stage.hide();
    }

    public void btnFlow_Clicked() throws IOException {
        new Utils().fxmlLoader("/Application/views/Flow.fxml");
        stage.hide();
    }

    public void btnLight_Clicked() throws IOException {
        new Utils().fxmlLoader("/Application/views/Light.fxml");
        stage.hide();
    }

    public void btnNotification_Clicked() throws IOException {
        new Utils().fxmlLoader("/Application/views/Notification.fxml");
        stage.hide();
    }

    public void btnClose_Clicked() {
        stage.hide();
    }
}
