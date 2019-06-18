package Application.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
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
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Application/views/Plant.fxml"));
        fxmlLoader.load();
    }
    public void btnTemp_Clicked() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Application/views/Temp.fxml"));
        fxmlLoader.load();
    }
}
