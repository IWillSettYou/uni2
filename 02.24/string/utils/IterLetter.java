
package string.utils;

public class IterLetter{

    private String str;
    private int printNextCounter;
    private int times;

    public IterLetter(String str, int times){
        this.str = str;
        this.printNextCounter = 0;
        this.times = times;
    }


    public void printNext(){
        if(this.printNextCounter > this.str.length()){
            IO.println();
        } else {
            IO.println(this.str.charAt(this.printNextCounter));
            this.printNextCounter++;
        }
        IO.println("somethin' ain't right bro");
    }
}