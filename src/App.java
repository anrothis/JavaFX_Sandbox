import javafx.application.Application;
import javafx.fxml.FXMLLoader;
// import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
// import javafx.scene.image.Image;
// import javafx.scene.image.ImageView;
// import javafx.scene.paint.Color;
// import javafx.scene.shape.Circle;
// import javafx.scene.shape.Line;
// import javafx.scene.shape.Polygon;
// import javafx.scene.shape.Rectangle;
// import javafx.scene.text.Font;
// import javafx.scene.text.Text;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("gui/gui2.fxml"));
            Scene scene = new Scene(root);
            String css1 = this.getClass().getResource("gui/gui2.css").toExternalForm();

            scene.getStylesheets().add(css1);

            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

    // @Override
    // public void start(Stage primaryStage) {
    // // Stage stage = new Stage();
    // Group root = new Group();
    // Scene scene = new Scene(root, 500, 500, Color.DARKORCHID);

    // Text text = new Text("Test Text 1");
    // text.setX(50);
    // text.setY(50);
    // text.setFont(Font.font("Verdana", 50));
    // text.setFill(Color.LIMEGREEN);
    // root.getChildren().add(text);

    // Line line = new Line();
    // line.setStartX(200);
    // line.setStartY(200);
    // line.setEndX(500);
    // line.setEndY(200);
    // line.setStroke(Color.DARKGOLDENROD);
    // line.setOpacity(0.5);
    // line.setRotate(50);
    // root.getChildren().add(line);

    // Rectangle rectangle = new Rectangle();
    // rectangle.setX(100);
    // rectangle.setY(100);
    // rectangle.setWidth(100);
    // rectangle.setHeight(100);
    // rectangle.setFill(Color.DARKBLUE);
    // rectangle.setOpacity(0.7);
    // rectangle.setStroke(Color.BLACK);
    // rectangle.setStrokeWidth(5);
    // root.getChildren().add(rectangle);

    // Polygon triangel = new Polygon();
    // triangel.getPoints().setAll(200.0, 200.0, 300.0, 300.0, 200.0, 300.0);
    // triangel.setFill(Color.LIGHTBLUE);
    // root.getChildren().add(triangel);

    // Circle circle = new Circle();
    // circle.setCenterX(350);
    // circle.setCenterY(350);
    // circle.setRadius(50);
    // root.getChildren().add(circle);

    // Image image = new Image("recourse/activity.png");
    // ImageView imageView = new ImageView(image);
    // imageView.setX(400);
    // imageView.setY(400);
    // root.getChildren().add(imageView);

    // primaryStage.setTitle("Stage Demo Program");
    // // primaryStage.setWidth(500);
    // // primaryStage.setHeight(500);
    // primaryStage.setResizable(false);
    // primaryStage.setX(50);
    // primaryStage.setY(50);
    // primaryStage.setScene(scene);
    // primaryStage.show();
    // }

}