package com.example.retogrupalgestiontareas.controllers;

import com.example.retogrupalgestiontareas.App;
import javafx.event.*;
import javafx.scene.control.*;

import java.io.IOException;

public class EnterpriseListController {
    @javafx.fxml.FXML
    private TableView tblEmpresas;
    @javafx.fxml.FXML
    private TableColumn cNombre;
    @javafx.fxml.FXML
    private TableColumn cResponsable;
    @javafx.fxml.FXML
    private TableColumn cTelefono;
    @javafx.fxml.FXML
    private TableColumn cEmail;
    @javafx.fxml.FXML
    private TableColumn cAlumno;

    @javafx.fxml.FXML
    private Button btnVolver;
    @javafx.fxml.FXML
    private Button btnDelete;
    @javafx.fxml.FXML
    private Button btnAñadir;

    @javafx.fxml.FXML
    public void back(ActionEvent actionEvent) throws IOException {
        App.changeScene("alumnList-view.fxml","Lista de Alumnos");
    }

    @javafx.fxml.FXML
    public void newEnterprise(ActionEvent actionEvent) throws IOException {
        App.changeScene("addEnterprise-view.fxml","Nueva Empresa");
    }

    @javafx.fxml.FXML
    public void selectedEnterprise(Event event) {
    }

    @javafx.fxml.FXML
    public void delete(ActionEvent actionEvent) {
        Alert alerta = new Alert(Alert.AlertType.WARNING);
        alerta.setTitle("Borrar Empresa");
        alerta.setContentText("¿Está seguro de que desea borrar la empresa?");
        alerta.showAndWait();
    }
}
