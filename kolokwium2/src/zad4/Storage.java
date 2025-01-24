package zad4;

public class Storage <T>{
    T element;

    public void store(T item)
    {
        System.out.println("Storing " + item);
        this.element = item;
    }
    public T retrieve()
    {
        return this.element;
    }
}
