/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addressbook;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Ohjelmistokehitys
 */
public class Addressbook extends Application
{
    
    @Override
    public void start(Stage primaryStage)
    {
        // root is the main layout
        HBox root = new HBox();
        VBox leftLayout = new VBox();
        
        TextArea users = new TextArea();
        users.setStyle("-fx-max-width:140;-fx-max-height:230;-fx-spacing:10");
        TextFieldsPartial partial = new TextFieldsPartial();
        leftLayout.getChildren().add(partial);
        leftLayout.getChildren().add(new ButtonPartial(users,partial));
        
        
        root.getChildren().add(leftLayout);
        root.getChildren().add(users);
        
        //users.setStyle("-fx-spacing:5;-fx-padding:5");
        //textFieldLayout.setStyle("-fx-spacing:10;-fx-padding:10");
        //buttonLayout.setStyle("-fx-spacing:10;-fx-padding:10");
        
        Scene scene = new Scene(root, 320, 250);
        
        primaryStage.setTitle("Idea");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        launch(args);
    }
    
}
