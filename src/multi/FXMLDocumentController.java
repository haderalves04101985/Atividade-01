/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multi;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

/**
 *
 * @author hader
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private Button buttomCalcular;
    @FXML
    private TextField texFieldNumero;
    @FXML
    private Text textFieldDobro;
    @FXML
    private Text textFieldTriplo;
    @FXML
    private Text textFieldQuadrado;
    @FXML
    private Text textFieldCubo;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void calcular(ActionEvent event) {
        String a=texFieldNumero.getText();
        double b=Double.parseDouble(a);
        
        double dobro=b*2;
        textFieldDobro.setText(Double.toString(dobro));
        
        double triplo=b*3;  
        textFieldTriplo.setText(Double.toString(triplo));
        
        double quad=b*b;  
        textFieldQuadrado.setText(Double.toString(quad));
        
        double cubo=b*b*b;
        textFieldCubo.setText(Double.toString(cubo));
        
      
    }
    
}


