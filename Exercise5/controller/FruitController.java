package controller;

import javax.swing.text.html.ImageView;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;

import model.*;

public class FruitController {

    

    @FXML
    Button btn1, btn2,btn3,btn4,btn5;

    Beatriz beatriz = new Beatriz();
    Christine christine = new Christine();
    Terrence terrence = new Terrence();
    Allen allen = new Allen();
    Darwin darwin = new Darwin();


    public void initialize() {

        allen.setName("Allen Incencio");
        allen.setage("21");

        beatriz.setName("Beatriz Asuncion");
        beatriz.setage("19");

        
        christine.setName("Christine Lu");
        christine.setage("19");
        
        darwin.setName("Darwin Umengan");
        darwin.setage("19");

        terrence.setName("Terrence Dionela");
        terrence.setage("19");

        
    }

    public void showInfo(ActionEvent event) {

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton.equals(btn1)) {
            alert.setContentText("Hi my name is " + christine.getName() + " and my age is  " + christine.getage() + " yrs old");
        }

        if (sourceButton == btn2) {
            alert.setContentText("Hi my name is " + beatriz.getName() + " and my age is  " + beatriz.getage() + "yrs old");
        }
        if (sourceButton.equals(btn3)) {
            alert.setContentText("Hi my name is " + allen.getName() + " and my age is  " + allen.getage() + " yrs old");
        }

        if (sourceButton == btn4) {
            alert.setContentText("Hi my name is " + terrence.getName() + " and my age is  " + terrence.getage() + " yrs old");
        }
        if (sourceButton == btn5) {
            alert.setContentText("Hi my name is " + darwin.getName() + " and my age is  " + darwin.getage() + " yrs old");
        }


        alert.showAndWait();

    }
}
