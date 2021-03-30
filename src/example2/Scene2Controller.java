package example2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Scene2Controller {

    @FXML
    private Button logoutButton;
    @FXML
    Label nameLabel;
    @FXML
    private AnchorPane scenePane;

    Stage stage;

    public void displayName(String username) {
        nameLabel.setText("Hallo: " + username);
    }

    public void logout(ActionEvent event) {

        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Logout");
        alert.setHeaderText("Your logged out");
        alert.setContentText("Do you want to save before exiting?: ");

        if (alert.showAndWait().get() == ButtonType.OK) {

            stage = (Stage) scenePane.getScene().getWindow();
            System.out.println("Logout complete");
            stage.close();
        }
    }

}
