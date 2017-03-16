/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.fhnw.lernstickwelcome.view;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.Pane;


/**
 * FXML Controller class
 *
 * @author user
 */
public class WelcomeApplicationStartController implements Initializable {

    @FXML
    private Button FinishButton;
    @FXML
    private Button SaveButton;
    
    
    private WelcomeApplicationBackupController backup;
    private WelcomeApplicationFirewallController firewall;
    private WelcomeApplicationInformationController information;
    private WelcomeApplicationSystemController system;
    
    //placeholder list
    private String[] menu = {"Information", "Firewall", "Backup", "System"};
    
    
    
    private ResourceBundle bundle;
    @FXML
    private VBox MenuPane;
    @FXML
    private AnchorPane MainPane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        bundle = rb;
        for(int i = 0; i < menu.length; ++i)
        {
            MenuPane.getChildren().add(new Button(menu[i]));
        }
        information = new WelcomeApplicationInformationController();
        MainPane.getChildren().add();
    } 
    
    @FXML
     private void onFinishClickedAction(MouseEvent event) {
        ((Node)(event.getSource())).getScene().getWindow().hide();
        //create progress bar
    }
     
    @FXML
     private void onSaveClickedAction(MouseEvent event) {
        ((Node)(event.getSource())).getScene().getWindow().hide();
        //save all
    }

    
    
}
