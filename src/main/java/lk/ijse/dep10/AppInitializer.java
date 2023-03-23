package lk.ijse.dep10;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;

import java.io.IOException;

public class AppInitializer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        primaryStage.setScene(FXMLLoader.load(getClass().getResource("/view/DashBoardView.fxml")));
        primaryStage.show();
        primaryStage.setTitle("Dashboard View");
        primaryStage.centerOnScreen();
        primaryStage.sizeToScene();

    }
}
