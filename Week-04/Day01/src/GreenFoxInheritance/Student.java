package GreenFoxInheritance;

public class Student extends Person {
    private String previousOrganization;
    private int skippedDays=0;

    public Student(String name, Integer age, String gender, String previousOrganizaton){
        this.previousOrganization = previousOrganizaton;
    }
    public Student(){
        this.previousOrganization = "The School of Life";
    }

    public void skipDays(int numberOfDays){
        skippedDays++;
    }


    @Override
    public void getGoal() {
        System.out.println("Be a junior software developer");;
    }

    @Override
    protected String specificIntroduce() {
        return "from "+previousOrganization+" who skipped "+skippedDays+" days from the course already.";

    }

}
