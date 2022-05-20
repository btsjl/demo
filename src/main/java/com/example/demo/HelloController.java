package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

import java.io.IOException;
public class HelloController {
    public VBox vbox;
    @FXML
   public TextField text,text2;
    @FXML

    public void settext() throws IOException {
        var user = new fileoutput(text.getText(), text2.getText(), "password.txt");
        user.outputfile();
        text.setText(null);
        text2.setText(null);
    }
}