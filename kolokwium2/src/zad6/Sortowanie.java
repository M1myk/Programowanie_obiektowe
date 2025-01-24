package zad6;

import java.util.Arrays;


public class Sortowanie {



    public static <T extends Comparable<T>> void sortDescending(T[] tab)
    {
        Arrays.sort(tab);
    }

    public static <T extends Comparable<T>> void sortDescending1(T[] tab)
    {
        int n = tab.length;
        boolean swapped = true;

        while (swapped)
        {
            swapped = false;
            for(int i = 0; i < n-1; i++)
            {
                if(tab[i].compareTo(tab[i+1]) > 0)
                {
                    T temp = tab[i];
                    tab[i] = tab[i+1];
                    tab[i+1] = temp;
                    swapped = true;
                }
            }
        }
    }



    public static void main(String[] args)
    {


        Integer[] tab = {3,7,1,9,1,7,9,2,0,6};

        System.out.println("--------SPOSOB 1--------");
        for(Integer i : tab)
        {
            System.out.print(i + ", ");
        }
        System.out.println();


       sortDescending(tab);


        for(Integer i : tab)
        {
            System.out.print(i + ", ");
        }
        System.out.println();


        System.out.println("--------SPOSOB 2--------");

        Integer[] tab1 = {3,7,1,9,1,7,9,2,0,6};

        for(Integer i : tab1)
        {
            System.out.print(i + ", ");
        }
        System.out.println();

        sortDescending1(tab1);


        for(Integer i : tab1)
        {
            System.out.print(i + ", ");
        }
        System.out.println();


    }

}
