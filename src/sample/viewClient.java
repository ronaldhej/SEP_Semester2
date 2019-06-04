package sample;

import javafx.scene.Scene;

public class viewClient
{
    private viewModelClient viewModel;
    private Scene scene;
    private String title;


    public viewClient()
    {

    }

    public void init(viewModelClient viewModel, String title, Scene scene)
    {
        this.title = title;
        this.scene = scene;
        this.viewModel = viewModel;

        // Add the text fields etc here as textProperty and send it to the viewModel's usernameProperty method
    }

    public String getTitle(){return title;}
    public Scene getScene(){return scene;}

}
