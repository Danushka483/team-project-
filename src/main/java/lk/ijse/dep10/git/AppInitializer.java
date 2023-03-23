package lk.ijse.dep10.git;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AppInitializer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        primaryStage.setScene(new Scene(new FXMLLoader(this.getClass().getResource("/view/ManageStudentScene.fxml")).load()));
        primaryStage.centerOnScreen();
        primaryStage.sizeToScene();
        primaryStage.setTitle("Manage Student");
        primaryStage.show();
    }
}
