package sample.controllers;

import io.github.palexdev.materialfx.controls.MFXButton;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class firstWindowController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane anchorPaneContent;

    @FXML
    private BorderPane borderPaneContent;

    @FXML
    private MenuButton colorStyleSellector;

    @FXML
    private MenuItem wtfStyle;

    @FXML
    private MenuItem oceanBlueStyle;

    @FXML
    private MenuItem arashiStyle;

    @FXML
    private MenuItem standartStyle;

    @FXML
    private TextField ipRobotic;

    @FXML
    private MFXButton connectionButton;

    @FXML
    private Label connectionStatusBar;

    @FXML
    void switchToApp(ActionEvent event) {

    }

    @FXML
    void initialize() {

    }

    public void SwitchToManualControl(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/fxmlToContent/analyticalSystem.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
