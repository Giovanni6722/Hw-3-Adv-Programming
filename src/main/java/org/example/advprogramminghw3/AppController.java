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
      try
      {
            double annualRate = Double.parseDouble(interestRate.getText().trim());
            double totalYears = Double.parseDouble(years.getText().trim());
            double loanTotal = Double.parseDouble(loan.getText().trim());
            if(annualRate <= 0 || totalYears <= 0 || loanTotal <= 0)
            {
                monthly.setText("Inputs must be greater then 0");
                total.setText("Inputs must be greater then 0");
                return;
            }
            double monthlyRate = annualRate / 1200;
            double numOfPaymentsMonthly = totalYears * 12;
            double finalMonthlyRate = loanTotal * monthlyRate /
                                        (1 - Math.pow(1 + monthlyRate, -numOfPaymentsMonthly));
            double totalPay = finalMonthlyRate * numOfPaymentsMonthly;
            monthly.setText(String.format("$%.2f", finalMonthlyRate));
            total.setText(String.format("$%.2f", totalPay));
      }
      catch(NumberFormatException e)
      {
          monthly.setText("Please enter valid numbers only");
          total.setText("Please enter valid numbers only");
      }
      catch(NullPointerException e)
      {
          monthly.setText("All fields must be filled");
          total.setText("All fields must be filled");
      }
    }
}
