package example4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller {

    @FXML
    private CheckBox myCheckBox;
    @FXML
    private Label myIdLabel;
    @FXML
    private ImageView myImageView;

    int age;
    Image myImage1 = new Image(getClass().getResourceAsStream("1.jpg"));
    Image myImage2 = new Image(getClass().getResourceAsStream("2.jpg"));

    public void change(ActionEvent event) {
        if (myCheckBox.isSelected()) {
            myIdLabel.setText("ON");
            myImageView.setImage(myImage2);
        } else {

            myIdLabel.setText("OFF");
            myImageView.setImage(myImage1);

        }
    }
}
