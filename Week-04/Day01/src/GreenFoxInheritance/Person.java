package GreenFoxInheritance;

public class Person {
    private String name;
    private int age;
    private String gender;
    public Person(){
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = "female";
    }
    public Person(String name, Integer age, String gender){
        this.name = name;
        this.age = age;
        this.gender= gender;
    }
    public void introduce(){
        System.out.println("Hi, I'm "+name+",a "+age+" year old "+gender+this.specificIntroduce());
    }
    protected String specificIntroduce(){
        return "";
    }
    public void getGoal(){
        System.out.println("My goal is: Live for the moment!");
    }
}
