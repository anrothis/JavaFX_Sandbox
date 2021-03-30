package exampleDate;

import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class Controller implements Initializable {

    @FXML
    private DatePicker myDate;
    @FXML
    private Label myLabel;
    @FXML
    private ColorPicker myColor;
    @FXML
    private Pane myPane;
    @FXML
    private Label myFoodLabel;

    String[] food = { "Pizza", "Sushi", "Döner" };
    String currentFood;

    @FXML
    private ListView<String> myField;
    @FXML
    private TreeView<String> myTreeView;

    public void moveUp() {
        System.out.println("Moving up");
    }

    public void moveDown() {
        System.out.println("Moving down");

    }

    public void newMethod() {
        System.out.println("New Selected!");
    }

    public void changeColor(ActionEvent event) {
        Color color = myColor.getValue();
        myPane.setBackground(new Background(new BackgroundFill(color, null, null)));
    }

    public void setDate(ActionEvent event) {
        LocalDate myLocalDate = myDate.getValue();
        System.out.println(myLocalDate);
        String myFormattedDate = myLocalDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        myLabel.setText(myFormattedDate);
    }

    public void selectItem() {
        TreeItem<String> item = myTreeView.getSelectionModel().getSelectedItem();

        if (item != null) {
            System.out.println(item.getValue());
        }
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {

        TreeItem<String> rootItem = new TreeItem<String>("Files",
                new ImageView(new Image("exampleDate/folder_archive.png")));
        TreeItem<String> branchItem1 = new TreeItem<String>("Pics");
        TreeItem<String> branchItem2 = new TreeItem<String>("Vids");
        TreeItem<String> branchItem3 = new TreeItem<String>("Docs");
        TreeItem<String> leafItem1 = new TreeItem<String>("Pic1");
        TreeItem<String> leafItem2 = new TreeItem<String>("Pic2");
        TreeItem<String> leafItem3 = new TreeItem<String>("Vid1");
        TreeItem<String> leafItem4 = new TreeItem<String>("Vid2");
        TreeItem<String> leafItem5 = new TreeItem<String>("Doc1");
        TreeItem<String> leafItem6 = new TreeItem<String>("Doc2");

        rootItem.getChildren().addAll(branchItem1, branchItem2, branchItem3);
        branchItem1.getChildren().addAll(leafItem1, leafItem2);
        branchItem2.getChildren().addAll(leafItem3, leafItem4);
        branchItem3.getChildren().addAll(leafItem5, leafItem6);
        myTreeView.setShowRoot(false);
        myTreeView.setRoot(rootItem);

        myField.getItems().addAll(food);
        myField.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {

            @Override
            public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
                currentFood = myField.getSelectionModel().getSelectedItem();
                myFoodLabel.setText(currentFood);
            }

        });
    }

    public void moveLeft() {
        System.out.println("Moving left");
    }

    public void moveRight() {
        System.out.println("Moving right");
    }
}
