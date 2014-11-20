/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addressbook;

import java.util.ArrayList;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
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
    private final Button printButton = new Button("Tulosta");
    //private final HBox buttonLayout = new HBox();
    private ArrayList<UserInfo> userInfo = new ArrayList();
    private TextArea users;
    private TextFieldsPartial partial;
        
    public ButtonPartial(TextArea users, TextFieldsPartial partial)
    {
        //VBox.setMargin(this, new Insets(10,10,10,10));
        this.partial = partial;
        this.users = users;
        
        
        this.setStyle("-fx-spacing:5;-fx-padding:5");
        this.getChildren().add(closeButton);
        this.getChildren().add(saveButton);
        this.getChildren().add(printButton);
        
        
        closeButton.setOnAction(this);
        saveButton.setOnAction(this);
        printButton.setOnAction(this);
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
/*
    ButtonPartial(TextArea users, TextFieldsPartial partial)
    {
        this.users = users;
        
    }
*/
    @Override
    public void handle(ActionEvent t)
    {
        if(t.getSource().equals(closeButton))
            Platform.exit();
        else if(t.getSource().equals(saveButton))
        {
            
            System.out.println("Tallennus...");
        }
        else
        {
            
        }
            
    }
}
