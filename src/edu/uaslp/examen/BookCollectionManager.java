package edu.uaslp.examen;
import java.util.ArrayList;
import java.util.List;
public class BookCollectionManager {
    private List<BookCollection> collections;

    public BookCollection createCollection(String name){
        BookCollection bookC = new BookCollection(name);
        collections.add(bookC);
        return bookC;
    }
    public BookCollection getCollectionByName (String name){
        BookCollection bookC = null;
         boolean res = true;
        for(int i= 0; i < collections.size() && res; i++){
            if(name. equals(collections.get(i).getName())){
                 bookC = collections.get(i);
                res = false;
            }
        }

        return bookC;
    }
    public void deleteCollectionByName(String name){
        boolean res = true;

        for(int i = 0; i < collections.size() && res; i++){
            if(name.equals(collections.get(i).getName())){
                collections.remove(i);
                res = false;
            }
        }
    }
    public void addBookToCollection(String collectionName, Book book){
        boolean res = true;
        for (BookCollection collection : collections) {
            if (collectionName.equals(collection.getName())) {
                collection.addBook(book);
                res = false;
            }
        }
        if(res){
            createCollection(collectionName);
            addBookToCollection(collectionName,book);
        }
    }
    public List<String> getCollectionNames(){
        List<String> listS = new ArrayList<>();

        for (BookCollection collection : collections) {
            listS.add(collection.getName());
        }

        return listS;
    }
}
