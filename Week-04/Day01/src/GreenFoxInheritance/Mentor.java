package GreenFoxInheritance;

public class Mentor extends Person {
    private String level;

    public Mentor(String name, Integer age, String gender, String level){
        this.level = level;
    }
    public Mentor(){
        this.level = "intermediate";
    }
    @Override
    public void getGoal(){
        System.out.println("Educate brilliant junior software developers");
    }
    @Override
    protected String specificIntroduce(){
        return level+" mentor.";
    }
}
