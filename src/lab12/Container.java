package lab12;

import java.util.ArrayList;
import java.util.List;


public class Container<T> {

    private List<T> collection;


    public Container() {
        this.collection = new ArrayList<>();
    }

    public void add(T obj) {
        collection.add(obj);
    }


    public void remove(T obj) {
        collection.remove(obj);
    }


    public T get(int index) {
        return collection.get(index);
    }

    public int size() {
        return collection.size();
    }
}
