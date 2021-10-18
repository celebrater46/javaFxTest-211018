module com.example.test211018 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.test211018 to javafx.fxml;
    exports com.example.test211018;
}