import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class LoginSystem extends Application {

    private Map<String, String> userCredentials; // Simulating user data storage (username, hashed password)

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Login System");

        userCredentials = new HashMap<>();

        GridPane grid = createLoginGrid();
        Scene scene = new Scene(grid, 300, 200);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private GridPane createLoginGrid() {
        GridPane grid = new GridPane();
        grid.setAlignment(javafx.geometry.Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        TextField usernameField = new TextField();
        PasswordField passwordField = new PasswordField();
        Button loginButton = new Button("Login");
        Button registerButton = new Button("Register");

        grid.add(new Label("Username:"), 0, 0);
        grid.add(usernameField, 1, 0);
        grid.add(new Label("Password:"), 0, 1);
        grid.add(passwordField, 1, 1);
        grid.add(loginButton, 1, 2);
        grid.add(registerButton, 1, 3);

        // Event handling for login button
        loginButton.setOnAction(e -> {
            String username = usernameField.getText();
            String password = passwordField.getText();

            if (authenticateUser(username, password)) {
                showAlert("Login Successful", "Welcome, " + username + "!");
            } else {
                showAlert("Login Failed", "Invalid username or password.");
            }
        });

        // Event handling for register button
        registerButton.setOnAction(e -> {
            String username = usernameField.getText();
            String password = passwordField.getText();

            if (registerUser(username, password)) {
                showAlert("Registration Successful", "User registered successfully!");
            } else {
                showAlert("Registration Failed", "Username already exists.");
            }
        });

        return grid;
    }

    private boolean authenticateUser(String username, String password) {
        // In a real-world scenario, you would check against a database and use hashed passwords
        return userCredentials.containsKey(username) && userCredentials.get(username).equals(password);
    }

    private boolean registerUser(String username, String password) {
        // In a real-world scenario, you would hash the password and store it securely
        if (!userCredentials.containsKey(username)) {
            userCredentials.put(username, password);
            return true;
        }
        return false;
    }

    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
