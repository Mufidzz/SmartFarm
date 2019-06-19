package Application.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.net.URL;
import java.util.ResourceBundle;

public class LightController implements Initializable {

    @FXML
    private AnchorPane Parent;
    @FXML
    private Slider reds;

    @FXML
    private Slider greens;

    @FXML
    private Label sred;

    @FXML
    private Slider blues;

    @FXML
    private Label sgreen;

    @FXML
    private Label sblue;
    Stage stage;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        stage = new Stage();
        stage.setScene(new Scene(Parent));
        stage.initStyle(StageStyle.UNDECORATED);

        stage.show();
    }

    public void btnClose_Clicked() {
        stage.hide();
    }
    public void red_Changed(){
        sred.setText(Integer.toString(((int) reds.getValue()))+" %");
    }
    public void green_Changed(){
        sgreen.setText(Integer.toString(((int) greens.getValue()))+" %");
    }
    public void blue_Changed(){
        sblue.setText(Integer.toString(((int) blues.getValue()))+" %");
    }
}