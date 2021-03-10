
package assignment.pkg03;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Assignment03 extends Application{

   
    public static void main(String[] args) {
       launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        Group gp1 = new Group();
        
        Scene sn = new Scene(gp1, 1080, 980);
        
        stage.setTitle("A House");
        stage.setScene(sn);
        stage.show();
    }
    
}
