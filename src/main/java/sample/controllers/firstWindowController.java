package sample.controllers;

import io.github.palexdev.materialfx.controls.MFXButton;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import sample.controllers.contents.analyticalSystemContent;

public class firstWindowController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private MFXButton diagramLoadContentButton;

    @FXML
    private BorderPane borderPaneContent;

    @FXML
    public MFXButton analyticalSystemLoadContentButton;

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
        assert borderPaneContent != null : "fx:id=\"borderPaneContent\" was not injected: check your FXML file 'analyticalSystem.fxml'.";
        assert diagramLoadContentButton != null : "fx:id=\"diagramLoadContentButton\" was not injected: check your FXML file 'analyticalSystem.fxml'.";
        assert analyticalSystemLoadContentButton != null : "fx:id=\"analyticalSystemLoadContentButton\" was not injected: check your FXML file 'analyticalSystem.fxml'.";
        assert openCVValuesLoadControlButton != null : "fx:id=\"openCVValuesLoadControlButton\" was not injected: check your FXML file 'analyticalSystem.fxml'.";
        assert raspberryPIValuesLoadContentButton != null : "fx:id=\"raspberryPIValuesLoadContentButton\" was not injected: check your FXML file 'analyticalSystem.fxml'.";
        assert stateOfTheSystemLoadContentButton != null : "fx:id=\"stateOfTheSystemLoadContentButton\" was not injected: check your FXML file 'analyticalSystem.fxml'.";
        assert manualControlLoadContentButton != null : "fx:id=\"manualControlLoadContentButton\" was not injected: check your FXML file 'analyticalSystem.fxml'.";
        assert colorStyleSellector != null : "fx:id=\"colorStyleSellector\" was not injected: check your FXML file 'analyticalSystem.fxml'.";
        assert wtfStyle != null : "fx:id=\"wtfStyle\" was not injected: check your FXML file 'analyticalSystem.fxml'.";
        assert oceanBlueStyle != null : "fx:id=\"oceanBlueStyle\" was not injected: check your FXML file 'analyticalSystem.fxml'.";
        assert arashiStyle != null : "fx:id=\"arashiStyle\" was not injected: check your FXML file 'analyticalSystem.fxml'.";
        assert standartStyle != null : "fx:id=\"standartStyle\" was not injected: check your FXML file 'analyticalSystem.fxml'.";
        assert connectionStatusBar != null : "fx:id=\"connectionStatusBar\" was not injected: check your FXML file 'analyticalSystem.fxml'.";
    }
}
