package com.example.binarytodecimalanddecimaltobinary;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.input.KeyCode;
import javafx.util.converter.DefaultStringConverter;

import java.util.ArrayList;

public class ConverterController {

    @FXML
    private Label decToBiLabel;
    @FXML
    private Label biToDecLabel;
    @FXML
    private TextField decToBiTextField;
    @FXML
    private TextField biToDecTextField;

    public void decToBiLabelMethod(){

        TextFormatter <String> decToBinary = new TextFormatter<>(new DefaultStringConverter(),"",change -> {
            String format = change.getControlNewText();
            if(format.matches("[0-9]*")){
                return change;
            }else {
                return null;
            }
        });

            decToBiTextField.setOnKeyPressed(keyEvent -> {
                if (keyEvent.getCode() == KeyCode.ENTER) {
                    int convert = Integer.parseInt(decToBiTextField.getText());
                    ArrayList<Integer> deciToBi = new ArrayList<>();
                    while (convert>0){
                        deciToBi.add(convert%2);
                        convert /=2;
                    }
                    String total = "";
                    for(int i = 0; i < deciToBi.size();i++){

                        total += deciToBi.get(i);
                    }
                    StringBuilder reversed = new StringBuilder(total).reverse();
                    decToBiLabel.setText(reversed.toString());
                    decToBiTextField.setText("");
                    deciToBi.clear();
                }
            });

            decToBiTextField.setTextFormatter(decToBinary);


    }
    public void biToDecMethod(){
        TextFormatter <String> binaryToDecimal = new TextFormatter<>(new DefaultStringConverter(),"",change -> {
            String format = change.getControlNewText();
            if(format.matches("[0-9]*")){
                return change;

            }else {
                return null;
            }
        });

        biToDecTextField.setOnKeyPressed(keyEvent ->{

            if(keyEvent.getCode() == KeyCode.ENTER){
                StringBuilder reversed = new StringBuilder(biToDecTextField.getText()).reverse();
                ArrayList<String> biToDeci = new ArrayList<>();

                for(int i = 0; i< biToDecTextField.getText().length(); i++ ){
                    biToDeci.add(String.valueOf(reversed.toString().charAt(i)));
                }

                int exponent = 0;
                int total = 0;

                for(int i = 0; i < biToDeci.size();i++ ){
                    int convert = Integer.parseInt(biToDeci.get(i));
                    total += Math.pow(2, exponent)*convert;
                    exponent++;
                }
                biToDecLabel.setText(Integer.toString(total));
                biToDecTextField.setText("");
                biToDeci.clear();
            }
        });

        biToDecTextField.setTextFormatter(binaryToDecimal);
    }

    public void initialize(){


        decToBiLabelMethod();
        biToDecMethod();

    }
}
