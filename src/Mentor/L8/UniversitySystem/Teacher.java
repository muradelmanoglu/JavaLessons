package Mentor.L8.UniversitySystem;

public class Teacher extends User implements ExamParticipant, Payable {

public Teacher(String name, String id){
    super(name,id);
}

@Override
public void receiveSalary() {
    System.out.println(name + " Müəllim aylıq 1500 manat əmək haqqı alır!");
}

@Override
    public void takeExam() {
    System.out.println(name + " Müəllim əmək haqqı artırma imtahanı verdi!");
}

@Override
    public void getDetails() {
    System.out.println("Müəllim: " + name + " " + id);
}

}
