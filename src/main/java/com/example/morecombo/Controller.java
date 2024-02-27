package com.example.morecombo;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {


    public TextField partNumTF;
    public Button btn;
    public ComboBox <Part> partCombo;

    private int partId = -1;
    ObservableList<Part> parts = FXCollections.observableArrayList();



    public void onPartCombo(ActionEvent actionEvent) {
    }

    public void onButton(ActionEvent actionEvent) {
        int partToChoose = -1;

        try{

            partToChoose = Integer.parseInt(partNumTF.getText());
            if(partToChoose <= 0 || partToChoose >= partId)
                return;
        }
        catch (NumberFormatException e){
            return;
        }



        // we have a valid partToChoose value
        // lets set the value in the combo box

        for(Part p : partCombo.getItems()){
            if(partToChoose == p.getId()){
                partCombo.setValue(p);
                break;
            }
        }


    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        parts.add(new Part(partId++, "Transponder"));
        parts.add(new Part(partId++, "Cloaking Device"));
        parts.add(new Part(partId++, "Holodock"));
        parts.add(new Part(partId++, "Replicator"));
        parts.add(new Part(partId++, "Tractor Beam"));
        parts.add(new Part(partId++, "Transporter"));
        parts.add(new Part(partId++, "Universal Translator"));
        parts.add(new Part(partId++, "Impulse Drive"));
        parts.add(new Part(partId++, "Poisitronic Brain"));
        parts.add(new Part(partId++, "Shields"));


        partCombo.setItems(parts);

    }
}