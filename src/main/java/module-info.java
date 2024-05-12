module com.example.lab1rev1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.lab1rev1 to javafx.fxml;
    exports com.example.lab1rev1;
}