package com.example.projekt;


import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private ListView marks;
    @FXML
    private ChoiceBox studentsChoice;


    public void setMarks() {

        marks.setItems(Subjects.average());
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        if (studentsChoice.getItems().isEmpty()) {
            studentsChoice.getItems().add("Matěj Landa");
            studentsChoice.getItems().add("Píček Filip");
            studentsChoice.getItems().add("Těpán Šomsa");
            studentsChoice.getItems().add("Dýbl Kýbl");
            studentsChoice.getItems().add("Míka Davel");
        }
    }
}