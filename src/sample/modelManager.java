package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class modelManager implements model
{

    public modelManager()
    {

    }

    public void openNewWindow(String windowPath)
    {
        Parent root;
        try
        {
            root = FXMLLoader.load(getClass().getClassLoader().getResource(windowPath));
            Stage stage = new Stage();
            stage.setTitle("Attendance System");
            stage.setScene(new Scene(root, 450, 450));
            stage.show();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

}
