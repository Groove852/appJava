package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.InputStream;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/firstWindow.fxml"));

        InputStream iconStream = getClass().getResourceAsStream("/robot.png");
        Image image = new Image(iconStream);

        primaryStage.getIcons().add(image);
        primaryStage.setTitle("Robotics");
        primaryStage.setScene(new Scene(root, 1024, 700));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
