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
                Student newStudent = new Student(studentAttributes[0],
                                                    studentAttributes[1], Integer.parseInt(studentAttributes[2]));
                students.add(newStudent);
            }
            return students;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
