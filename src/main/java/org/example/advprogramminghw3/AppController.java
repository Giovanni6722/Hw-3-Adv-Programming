package org.example.advprogramminghw3;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AppController
{
    @FXML
    private Label finalLabel;
    @FXML
    private TextField interestRate, years, loan, monthly, total;

    @FXML
    protected void onCalcClick()
    {
        finalLabel.setText("   button work");
    }
}
