module com.example.practical4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.practical4 to javafx.fxml;
    exports com.example.practical4;
}