package sample.controllers.contents;

import io.github.palexdev.materialfx.controls.MFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;

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
}
