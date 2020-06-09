package Zoo;

public class Reptile extends Animal {
    Reptile(String name){
        setName(name);
    }
    @Override
    String breed(){
        return "laying eggs.";
    }
}

