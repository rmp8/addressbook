/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addressbook;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 *
 * @author Ohjelmistokehitys
 */
public class ButtonPartial extends HBox implements EventHandler<ActionEvent>
{
    private final Button closeButton = new Button("Sulje");
    private final Button saveButton = new Button("Tallenna");
    //private final HBox buttonLayout = new HBox();
    
        
    public ButtonPartial()
    {
        VBox.setMargin(this, new Insets(10,10,10,10));
        this.setStyle("-fx-spacing:5;-fx-padding:5");
        this.getChildren().add(closeButton);
        this.getChildren().add(saveButton);
        
        closeButton.setOnAction(this);
        saveButton.setOnAction(this);
        //inline implementation for eventhandler interface
        /*
        closeButton.setOnAction(new EventHandler<ActionEvent>() 
        {

            @Override
            public void handle(ActionEvent t)
            {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
          */      
    }

    @Override
    public void handle(ActionEvent t)
    {
        if(t.getSource().equals(closeButton))
            Platform.exit();
        else 
            System.out.println("Tallennus...");
    }
}
