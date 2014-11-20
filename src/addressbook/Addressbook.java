/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addressbook;

import javafx.application.Application;
import javafx.scene.Scene;
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
        VBox root = new VBox();
        
        root.getChildren().add(new TextFieldsPartial());
        root.getChildren().add(new ButtonPartial());
        
        //textFieldLayout.setStyle("-fx-spacing:10;-fx-padding:10");
        //buttonLayout.setStyle("-fx-spacing:10;-fx-padding:10");
        
        Scene scene = new Scene(root, 300, 250);
        
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
