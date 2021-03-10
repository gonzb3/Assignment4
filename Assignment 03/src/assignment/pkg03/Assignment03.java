
package assignment.pkg03;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Assignment03 extends Application{

   
    public static void main(String[] args) {
       launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        
        
        Rectangle rctBlue = new Rectangle(1080, 980/3, Color.LIGHTBLUE);
        Rectangle rctGreen = new Rectangle (1080, (980/3)*2, Color.GREEN);
        rctGreen.setY(980/3);
        
        
        
        
        Group gp1 = new Group(rctBlue,rctGreen );
        Group gp2 = new Group();
        
        Scene sn = new Scene(gp1, 1080, 980);
        
        stage.setTitle("A House");
        stage.setScene(sn);
        stage.show();
    }
    
}
