package Zoo;

public class Mammal extends Animal{
    Mammal(String name){
        setName(name);
    }
    @Override
    String breed(){
        return "pushing miniature version out.";
     }
}
