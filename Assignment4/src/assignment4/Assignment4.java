/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Eatingplatano
 */
public class Assignment4 extends Application{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        launch(args);
    }
public void start (Stage primaryStage)throws Exception{
    Parent gp = FXMLLoader.load(getClass().getResource("LayoutGUI.fxml"));
    
    primaryStage.setScene(new Scene(gp));
    
    primaryStage.show();
}
}
