package com.example.carshowroom;

import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import com.example.carshowroom.DataBase.DataBaseHandlerTransport;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.control.TableView;
import javafx.stage.StageStyle;

public class TableTruck {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<Transport> Truck;

    @FXML
    private Button addTransport;

    @FXML
    private TableColumn<Transport, String> brand_truck;

    @FXML
    private Button buttonBack;

    @FXML
    private Button changeTransport;

    @FXML
    private TableColumn<Transport, String> dateOfManufacture_truck;

    @FXML
    private Button UpdateButton;

    @FXML
    private Button dellTransport;

    @FXML
    private TableColumn<Transport, Integer> id_truck;

    @FXML
    private TableColumn<Transport, String> model_truck;

    @FXML
    private TableColumn<Transport, Integer> price_truck;

    @FXML
    private TableColumn<Transport, String> vin_truck;

    DataBaseHandlerTransport dataBase = new DataBaseHandlerTransport();
    private final ObservableList<Transport> dataTruck= FXCollections.observableArrayList();

    @FXML

    void initialize() {
        setDataTruck();
        setD();
        editC();
        buttonBack.setOnAction(event -> {
            buttonBack.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            Parent root = null;
            try {
                root = FXMLLoader.load(getClass().getResource("showroom.fxml"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            Stage stage = new Stage();
            stage.setScene(new Scene(root, 320, 360));
            stage.setResizable(false);
            stage.show();
        });
        addTransport.setOnAction(event -> {
            FXMLLoader loader = new FXMLLoader();
            Parent root = null;
            try {
                root = FXMLLoader.load(getClass().getResource("addTruckControler.fxml"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            Stage stage = new Stage();
            stage.setScene(new Scene(root, 360, 320));
            stage.setResizable(false);
            stage.show();
        });

        UpdateButton.setOnAction(event -> {
           try {
               Truck.getItems().clear();
               setD();
               setDataTruck();
           } catch (Exception e) {
               throw new RuntimeException(e);
           }

        });
        dellTransport.setOnAction(event -> {
            dell();
            Truck.getItems().clear();
            setD();
            setDataTruck();
        });
    }
    private void setDataTruck() {
        ResultSet users= dataBase.getTC("transport","truck");
        try{
            while (users.next()){
                Transport transport = new Transport(
                        users.getInt(1),
                        users.getString(2),
                        users.getString(3),
                        users.getString(4),
                        users.getString(5),
                        users.getInt(6));
                dataTruck.add(transport);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    private void setD(){
        id_truck.setCellValueFactory(new PropertyValueFactory<>("id"));
        brand_truck.setCellValueFactory(new PropertyValueFactory<>("brandTC"));
        model_truck.setCellValueFactory(new PropertyValueFactory<>("modelTC"));
        vin_truck.setCellValueFactory(new PropertyValueFactory<>("vin"));
        dateOfManufacture_truck.setCellValueFactory(new PropertyValueFactory<>("dateOfManufacture"));
        price_truck.setCellValueFactory(new PropertyValueFactory<>("prise"));
        Truck.setItems(dataTruck);
    }
    private void dell(){
        Transport transport = Truck.getSelectionModel().getSelectedItem();
        int id = transport.getId();
        String str = String.valueOf(id);
        String Table ="transport";
        System.out.println(transport.getId());
        Object selectedItems = Truck.getSelectionModel().getSelectedItems();
        Truck.getItems().remove(selectedItems);
        dataBase.delete(Table,str);
    }
    public void editC(){
        changeTransport.setOnAction(e->{
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("editTC.fxml"));
                Parent root = fxmlLoader.load();
                EditTC controller = fxmlLoader.getController();
                controller.setD(Truck.getSelectionModel().getSelectedItem());
                Stage stage = new Stage();
                stage.initStyle(StageStyle.DECORATED);
                stage.setResizable(false);
                stage.initModality(Modality.APPLICATION_MODAL);
                stage.initStyle(StageStyle.UNIFIED);
                stage.setTitle("Редактирование");
                stage.setScene(new Scene(root));
                stage.showAndWait();
                Truck.getItems().clear();
                setDataTruck();
            } catch (IOException ex) {
                System.err.println("Ошибка открытия формы редактивания: " + ex.getMessage());
                ex.printStackTrace();
            }
        });
    }
}
