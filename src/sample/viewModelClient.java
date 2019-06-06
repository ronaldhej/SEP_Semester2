package sample;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;

public class viewModelClient
{
    private model model;
    private StringProperty searchText;

    public viewModelClient(model model)
    {
        this.model = model;
        this.searchText = new SimpleStringProperty();

    }


    public void displayPinScene()
    {
        try
        {
            System.out.println("Scene change attempted");
            model.displayPinScene();
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void displayMainScene()
    {
        try
        {
            System.out.println("Scene change attempted");
            model.displayMainScene();
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }


    public StringProperty searchTextProperty() {return searchText;}

}
