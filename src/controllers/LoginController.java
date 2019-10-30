package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.text.Text;

public class LoginController {

    @FXML
    private TextField userName;
    @FXML
    private PasswordField password;
    @FXML
    private Text message;

    public void login() {
        if (!dataIsEmpty()) {
            System.out.println("los datos no esta bacios");
        } else {
            setMessage("NO PUEDE DEJAR NINGUN CAMPO VACIO");
        }
    }

    // habilita el evento de enter en el boton de inicio de sesion
    public void enterPress(KeyEvent e) {
        if (e.getCode() == KeyCode.ENTER) {
            login();
        }
    }

    // realiza el cambi de foco cuando se presiona enter
    public void changeFocus(KeyEvent e) {
        if (e.getCode() == KeyCode.ENTER) {
            password.requestFocus();
        }
    }

    private boolean dataIsEmpty() {
        if (userName.getText().equals("") ||
                userName.getText().equals(" "))
            return true;
        else if (password.getText().equals("") ||
                password.getText().equals(" "))
            return true;

        return false;
    }

    private void setMessage(String message) {
        this.message.setText(message);
        this.message.setVisible(true);
    }

}
