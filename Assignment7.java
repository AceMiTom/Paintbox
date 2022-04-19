/**
 * Assignment #7 
 NAME: QUAN NGUYEN ANH
 CLASS: CSE 205 TUES THURS 1:30-2:45PM
 ID: 1221561614
 Description: Practice creating objects using SketchPane
 **/
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
public class Assignment7 extends Application
{
    public static final int WINSIZE_X = 800, WINSIZE_Y = 800;
    private final String WINTITLE = "Sketchy";
    @Override
    public void start(Stage stage) throws Exception
    {
        SketchPane rootPane = new SketchPane();
        rootPane.setPrefSize(WINSIZE_X, WINSIZE_Y);
        Scene scene = new Scene(rootPane, WINSIZE_X, WINSIZE_Y);
        stage.setTitle(WINTITLE);
        stage.setScene(scene);
        stage.show();
    }
    /**
     * Technically this is not needed for JavaFX applications. Added just in case.
     *
     * @param args
     */
    public static void main(String[] args)
    {
        launch(args);
    }
}