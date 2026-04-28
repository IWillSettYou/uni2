package action.user;

import static org.junit.jupiter.api.Assertions.*;
import module org.junit.jupiter;

import module java.base;

public class MultiDimensionalPointTest{

    var md = new MultiDimensionalPoint(new int[] {1,2,3,4});
    @Test
    public void test(){
        var mdp = new MultiDimensionalPoint(new int[] {1,2,3,4});
        assertEquals(2, mdp.get(1));
    }

    @Test
    public void testGet(){

    }
}