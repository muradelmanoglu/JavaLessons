package Mentor.L8.UniversitySystem;

public class Main {

    public static void main(String[] args) {

        Student student = new Student("Murad", "Elmanoğlu");

        student.getDetails();
        student.takeExam();

        System.out.println("\n_______________________________________________");
        Teacher teacher = new Teacher("Orxan", "Alizadeh");
        teacher.getDetails();
        teacher.takeExam();
        teacher.receiveSalary();

    }
}
