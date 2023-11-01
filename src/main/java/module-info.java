module com.example.projekt {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.projekt to javafx.fxml;
    exports com.example.projekt;
}