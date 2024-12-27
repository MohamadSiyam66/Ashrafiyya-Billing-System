package org.billingsys.ashrafiyabillingsystem;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class BillingController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}