package library;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class HomeController {

    public void goToBookList(ActionEvent actionEvent) throws Exception {
        Parent listBook = FXMLLoader.load(getClass().getResource("book/list/list.fxml"));
        Main.rootStage.setTitle("Books");
        Main.rootStage.setScene(new Scene(listBook,800,600));
    }

    public void goToRents(ActionEvent event) throws Exception{
        Parent listBook = FXMLLoader.load(getClass().getResource("bookrent/create/create.fxml"));
        Main.rootStage.setTitle("Book rents");
        Main.rootStage.setScene(new Scene(listBook,800,600));
    }
}