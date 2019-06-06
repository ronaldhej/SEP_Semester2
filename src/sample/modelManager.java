package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class modelManager implements model
{
    private Stage currentWindow;
    private ActionEvent actionEvent;

    public modelManager()
    {
        this.currentWindow = mainView.getPrimaryStage();
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

    public void displayMainScene()
    {
        try
        {
            Stage currentStage = mainView.getPrimaryStage();
        } catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    public void displayPinScene()
    {
        try
        {
            currentWindow = mainView.getPrimaryStage();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("pinPrompt.fxml"));
            Parent root = loader.load();
            Scene pinScene = new Scene(root, 800,600);
            currentWindow.setScene(pinScene);
            // viewPinPrompt.init();

        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }

}
