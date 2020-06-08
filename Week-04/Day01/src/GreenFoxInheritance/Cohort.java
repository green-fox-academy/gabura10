package GreenFoxInheritance;

import java.util.ArrayList;

public class Cohort extends Person{
    private String name;
    private ArrayList<Student> students;
    private ArrayList<Mentor> mentors;
    public Cohort(String name){
        this.name = name;
    }
    public void addStudent(Student a){
        students.add(a);
    }
    public void addMentor(Mentor a){
        mentors.add(a);
    }
    public void info(){
        System.out.println("The "+name + " cohort has "+ students.size()+ " students and "+mentors.size()+" mentors." );
    }
}
