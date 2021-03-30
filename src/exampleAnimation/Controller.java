package exampleAnimation;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.FadeTransition;
import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;

public class Controller implements Initializable {

    @FXML
    private ImageView myImage;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {

        // translate
        TranslateTransition transition = new TranslateTransition();
        transition.setNode(myImage);
        transition.setDuration(Duration.millis(1000));
        transition.setCycleCount(TranslateTransition.INDEFINITE);
        transition.setByX(250);
        transition.play();
        // rotate
        RotateTransition rotate = new RotateTransition();
        rotate.setNode(myImage);
        rotate.setDuration(Duration.millis(1000));
        rotate.setCycleCount(TranslateTransition.INDEFINITE);
        rotate.setInterpolator(Interpolator.LINEAR);
        rotate.setAxis(Rotate.Z_AXIS);
        rotate.setByAngle(360);
        rotate.play();
        // fade
        FadeTransition fade = new FadeTransition();
        fade.setNode(myImage);
        fade.setDuration(Duration.millis(1000));
        fade.setCycleCount(TranslateTransition.INDEFINITE);
        fade.setInterpolator(Interpolator.LINEAR);
        fade.setFromValue(1);
        fade.setToValue(0);
        fade.play();
        // scale
        ScaleTransition scale = new ScaleTransition();
        scale.setNode(myImage);
        scale.setDuration(Duration.millis(1000));
        scale.setCycleCount(TranslateTransition.INDEFINITE);
        scale.setInterpolator(Interpolator.LINEAR);
        scale.setByX(2.0);
        scale.setByY(.5);
        scale.play();
    }

}
