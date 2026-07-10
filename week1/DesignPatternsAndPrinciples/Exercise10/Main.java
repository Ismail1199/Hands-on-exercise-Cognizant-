package DesignPatternsAndPrinciples.Exercise10;

public class Main {

    public static void main(String[] args) {

        Student model = new Student("Ismail", 101, "A");

        StudentView view = new StudentView();

        StudentController controller =
                new StudentController(model, view);

        controller.updateView();

        System.out.println();

        controller.setStudentName("Rahul");
        controller.setStudentGrade("A+");

        controller.updateView();

    }

}