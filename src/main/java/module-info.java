module com.example.lista {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lista to javafx.fxml;
    exports com.example.lista;
}