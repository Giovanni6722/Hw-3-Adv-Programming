package org.example.advprogramminghw3;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AppController
{
    @FXML
    private TextField interestRate, years, loan, monthly, total;

    @FXML
    protected void onCalcClick()
    {
        monthly.setText("button work");
        total.setText("total and monthly also work");
    }
}
