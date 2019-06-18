package Application;

import javafx.fxml.FXMLLoader;

import java.io.IOException;

public class Utils {
    public void fxmlLoader(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(fxml));
        fxmlLoader.load();
    }
}
