package array.util;

public class ArrayUtil{

    public static int max(int[] l){
        if(l.length == 0){
            return 0;
        }
        int listMax = Integer.MIN_VALUE;
        for(int i = 0; i < l.length; i++ ){
            if(l[i] > listMax) listMax = l[i];
        }
        return listMax;
    }
    public static int max2(int[] l){
        if(l.length == 0){
            return 0;
        }
        int listMax = Integer.MIN_VALUE;
        for(int i = 0; i < l.length; i++ ){
            listMax = (listMax < l[i]) ? listMax : l[i];
        }
        return listMax;
    }
    
    public static int max3(int[] l){
        if(l.length == 0){
            return 0;
        }
        int listMax = Integer.MIN_VALUE;
        for(int i = 0; i < l.length; i++ ){
            listMax = Math.max(l[i], listMax);
        }
        return listMax;
    }

    public static int max4(int[] l){
        if(l.length == 0){
            return 0;
        }
        int listMax = Integer.MIN_VALUE;
        for(int n : l){
            listMax = Math.max(n, listMax);
        }
        return listMax;
    }

    public static int[] minMax(int[] l) {
        if(l.length == 0){
            return new int[] {0,0};
        }
        int listMax = Integer.MIN_VALUE;
        int listMin = Integer.MAX_VALUE;
        for(int n : l){
            listMax = Math.max(n, listMax);
        }
        for(int n : l){
            listMin = Math.min(n, listMin);
        }
        return new int[] {listMin, listMax};
    }
}

