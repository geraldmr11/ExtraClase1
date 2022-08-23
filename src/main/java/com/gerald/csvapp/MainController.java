package com.gerald.csvapp;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.util.ArrayList;

import com.gerald.csvapp.files.CsvFileLoader;

public class MainController {

    private Stage stage;

    @FXML
    private Label welcomeText;

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    @FXML
    protected void onLoadButtonClick() {
        // Select file to load
        FileChooser fileChooser = new FileChooser();
        File selectedFile = fileChooser.showOpenDialog(this.stage);
        CsvFileLoader csvFileLoader = new CsvFileLoader(selectedFile);
        ArrayList<Student> students = csvFileLoader.getStudents();
        //  AQUI SE METE EN LA TABLA LOS ESTUDIANTES
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).getFirstName() + " " + students.get(i).getLastName()+ " " + students.get(i).getAge());
        }
    }
}