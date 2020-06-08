package GreenFoxInheritance;

public class Sponsor extends Person {
    private String company;
    private int hiredStudents = 0;

    public Sponsor(String name, Integer age, String gender, String company){
        this.company = company;
    }
    public Sponsor(){
        this.company = "Google";
    }
    public void hire(){
        hiredStudents++;
    }
    @Override
    public void getGoal(){
        System.out.println("Hire brilliant junior software developers");
    }
    @Override
    protected String specificIntroduce(){
        return " who represents "+company+" and hired "+hiredStudents+" students so far.";
    }

}
