package Sum;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {



    @Test
    void getSum(){
        ArrayList<Integer> list =new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(70);
        Sum numbers = new Sum();
        assertEquals(100, numbers.sum(list));
    }
    @Test
    void emptyList(){
        ArrayList<Integer> list =new ArrayList<>();
        Sum numbers = new Sum();
        assertEquals(0,numbers.sum(list));
    }
    @Test
    void oneElement(){
        ArrayList<Integer> list =new ArrayList<>();
        list.add(10);
        Sum numbers = new Sum();
        assertEquals(10,numbers.sum(list));

    }
    @Test
    void nullElement(){
        ArrayList<Integer> list =new ArrayList<>();
        list.add(null);
        Sum numbers = new Sum();
        assertEquals(0,numbers.sum(list));
    }




}