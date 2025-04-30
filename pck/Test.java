package pck;

import java.lang.reflect.Array;

public class Test
{
    public static void main (String[] args) 
    {
        int arr1[] = {11, 12, 13,14};
        int arr2[] = {1, 2, 3};
        if (arr1 == arr2) 
            System.out.println("Same");
        else
            System.out.println("Not same");

 System.out.println(Array.getInt(arr1,3));   
 //Class<?> componentType = Integer.class;
 Integer[] array = (Integer[]) Array.newInstance(Integer.class, 3); 
 
 // Initialize and print the array
 array[0] =  30;
 array[1] = 25;
 array[2] =  35;
 array[3]=9;
//arrayindexoutofbond error for [3]
 for (int it : array) {
     System.out.println("it= " +it);

 }


    }
}