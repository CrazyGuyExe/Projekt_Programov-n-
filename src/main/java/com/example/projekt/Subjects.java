package com.example.projekt;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Subjects {
    public static double random() {
        double random = Math.floor(Math.random() * 5 + 1);
        return random;
    }


    public static ObservableList average() {
        ObservableList<String> result = FXCollections.observableArrayList();
        String[] subjects = {"Math", "English", "Czech", "Physics", "Shooting", "Biology"};

        for (int i = 0; i < 6; i++) {
            String markz = "";
            double marks = 0;
            for (int j = 0; j < 6; j++) {
                double random = random();
                marks += random;
                markz += random + ", ";
            }
            marks /= 6;
            result.add(subjects[i] + " " + marks + " from " + markz);
        }
        return result;
    }
}
