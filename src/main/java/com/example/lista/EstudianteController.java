package com.example.lista;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class EstudianteController implements Initializable {

    @FXML
    private Button btnAgregar;
    @FXML
    private TextField txtCarne;
    @FXML
    private TextField txtNombreApellidos;
    @FXML
    private TextField txtCorreo;
    @FXML
    private TextField txtTelefono;
    @FXML
    private TextField txtNickname;
    @FXML
    private TextField txtTipoEstudiente;
    @FXML
    private TextField txtNotaExamenes;
    @FXML
    private TextField txtNotaQuices;
    @FXML
    private TextField txtNotaTareas;
    @FXML
    private TextField txtNotaProyecto1;
    @FXML
    private TextField txtNotaProyecto2;
    @FXML
    private TextField txtNotaProyecto3;
    @FXML
    private TableView<DatosEstudiante> tblDatos;
    @FXML
    private TableColumn colCarne;
    @FXML
    private TableColumn colNombreApellidos;
    @FXML
    private TableColumn colCorreo;
    @FXML
    private TableColumn colTeléfono;
    @FXML
    private TableColumn colNickname;
    @FXML
    private TableColumn colTipoEstudiante;
    @FXML
    private TableColumn colNotaExamenes;
    @FXML
    private TableColumn colNotaQuices;
    @FXML
    private TableColumn colNotaTareas;
    @FXML
    private TableColumn colNotaProyecto1;
    @FXML
    private TableColumn colNotaProyecto2;
    @FXML
    private TableColumn colNotaProyecto3;


    private ObservableList<DatosEstudiante> datos;

    public EstudianteController() {
    }

    /**
     *
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Creo el observablelist
        datos = FXCollections.observableArrayList();

        // Asigno las columnas con los atributos del modelo
        this.colCarne.setCellValueFactory(new PropertyValueFactory("Carne"));
        this.colNombreApellidos.setCellValueFactory(new PropertyValueFactory("NombreApellidos"));
        this.colCorreo.setCellValueFactory(new PropertyValueFactory("Correo"));
        this.colTeléfono.setCellValueFactory(new PropertyValueFactory("Telefono"));
        this.colNickname.setCellValueFactory(new PropertyValueFactory("Nickname"));
        this.colTipoEstudiante.setCellValueFactory(new PropertyValueFactory("TipoEstudiante"));
        this.colNotaExamenes.setCellValueFactory(new PropertyValueFactory("NotaExamenes"));
        this.colNotaQuices.setCellValueFactory(new PropertyValueFactory("NotaQuices"));
        this.colNotaTareas.setCellValueFactory(new PropertyValueFactory("NotaTareas"));
        this.colNotaProyecto1.setCellValueFactory(new PropertyValueFactory("NotaProyecto1"));
        this.colNotaProyecto2.setCellValueFactory(new PropertyValueFactory("NotaProyecto2"));
        this.colNotaProyecto3.setCellValueFactory(new PropertyValueFactory("NotaProyecto3"));
    }

    @FXML
    private void Agregar(ActionEvent event) {

        try {

            // Obtengo los datos del formulario
            int Carne = Integer.parseInt(this.txtCarne.getText());
            String NombreApellidos = this.txtNombreApellidos.getText();
            String Correo = this.txtCorreo.getText();
            int Telefono = Integer.parseInt(this.txtTelefono.getText());
            String Nickname = this.txtNickname.getText();
            String TipoEstudiante = this.txtTipoEstudiente.getText();
            int NotaExamenes = Integer.parseInt(this.txtNotaExamenes.getText());
            int NotaQuices = Integer.parseInt(this.txtNotaQuices.getText());
            int NotaTareas = Integer.parseInt(this.txtNotaTareas.getText());
            int NotaProyecto1 = Integer.parseInt(this.txtNotaProyecto1.getText());
            int NotaProyecto2 = Integer.parseInt(this.txtNotaProyecto2.getText());
            int NotaProyecto3 = Integer.parseInt(this.txtNotaProyecto3.getText());


            // Creo una lista
            DatosEstudiante p = new DatosEstudiante(Carne, NombreApellidos, Correo,Telefono, Nickname, TipoEstudiante, NotaExamenes, NotaQuices, NotaTareas, NotaProyecto1,NotaProyecto2,NotaProyecto3);

            // Compruebo si los datos esta en el lista
            if (!this.datos.contains(p)) {
                // Lo añado a la lista
                this.datos.add(p);
                // Seteo los items
                this.tblDatos.setItems(datos);
            } else {

                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setTitle("Error");
                alert.setContentText("La persona existe");
                alert.showAndWait();
            }
        }
        catch (NumberFormatException e) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Formato incorrecto");
            alert.showAndWait();
        }
    }
}
