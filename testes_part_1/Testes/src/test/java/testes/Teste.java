package testes;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;


public class Teste {

    ArrayList<String> women = new ArrayList<>();


    @Test
    public void teste (){
        women.add("isa-f");
        women.add("gabi-f");
        women.add("nati-f");

        women.forEach(people -> {
            var peopleFormatted = people.toLowerCase().toCharArray();
            Assert.assertEquals(peopleFormatted[peopleFormatted.length-1], 'f');
        });
    }

    @Test
    public void teste2 (){
        women.add("caio-m");
        women.add("luis-m");
        women.add("rafael-m");

        women.forEach(people -> {
            var peopleFormatted = people.toLowerCase().toCharArray();
            Assert.assertNotEquals(peopleFormatted[peopleFormatted.length-1], 'f');
        });
    }
}
