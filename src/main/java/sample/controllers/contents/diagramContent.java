package sample.controllers.contents;

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
import javafx.stage.Stage;

public class diagramContent {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private MFXButton diagramLoadContentButton;

    @FXML
    private MFXButton analyticalSystemLoadContentButton;

    @FXML
    private MFXButton openCVValuesLoadControlButton;

    @FXML
    private MFXButton raspberryPIValuesLoadContentButton;

    @FXML
    private MFXButton stateOfTheSystemLoadContentButton;

    @FXML
    private MFXButton manualControlLoadContentButton;

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
    private Label connectionStatusBar;

    @FXML
    void initialize() {

    }

    public void SwitchToAnalyticalSystem(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/fxmlToContent/analyticalSystem.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void SwitchToOpenCRValues(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/fxmlToContent/openCRValues.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void SwitchToRaspberryPIValues(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/fxmlToContent/raspberryPIValues.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void SwitchToStateOfTheSystem(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/fxmlToContent/stateOfTheSystem.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void SwitchToManualControl(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/fxmlToContent/manualControl.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
