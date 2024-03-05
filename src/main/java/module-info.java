module com.example.set {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.set to javafx.fxml;
    exports com.example.set;
}