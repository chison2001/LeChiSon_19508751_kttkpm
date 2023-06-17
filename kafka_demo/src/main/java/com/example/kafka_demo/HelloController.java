package com.example.kafka_demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextArea messageTextArea;
    @FXML
    private TextField inputTextField;
    private String temp;

    @FXML
    protected void sendMessage() {
        temp += "Le Chi Son:" +  inputTextField.getText() + "\n";
        messageTextArea.setText(temp);
        inputTextField.setText("");
    }
}