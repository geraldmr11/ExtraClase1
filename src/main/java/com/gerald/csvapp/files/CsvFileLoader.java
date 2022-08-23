package com.gerald.csvapp.files;

import com.gerald.csvapp.Student;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

/**
 * Class that loads information from a .csv file
 */
public class CsvFileLoader {

    private File file;

    public CsvFileLoader(File file) {
        this.file = file;
    }

    public CsvFileLoader() { }

    /**
     * Gets the students from a .csv file
     * @return An array list with the students in the file
     */
    public ArrayList<Student> getStudents() {
        try {
            List<String> fileLines = Files.readAllLines(file.toPath());
            ArrayList<Student> students = new ArrayList<Student>();
            for (int i = 1; i < fileLines.size(); i++) {
                String[] studentAttributes = fileLines.get(i).split(";");
                int Carne= Integer.parseInt(studentAttributes[0]);
                int Telefono= Integer.parseInt(studentAttributes[3]);
                int NotaExamenes= Integer.parseInt(studentAttributes[6]);
                int NotaQuices= Integer.parseInt(studentAttributes[7]);
                int NotaTareas= Integer.parseInt(studentAttributes[8]);
                int NotaProyecto1= Integer.parseInt(studentAttributes[9]);
                int NotaProyecto2= Integer.parseInt(studentAttributes[10]);
                int NotaProyecto3= Integer.parseInt(studentAttributes[11]);
                Student newStudent = new Student(Carne, studentAttributes[1], studentAttributes[2], Telefono, studentAttributes[4], studentAttributes[5], NotaExamenes,NotaQuices, NotaTareas, NotaProyecto1, NotaProyecto2, NotaProyecto3);
                students.add(newStudent);
            }
            return students;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
