package array.util;

import static org.junit.jupiter.api.Assertions.*;
import module org.junit.jupiter;


public class ArrayUtilTest{
    @Test
    public void maxLength0(){
        int[] a = {};
        assertEquals(0,array.util.ArrayUtil.max(a));
    }

    
    public void maxLength1(){
        int[] a = {1};
        assertEquals(1,array.util.ArrayUtil.max(a));
    }

   
    public void maxLength2(){
        int[] a = {1,2};
        assertEquals(2,array.util.ArrayUtil.max(a));
    }
}