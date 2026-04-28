package action.user;

import action.Scalable;
import action.Undoable;
import java.lang.*;


public class MultiDimensionalPoint implements Scalable, Undoable{

    private int[] coordinates;
    private int[] lastCoordinates;

    public MultiDimensionalPoint(int[] coordinates){
        this.lastCoordinates = coordinates;
        this.coordinates = coordinates;
    }

    public int get(int idx){
        return coordinates[idx];
    }

    public void set(int idx, int value){
        coordinates[idx] = value;
    }

    public void scale(int factor){
        for(int i = 0; i < coordinates.length; i++){
            coordinates[i]*=factor;
        }
    }

    private void saveToLast(){
        this.lastCoordinates = this.coordinates;
    }

    public void undoLast(){
        this.coordinates = this.lastCoordinates;
    }

    public boolean eq(){
        if(this.coordinates == this.lastCoordinates) return true;
        return false;
    }

    @Override 
    public String toString(){
        StringBuilder sb = new StringBuilder("(");
        for(int coord : this.coordinates){
            sb.append(coord + ", ");
        }
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MultiDimensionalPoint that = (MultiDimensionalPoint) o;
        return java.util.Arrays.equals(coordinates, that.coordinates); 
    }


}