package Application.controller;

import Application.Utils;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class TempController implements Initializable {

    @FXML
    private AnchorPane Parent;

    @FXML
    private Slider slTemp;

    @FXML
    private Label lblTemp;
    Stage stage;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        stage = new Stage();
        stage.setScene(new Scene(Parent));
        stage.initStyle(StageStyle.UNDECORATED);

        stage.show();
    }

    public void btnClose_Clicked() throws IOException {
        stage.hide();
        new Utils().fxmlLoader("/Application/views/MainMenu.fxml");
    }

    public void slTemp_Changed(){
        lblTemp.setText(Integer.toString(((int) slTemp.getValue())));
    }
}
