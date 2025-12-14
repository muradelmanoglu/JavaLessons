package Mentor.L8.UniversitySystem;

import Mentor.L8.Employee.Person;

public class Student extends User implements ExamParticipant {

public Student(String name,String id){
    super(name,id);
}

    @Override
    public void takeExam() {
        System.out.println(name + " imtahanı verdi!");
    }

    @Override
    public void getDetails() {
        System.out.println("\nTələbə: " + name + " " + id);
    }

}
