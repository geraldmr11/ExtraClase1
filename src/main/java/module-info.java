module com.gerald.csvapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.gerald.csvapp to javafx.fxml;
    exports com.gerald.csvapp;
}