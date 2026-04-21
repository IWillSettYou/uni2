package printed.material;

import java.util.*;
import java.lang.*;

public class Book {
    public static final String DEFAULT_AUTHOR = "John Steinbeck";
    public static final String DEFAULT_TITLE = "Of Mice and Men";
    public static final int DEFAULT_PAGE_COUNT = 107;

    private String author;
    private String title;
    protected int pageCount;

    public Book(){
        checkInitData(this.author, this.title, this.pageCount);
        initBook(this.author, this.title, this.pageCount);

    }

    public Book(String author, String title, int pageCount){
        this.author = author;
        this.title = title;
        this.pageCount = pageCount;
        initBook(this.author, this.title, this.pageCount);
    }
    public String getAuthor(){
        return this.author;
    }

    public String getTitle(){
        return this.title;
    }

    public int getPageCount(){
        return this.pageCount;
    }

    private void checkInitData(String author, String title, int pageCount)throws 
    IllegalArgumentException{
        if(author.length() < 2 || title.length() < 4 || pageCount < 0){
            throw new IllegalArgumentException();
        }
    }

    protected void initBook(String author, String title, int pageCount){

    }

    protected String getAuthorWithInitials(){

        List<String> authorName = new ArrayList<>(Arrays.asList(this.author.split(" ")));

        StringBuilder monogram = new StringBuilder();

        for (String nev : new ArrayList<>(Arrays.asList(authorName.get(0).split(" ")))) {
            if (!nev.isEmpty()) { 
                monogram.append(nev.charAt(0) + '.');
                
            }
        }

        String eredmeny = monogram.toString().toUpperCase();
        System.out.println("A monogram: " + eredmeny);


        return "";
    }

    public int getPrice(){
        return 0;
    }

    @Override public String toString(){
       return "bruh";
    }

    public String getShortInfo(){
        return "";
    }

    public String createReference(String articleTitle, int from, int to){
        return "";
    }

    public static Book decode(String input){
        
        return new Book(){};
    }

}