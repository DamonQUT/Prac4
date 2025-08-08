package com.example.practical4;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Button;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private TextArea termsAndConditions;
    @FXML
    private CheckBox agreeCheckBox;
    @FXML
    private Button nextButton;

    @FXML
    public void initialize() {
        termsAndConditions.setText("""
You are the assMAN!""");
    }

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to the Address Book Application!");
    }

    @FXML
    protected void onAgreeCheckBoxClick() {
        boolean accepted = agreeCheckBox.isSelected();
        nextButton.setDisable(!accepted);
    }
}