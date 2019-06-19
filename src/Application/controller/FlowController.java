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

public class FlowController implements Initializable {

    @FXML
    private AnchorPane Parent;
    @FXML
    private Label sflow;

    @FXML
    private Slider flows;
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
    public void flow_Changed(){
        sflow.setText(Integer.toString(((int) flows.getValue()))+" L");
    }
}