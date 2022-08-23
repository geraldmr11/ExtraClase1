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
            System.out.println(students.get(i).getCarne() + " " + students.get(i).getNombreApellido()+ " " + students.get(i).getCorreo()+ " " + students.get(i).getTelefono()+ " " +students.get(i).getNickname()+ " " +students.get(i).getTipoEstudiante()+ " " +students.get(i).getNotaExamenes()+ " " +students.get(i).getNotaQuices()+ " " +students.get(i).getNotaTareas()+ " " +students.get(i).getNotaProyecto1()+ " " +students.get(i).getNotaProyecto2()+ " " +students.get(i).getNotaProyecto3());
        }
    }
}