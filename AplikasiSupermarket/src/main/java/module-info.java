module com.example.aplikasisupermarket {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.aplikasisupermarket to javafx.fxml;
    exports com.example.aplikasisupermarket;
}