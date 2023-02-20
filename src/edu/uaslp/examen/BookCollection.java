package edu.uaslp.examen;

import java.util.List;

public class BookCollection {
    private String name;
    private List<Book> books;

    public BookCollection(String name ){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void addBook(Book book){
        books.add(book);
    }
    public List<Book> getBooks(){
        return books;
    }
    public int getStars() {
        int prom = 0;
        for(int i = 0; i < books.size(); i++){
            prom+= books.get(i).getStars();
        }
        prom = prom / books.size();
        return prom;
    }
}
