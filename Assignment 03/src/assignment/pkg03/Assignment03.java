
package assignment.pkg03;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Assignment03 extends Application{

   
    public static void main(String[] args) {
       launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        //Constant sizes to help with the steps for loop below 
        int size = 10, stepsWidth = 648, stepsX = 216, stepsY = 735;
        
        //Setting variable 
        Rectangle rctBlue = new Rectangle(1080, 980/2, Color.LIGHTBLUE);
        Rectangle rctGreen = new Rectangle (1080, 980/2, Color.GREEN);                
        Rectangle rctRed = new Rectangle(810,588,Color.CRIMSON);
        Rectangle rctWhite = new Rectangle (810, 980/14,Color.WHITE);
        Rectangle rctBlackDivider = new Rectangle (810,10,Color.LIGHTGREY);
        Rectangle rctPilOne = new Rectangle (80,418,Color.WHITE);
        Rectangle rctPilTwo = new Rectangle (80,418,Color.WHITE);
        Rectangle rctPilThree = new Rectangle (80,418,Color.WHITE);
        Rectangle rctPilFour = new Rectangle (80,418,Color.WHITE);
        Rectangle rctDoor1 = new Rectangle (80, 200, Color.WHITE);
        Rectangle rctDoor2 = new Rectangle (80, 250, Color.WHITE);
        Rectangle rctDoor3 = new Rectangle (80, 250, Color.WHITE);
        Rectangle rctSqr = new Rectangle (100,60, Color.LIGHTGRAY);
        Rectangle rctSmOne = new Rectangle (100,20,Color.WHITE);
        Rectangle rctSmTwo = new Rectangle (100,20,Color.WHITE);
        Rectangle rctSmThree = new Rectangle (100,20,Color.WHITE);
        Rectangle rctSmFour = new Rectangle (100,20,Color.WHITE);
        
        //creating the 8 circles 
        Circle cirOne = new Circle(); 
        Circle cirTwo = new Circle(); 
        Circle cirThree = new Circle();
        Circle cirFour = new Circle();
        Circle cirFive = new Circle();
        Circle cirSix = new Circle();
        Circle cirSeven = new Circle();
        Circle cirEight = new Circle();
        
        //using a polyong to create the roof 
        Polygon plyRoof = new Polygon(
                1080/2, 0.0,
                1080/18, 980/4,
                1020, 980/4);
 
        //creating stairs
        Rectangle[] arrRct = new Rectangle[size];
        
        //Setting positions for variables
        rctGreen.setY(980/2);
        rctRed.setY(980/4);
        rctRed.setX(1080/8);
        rctWhite.setX(1080/8);
        rctWhite.setY(980/4);
        rctBlackDivider.setY(980-(980/4));
        rctBlackDivider.setX(1080/8);
        rctPilOne.setY(980/4+70);
        rctPilOne.setX(160);
        rctPilTwo.setY(980/4+70);
        rctPilTwo.setX(380);
        rctPilThree.setY(980/4+70);
        rctPilThree.setX(620);
        rctPilFour.setY(980/4+70);
        rctPilFour.setX(840);
        rctDoor1.setX(265);
        rctDoor1.setY(533);
        rctDoor2.setX(500);
        rctDoor2.setY(483);                
        rctDoor3.setX(730);
        rctDoor3.setY(533);
        rctSqr.setY(380);
        rctSqr.setX(490);
        cirOne.setCenterX(162);
        cirOne.setCenterY(340);
        cirOne.setRadius(25);
        cirTwo.setCenterX(235);
        cirTwo.setCenterY(341);
        cirTwo.setRadius(25);
        cirThree.setCenterX(385);
        cirThree.setCenterY(341);
        cirThree.setRadius(25);
        cirFour.setCenterX(455);
        cirFour.setCenterY(341);
        cirFour.setRadius(25);
        cirFive.setCenterX(625);
        cirFive.setCenterY(341);
        cirFive.setRadius(25);
        cirSix.setCenterX(700);
        cirSix.setCenterY(341);
        cirSix.setRadius(25);
        cirSeven.setCenterX(845);
        cirSeven.setCenterY(341);
        cirSeven.setRadius(25);
        cirEight.setCenterX(915);
        cirEight.setCenterY(341);
        cirEight.setRadius(25);
        rctSmOne.setX(150);
        rctSmOne.setY(715);
        rctSmTwo.setX(370);
        rctSmTwo.setY(715);
        rctSmThree.setX(610);
        rctSmThree.setY(715);
        rctSmFour.setX(830);
        rctSmFour.setY(715);
        

        
        //setting style for the variables, borders and color
        rctRed.setStroke(Color.BLACK);
        rctWhite.setStroke(Color.BLACK);
        plyRoof.setFill(Color.WHITE);
        plyRoof.setStroke(Color.BLACK);
        rctBlackDivider.setStroke(Color.BLACK);
        rctPilOne.setStroke(Color.BLACK);
        rctPilTwo.setStroke(Color.BLACK);
        rctPilThree.setStroke(Color.BLACK);
        rctPilFour.setStroke(Color.BLACK);
        rctDoor1.setStroke(Color.BLACK);
        rctDoor2.setStroke(Color.BLACK);
        rctDoor3.setStroke(Color.BLACK);
        rctSqr.setStroke(Color.BLACK);
        cirOne.setStroke(Color.BLACK);
        cirOne.setFill(Color.WHITE);
        cirTwo.setFill(Color.WHITE);
        cirTwo.setStroke(Color.BLACK);
        cirThree.setFill(Color.WHITE);
        cirThree.setStroke(Color.BLACK);
        cirFour.setFill(Color.WHITE);
        cirFour.setStroke(Color.BLACK);
        cirFive.setFill(Color.WHITE);
        cirFive.setStroke(Color.BLACK);
        cirSix.setFill(Color.WHITE);
        cirSix.setStroke(Color.BLACK);
        cirSeven.setFill(Color.WHITE);
        cirSeven.setStroke(Color.BLACK);
        cirEight.setFill(Color.WHITE);
        cirEight.setStroke(Color.BLACK);
        rctSmOne.setStroke(Color.BLACK);
        rctSmTwo.setStroke(Color.BLACK);
        rctSmThree.setStroke(Color.BLACK);
        rctSmFour.setStroke(Color.BLACK);
        
        //groups
        Group gp1 = new Group(rctBlue,rctGreen,rctRed,rctWhite, plyRoof,rctBlackDivider,rctPilOne,rctPilTwo,rctPilThree,rctPilFour,rctDoor1,rctDoor2,rctDoor3,rctSqr,cirOne,cirTwo,cirThree,cirFour,cirFive,cirSix,cirSeven,cirEight,rctSmOne,rctSmTwo,rctSmThree,rctSmFour);
        
        //stairs for loop populate the steps 
       for (int i = 0; i < size; i++){
           arrRct[i] = new Rectangle(stepsWidth+=i*8,20,Color.LIGHTGRAY);
           arrRct[i].setStroke(Color.BLACK);
           //using a if statment to help position the first steps 
           if (i == 0){
           arrRct[i].setY(stepsY);
           arrRct[i].setX(stepsX);}
           else {arrRct[i].setY(stepsY+= 15);
                 arrRct[i].setX(stepsX -= i * 4); }
               
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
