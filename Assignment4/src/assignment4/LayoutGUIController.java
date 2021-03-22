/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Eatingplatano
 */
public class LayoutGUIController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
       
    @FXML
    private TextField txtDisplay;

    @FXML
    private Button btn7;

    @FXML
    private Button btn8;

    @FXML
    private Button btn9;

    @FXML
    private Button btnSlash;

    @FXML
    private Button btn4;

    @FXML
    private Button btn5;

    @FXML
    private Button btn6;

    @FXML
    private Button btnMinus;

    @FXML
    private Button btn1;

    @FXML
    private Button btn2;

    @FXML
    private Button btn3;

    @FXML
    private Button btnMul;

    @FXML
    private Button btn0;

    @FXML
    private Button btnEqual;

    @FXML
    private Button btnPlus;
 
    String op ="";
    double num1;
    double num2;
    double numOne , numTwo;
    String option;
    
    public void Numbers (ActionEvent event){
        String selectedNumber = ((Button)event.getSource()).getText();
        txtDisplay.setText(txtDisplay.getText()+selectedNumber);
    }
    
    public void Operation (ActionEvent event){
       
                
        if (((Button)event.getSource() ).getText().equals("+")){numOne=Double.parseDouble(txtDisplay.getText());
                                                                option ="+"; txtDisplay.setText("");}
        if (((Button)event.getSource() ).getText().equals("-")){numOne=Double.parseDouble(txtDisplay.getText());
                                                                option="-"; txtDisplay.setText("");}
        if (((Button)event.getSource() ).getText().equals("/")){numOne=Double.parseDouble(txtDisplay.getText());
                                                                option="/";txtDisplay.setText("");}
        if (((Button)event.getSource() ).getText().equals("*")){numOne=Double.parseDouble(txtDisplay.getText());
                                                                option="*";txtDisplay.setText("");}
    }
    
    public void Solution (ActionEvent event){
       
        numTwo = Double.parseDouble(txtDisplay.getText());
        
       switch(option){
           case "+":
               txtDisplay.setText(""+ (numOne+numTwo));
               break;
           case "-":
               txtDisplay.setText("" + (numOne-numTwo));
               break;
           case "/":
               txtDisplay.setText("" + (numOne/numTwo));
               break;
           case "*":
               txtDisplay.setText("" + (numOne * numTwo));
               break;
        }
        
        
    }
    
    
    
}
