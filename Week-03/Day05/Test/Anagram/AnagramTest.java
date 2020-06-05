package Anagram;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {
    @Test
    void isFalse() {
        Anagram ana = new Anagram();
        assertFalse(ana.anagram("mozi", "mozika"));
    }

    @Test
    void isTrue() {
        Anagram ana = new Anagram();
        assertTrue(ana.anagram("mozi", "izom"));
    }
    @Test
    void isEmpty(){
        Anagram ana = new Anagram();
        assertTrue(ana.anagram("",""));
    }
    @Test
    void onlyOneEmpty(){
        Anagram ana = new Anagram();
        assertFalse(ana.anagram("","wat"));
    }
}




