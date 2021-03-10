
package assignment.pkg03;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.StrokeType;
import javafx.stage.Stage;

public class Assignment03 extends Application{

   
    public static void main(String[] args) {
       launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        //Steps 
        int size = 10, stepsWidth = 648, stepsX = 216, stepsY = 735;
        
        //Setting variable 
        Rectangle rctBlue = new Rectangle(1080, 980/2, Color.LIGHTBLUE);
        Rectangle rctGreen = new Rectangle (1080, 980/2, Color.GREEN);                
        Rectangle rctRed = new Rectangle(810,588,Color.CRIMSON);
        Rectangle rctWhite = new Rectangle (810, 980/14,Color.WHITE);
        Rectangle rctBlackDivider = new Rectangle (810,10,Color.LIGHTGREY);
        
        Polygon plyRoof = new Polygon(
                1080/2, 0.0,
                1080/18, 980/4,
                1020, 980/4);
 
        //creating stairs
        Rectangle[] arrRct = new Rectangle[size];
        
        //Setting positions 
        rctGreen.setY(980/2);
        rctRed.setY(980/4);
        rctRed.setX(1080/8);
        rctWhite.setX(1080/8);
        rctWhite.setY(980/4);
        rctBlackDivider.setY(980-(980/4));
        rctBlackDivider.setX(1080/8);
        
        //setting style
        rctRed.setStroke(Color.BLACK);
        rctWhite.setStroke(Color.BLACK);
        plyRoof.setFill(Color.WHITE);
        plyRoof.setStroke(Color.BLACK);
        rctBlackDivider.setStroke(Color.BLACK);
        
        //groups
        Group gp1 = new Group(rctBlue,rctGreen,rctRed,rctWhite, plyRoof,rctBlackDivider);
        
        //stairs for loop
       for (int i = 0; i < size; i++){
           arrRct[i] = new Rectangle(stepsWidth+=i*6,20,Color.LIGHTGRAY);
           arrRct[i].setStroke(Color.BLACK);
           
           if (i == 0){
           arrRct[i].setY(stepsY);}
           else {arrRct[i].setY(stepsY+= 15);}
           
           arrRct[i].setX(stepsX -= i * 3);           
           gp1.getChildren().add(arrRct[i]);
       }
        
        //scenes 
        Scene sn = new Scene(gp1, 1080, 980);
        
        //stage
        stage.setTitle("A House");
        stage.setScene(sn);
        stage.show();
    }
    
}
