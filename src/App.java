/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication35;


import java.util.ArrayList;
import java.util.Scanner;
import javaapplication35.Item;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class App extends Application {
    
   

    Scanner input = new Scanner(System.in);
    private Member Member = new Member("Latifa", 1234, "L@12", "1234");
    private Librarian Librarian = new Librarian("Sa@12", 1234);
    Stage stage1 = new Stage();
    Stage stage2 = new Stage();

   

    @Override
    public void start(Stage stage) {

        //Items  
        Book b1 = new Book("Programming", "Dr. Sarah Al-Khaldi", "BK101");
        Book b2 = new Book("Ancient Time", "Ms. Laila Al-Zahran", "BK103");
        Journal j1 = new Journal("AI Research", "Dr. Khalid", "JO101", "Science");
        Device d1 = new Device("Smart Laptop", "DV201", "Laptop", "Dell", "XPS 13");
        HeritagleItem h1 = new HeritagleItem("Ancient Pottery", "HI001", "Egypt", 2025);

        // add items into the array list
        Librarian.addItem(b1);
        Librarian.addItem(b2);
        Librarian.addItem(j1);
        Librarian.addItem(d1);
        Librarian.addItem(h1);

        //------------------------------------------------------------------------
        //  Login Interface 
        GridPane loginGrid = new GridPane();
        loginGrid.setAlignment(Pos.CENTER);
        loginGrid.setPadding(new Insets(40));
        loginGrid.setHgap(10);
        loginGrid.setVgap(10);
        loginGrid.setStyle("-fx-background-color: #8FB78F;"); 

        Label title = new Label("Library Login");
        title.setStyle("-fx-text-fill: #28536B; -fx-font-size: 18px;");
        GridPane.setHalignment(title, HPos.CENTER);
        loginGrid.add(title, 0, 0, 2, 1);

        Label nameLabel = new Label("Username:");
        nameLabel.setTextFill(Color.web("#28536B"));
        TextField nameField = new TextField();

        Label passLabel = new Label("Password:");
        passLabel.setTextFill(Color.web("#28536B"));
        PasswordField passField = new PasswordField();

        Label feedback = new Label();
        feedback.setTextFill(Color.web("#F3A5BC")); 

        Button loginButton = new Button("Login");
        loginButton.setStyle("-fx-background-color: #FFC49B; -fx-text-fill: #28536B;"); 

        // Optional image
        ImageView image = new ImageView(new Image("https://i.pinimg.com/736x/c4/73/96/c47396b24dca667b2d57fe471fafd438.jpg"));
        image.setFitWidth(200);
        image.setFitHeight(150);

        loginGrid.add(nameLabel, 0, 1);
        loginGrid.add(nameField, 1, 1);
        loginGrid.add(passLabel, 0, 2);
        loginGrid.add(passField, 1, 2);
        loginGrid.add(feedback, 0, 3, 2, 1);
        loginGrid.add(loginButton, 0, 4, 2, 1);
        loginGrid.add(image, 1, 5);
        GridPane.setHalignment(loginButton, HPos.CENTER);

        Scene loginScene = new Scene(loginGrid, 420, 350);
        stage.setScene(loginScene);
        stage.setTitle("Library Management");
        stage.show();

        // Login Action 
        loginButton.setOnAction(e -> {
            String username = nameField.getText();
            String password = passField.getText();

            if (username.equals(Member.getUsername()) && password.equals(Member.getPassword())) {
                stage.close();
                stage2.show();

            } else if (username.equals(Librarian.getName()) && password.equals(String.valueOf(Librarian.getId()))) {
                stage.close();
                stage1.show();

            } else {
                feedback.setText("Invalid credentials. Try again.");
            }
        });

        //------------------------------------------------------------------------
        //  LibrarianMenu Interface
        VBox LibrarianMenu = new VBox(15);
        LibrarianMenu.setAlignment(Pos.CENTER);
        LibrarianMenu.setStyle("-fx-background-color: #B4CCCF;"); // Azure

        Label header = new Label("Librarian Menu");
        header.setStyle("-fx-text-fill: #28536B; -fx-font-size: 20px; -fx-font-weight: bold;");

        Button addPub = new Button("Add Publication");
        Button removePub = new Button("Remove Publication");
        Button updatePub = new Button("Update Publication");
        Button searchPub = new Button("Search Publication");
        Button logout = new Button("Logout");

        for (Button b : new Button[]{addPub, removePub, updatePub, searchPub, logout}) {
            b.setStyle("-fx-background-color: #F3A5BC; -fx-text-fill: #28536B; -fx-pref-width: 200px; -fx-font-size: 14px;"); // Rose
        }

        //  Add Publication Action
        addPub.setOnAction(e -> {
            Item addItem = new Item();
            System.out.println("Enter the titel:");
            String titel = input.next();
            System.out.println("Enter the code:");
            String code = input.next();
            addItem.setTitle(titel);
            addItem.setCode(code);
            Librarian.addItem(addItem);
            System.out.println("Item have been aaded successfully");
        });

        //Remove Publication Action
        removePub.setOnAction(e -> {
            System.out.println("Enter the code to remove:");
            String Code = input.next();
            Item t = Librarian.searchByCode(Code);
            if (t == null) {
                System.out.println("Item have NOT been found");
            } else {
                Librarian.removeItem(t);
                System.out.println("Item have been removed successfully");
            }
        });

        // Update Publication Action
        updatePub.setOnAction(e -> {
            System.out.println("Enter the code to update");
            String code = input.next();
            Item t1 = Librarian.searchByCode(code);
            if (t1 == null) {
                System.out.println("Item have NOT been found.");
            } else {
                System.out.println("Enter the new title:");
                String newTitle = input.next();
                t1.setTitle(newTitle);
                System.out.println("Title updated successfully.");
            }
        });

        //Search Publication Action
        searchPub.setOnAction(e -> {
            System.out.println("Enter the code:");
            String code = input.next();
            System.out.println(Librarian.searchByCode(code));
        });

        // Logout Action
        logout.setOnAction(e -> stage1.close());

        LibrarianMenu.getChildren().addAll(header, addPub, removePub, updatePub, searchPub, logout);
        stage1.setScene(new Scene(LibrarianMenu, 400, 400));

        //------------------------------------------------------------------------
        //  Members Interface
        VBox librarianLayout = new VBox(15);
        librarianLayout.setAlignment(Pos.CENTER);
        librarianLayout.setStyle("-fx-background-color: #CBE6C7;"); // Pistachio

        Label header1 = new Label("Members Menu");
        header1.setStyle("-fx-text-fill: #28536B; -fx-font-size: 20px; -fx-font-weight: bold;");

        Button searchItem = new Button("Search by Code");
        Button listItems = new Button("View All Items");
        Button logout1 = new Button("Logout");

        for (Button b : new Button[]{searchItem, listItems, logout1}) {
            b.setStyle("-fx-background-color: #FFC49B; -fx-text-fill: #28536B; -fx-pref-width: 200px; -fx-font-size: 14px;"); 
        }

        //Search by Code Action
        searchItem.setOnAction(e -> {
            System.out.println("Enter the code:");
            String code = input.next();
            System.out.println(Librarian.searchByCode(code));
        });

        // View All Items Action
        listItems.setOnAction(e -> {
            System.out.println(Librarian.getItems());
        });

        // Logout Action
        logout1.setOnAction(e -> stage2.close());

        librarianLayout.getChildren().addAll(header1, searchItem, listItems, logout1);
        stage2.setScene(new Scene(librarianLayout, 400, 400));
    }



    public static void main(String[] args) {
    
        launch();
        
        
    }
}


