package Zoo;

public class Bird extends Animal{
    Bird(String name){
        setName(name);
    }
    @Override
    String breed() {
        return "laying eggs.";
    }
}
