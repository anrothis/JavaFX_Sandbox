package gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

public class GuiControll {

    @FXML
    private Circle myCircle;
    private double x;
    private double y;

    public void up(ActionEvent event) {
        // System.out.println("UP");
        myCircle.setCenterY(y -= 10);
    }

    public void down(ActionEvent event) {
        // System.out.println("down");
        myCircle.setCenterY(y += 10);
    }

    public void left(ActionEvent event) {
        // System.out.println("left");
        myCircle.setCenterX(x -= 10);
    }

    public void right(ActionEvent event) {
        // System.out.println("right");
        myCircle.setCenterX(x += 10);
    }
}
