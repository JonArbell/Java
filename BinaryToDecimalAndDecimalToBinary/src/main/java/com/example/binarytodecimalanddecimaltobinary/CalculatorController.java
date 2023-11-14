package com.example.binarytodecimalanddecimaltobinary;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalculatorController {
    @FXML
    private TextField textField;
    @FXML
    private Label resultLabel;
    @FXML
    private Button historyButton;
    static long result = 0;

    public void historyButtonOnAction(ActionEvent event){


    }

    public void plusButtonOnAction(ActionEvent event){
        String currentText = textField.getText();
        if(!textField.getText().equals("0")){

            if(currentText.charAt(currentText.length()-1)!='+'){
                textField.setText(currentText + "+");
            }
            if(currentText.charAt(currentText.length()-1)=='/'||currentText.charAt(currentText.length()-1)=='-'||currentText.charAt(currentText.length()-1)=='*'||currentText.charAt(currentText.length()-1)=='%'){
                textField.setText(currentText.substring(0,currentText.length()-1) + "+");
            }
        }else {
            textField.setText(currentText + "+");
        }
    }
    public void doubleZeroButtonOnAction(ActionEvent event){
        String currentText = textField.getText();
        textField.setText(currentText + "00");

    }
    public void singleZeroButtonOnAction(ActionEvent event){
        String currentText = textField.getText();
        if(currentText.equals("0")){
            textField.setText("0");
        }else {
            textField.setText(currentText+"0");
        }
    }
    public void oneButtonOnAction(ActionEvent event){
        String currentText = textField.getText();
        if(currentText.equals("0")){
            textField.setText("1");
        }else {
            textField.setText(currentText+"1");
        }

    }
    public void twoButtonOnAction(ActionEvent event){
        String currentText = textField.getText();
        textField.setText(currentText+"2");
    }
    public void threeButtonOnAction(ActionEvent event){
        String currentText = textField.getText();
        if(currentText.equals("0")){
            textField.setText("3");
        }else {
            textField.setText(currentText+"3");
        }
    }
    public void fourButtonOnAction(ActionEvent event){
        String currentText = textField.getText();
        if(currentText.equals("0")){
            textField.setText("4");
        }else {
            textField.setText(currentText+"4");
        }
    }
    public void fiveButtonOnAction(ActionEvent event){
        String currentText = textField.getText();
        if(currentText.equals("0")){
            textField.setText("5");
        }else {
            textField.setText(currentText+"5");
        }

    }

    public void sixButtonOnAction(ActionEvent event){
        String currentText = textField.getText();
        if(currentText.equals("0")){
            textField.setText("6");
        }else {
            textField.setText(currentText+"6");
        }
    }
    public void sevenButtonOnAction(ActionEvent event){
        String currentText = textField.getText();
        if(currentText.equals("0")){
            textField.setText("7");
        }else {
            textField.setText(currentText+"7");
        }
    }
    public void eightButtonOnAction(ActionEvent event){
        String currentText = textField.getText();
        if(currentText.equals("0")){
            textField.setText("8");
        }else {
            textField.setText(currentText+"8");
        }
    }
    public void nineButtonOnAction(ActionEvent event){
        String currentText = textField.getText();
        if(currentText.equals("0")){
            textField.setText("9");
        }else {
            textField.setText(currentText+"9");
        }
    }
    public void clearButtonOnAction(ActionEvent event){
        textField.setText("0");
    }

    public void divideButtonOnAction(ActionEvent event){

        String currentText = textField.getText();
        if(!textField.getText().equals("0")){

            if(currentText.charAt(currentText.length()-1)!='/'){
                textField.setText(currentText + "/");
            }
            if(currentText.charAt(currentText.length()-1)=='+'||currentText.charAt(currentText.length()-1)=='-'||currentText.charAt(currentText.length()-1)=='*'||currentText.charAt(currentText.length()-1)=='%'){
                textField.setText(currentText.substring(0,currentText.length()-1) + "/");
            }
        }else {
            textField.setText(currentText + "/");
        }

    }
    public void multiButtonOnAction(ActionEvent event){
        String currentText = textField.getText();
        if(!textField.getText().equals("0")){

            if(currentText.charAt(currentText.length()-1)!='*'){
                textField.setText(currentText + "*");
            }
            if(currentText.charAt(currentText.length()-1)=='+'||currentText.charAt(currentText.length()-1)=='-'||currentText.charAt(currentText.length()-1)=='/'||currentText.charAt(currentText.length()-1)=='%'){
                textField.setText(currentText.substring(0,currentText.length()-1) + "*");
            }
        }else {
            textField.setText(currentText + "*");
        }
    }
    public void minusButtonOnAction(ActionEvent event){
        String currentText = textField.getText();
        if(!textField.getText().equals("0")){

            if(currentText.charAt(currentText.length()-1)!='-'){
                textField.setText(currentText + "-");
            }
            if(currentText.charAt(currentText.length()-1)=='+'||currentText.charAt(currentText.length()-1)=='*'||currentText.charAt(currentText.length()-1)=='/'||currentText.charAt(currentText.length()-1)=='%'){
                textField.setText(currentText.substring(0,currentText.length()-1) + "-");
            }
        }else {
            textField.setText(currentText + "-");
        }
    }
    public void deleteButtonOnAction(ActionEvent event){

        int currentText = textField.getText().length()-1;
        textField.setText(textField.getText().substring(0,currentText));

        if(textField.getText().isBlank()){
            textField.setText("0");
        }

    }

    public void equalButtonOnAction(ActionEvent event) {


        if(!textField.getText().equals("0")){

            String x = "5";
            for(int i = 0;true;){
                System.out.println(x);
            }
        }

    }
    public void percentageButtonOnAction(ActionEvent event){
        String currentText = textField.getText();
        if(!textField.getText().equals("0")){

            if(currentText.charAt(currentText.length()-1)!='%'){
                textField.setText(currentText + "%");
            }
            if(currentText.charAt(currentText.length()-1)=='+'||currentText.charAt(currentText.length()-1)=='*'||currentText.charAt(currentText.length()-1)=='/'||currentText.charAt(currentText.length()-1)=='-'){
                textField.setText(currentText.substring(0,currentText.length()-1) + "-");
            }
        }else {
            textField.setText(currentText + "%");
        }
    }
    public void pointButtonOnAction(ActionEvent event){
        String currentText = textField.getText();
        if(currentText.charAt(currentText.length()-1)!='.'){
            if(currentText.charAt(currentText.length()-1)!='+'&&currentText.charAt(currentText.length()-1)!='*'&&currentText.charAt(currentText.length()-1)!='/'&&currentText.charAt(currentText.length()-1)!='-'){
                textField.setText(currentText+".");
            }
        }

    }

    public void initialize(){

        textField.setText("0");
        textField.setFocusTraversable(false);
        textField.setEditable(false);

    }

}
