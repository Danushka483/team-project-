package lk.ijse.dep10.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class DashBoardViewController {

    @FXML
    private Button btnCustomer;

    @FXML
    private Button btnEmployee;

    @FXML
    private Button btnStudent;

    @FXML
    private Button btnTeacher;
    private Stage stgCustomer;
    private Stage stgStudent;
    private Stage stgTeacher;
    private Stage stgEmployee;

    @FXML
    void btnCustomerOnAction(ActionEvent event) throws IOException {
        stgCustomer=new Stage();
        stgCustomer.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/CustomerScene.fxml"))));
        stgCustomer.show();
        stgCustomer.setTitle("Customer View");
        stgCustomer.centerOnScreen();
        stgCustomer.sizeToScene();

    }

    @FXML
    void btnEmployeeOnAction(ActionEvent event) throws IOException {
        stgEmployee=new Stage();
        stgEmployee.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/EmployeeScene.fxml"))));
        stgEmployee.show();
        stgEmployee.setTitle("Employee View");
        stgEmployee.centerOnScreen();
        stgEmployee.sizeToScene();
    }

    @FXML
    void btnStudentOnAction(ActionEvent event) throws IOException {
        stgStudent=new Stage();
        stgStudent.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/StudentScene.fxml"))));
        stgStudent.show();
        stgStudent.setTitle("Student View");
        stgStudent.centerOnScreen();
        stgStudent.sizeToScene();
    }

    @FXML
    void btnTeacherOnAction(ActionEvent event) throws IOException {
        stgTeacher=new Stage();
        stgTeacher.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/TeacherScene.fxml"))));
        stgTeacher.show();
        stgTeacher.setTitle("Teacher View");
        stgTeacher.centerOnScreen();
        stgTeacher.sizeToScene();
    }

}
