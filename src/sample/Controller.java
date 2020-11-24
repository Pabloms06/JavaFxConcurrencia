package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;


public class Controller {



    public javafx.scene.control.Label label;
    public javafx.scene.control.TextField texto;
    public Button boton;

    @FXML
    private void BotonPulsado(){
        label.setText("");
        String palabra = texto.getText();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        label.setText(palabra.toUpperCase());
    }
}
