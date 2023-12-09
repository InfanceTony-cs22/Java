import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class StudentInformationSystem extends Application {

    private ObservableList<Student> students = FXCollections.observableArrayList();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Student Information System");

        // Create UI elements
        TableView<Student> table = new TableView<>();
        table.setItems(students);

        TableColumn<Student, String> nameColumn = new TableColumn<>("Name");
        nameColumn.setCellValueFactory(cellData -> cellData.getValue().nameProperty());
        TableColumn<Student, Integer> ageColumn = new TableColumn<>("Age");
        ageColumn.setCellValueFactory(cellData -> cellData.getValue().ageProperty().asObject());
        TableColumn<Student, String> gradeColumn = new TableColumn<>("Grade");
        gradeColumn.setCellValueFactory(cellData -> cellData.getValue().gradeProperty());

        table.getColumns().addAll(nameColumn, ageColumn, gradeColumn);

        TextField nameInput = new TextField();
        nameInput.setPromptText("Name");
        TextField ageInput = new TextField();
        ageInput.setPromptText("Age");
        ComboBox<String> gradeInput = new ComboBox<>();
        gradeInput.getItems().addAll("A", "B", "C", "D", "F");
        gradeInput.setPromptText("Grade");

        Button addButton = new Button("Add Student");
        addButton.setOnAction(e -> addStudent(nameInput.getText(), ageInput.getText(), gradeInput.getValue()));

        // Create layout
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(8);
        grid.setHgap(10);

        GridPane.setConstraints(nameInput, 0, 0);
        GridPane.setConstraints(ageInput, 1, 0);
        GridPane.setConstraints(gradeInput, 2, 0);
        GridPane.setConstraints(addButton, 3, 0);

        grid.getChildren().addAll(nameInput, ageInput, gradeInput, addButton);
        grid.getChildren().add(table);

        Scene scene = new Scene(grid, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void addStudent(String name, String age, String grade) {
        if (!name.isEmpty() && !age.isEmpty() && !grade.isEmpty()) {
            students.add(new Student(name, Integer.parseInt(age), grade));
            clearInputFields();
        }
    }

    private void clearInputFields() {
        nameInput.clear();
        ageInput.clear();
        gradeInput.getSelectionModel().clearSelection();
    }

    public static class Student {
        private final String name;
        private final int age;
        private final String grade;

        public Student(String name, int age, String grade) {
            this.name = name;
            this.age = age;
            this.grade = grade;
        }

        public StringProperty nameProperty() {
            return new SimpleStringProperty(name);
        }

        public IntegerProperty ageProperty() {
            return new SimpleIntegerProperty(age);
        }

        public String gradeProperty() {
            return grade;
        }
    }

}
