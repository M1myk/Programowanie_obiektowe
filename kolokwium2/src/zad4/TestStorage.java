package zad4;

public class TestStorage {
    public static void main(String[] args)
    {
        Storage<String> storage = new Storage<>();
        storage.store("Garnek");
        System.out.println(storage.retrieve());

        Storage<Integer> storage2 = new Storage<>();
        storage2.store(10);
        System.out.println(storage2.retrieve());

    }
}
