package Arrays;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        int[] arrayOne = new int[] {5, 3, 6, 7, 9};
        for (int i:arrayOne){
            System.out.println(i);
        }

        int[] arrayTwo = Arrays.copyOf(arrayOne, 10);
        System.out.println(Arrays.toString(arrayTwo));
        Arrays.sort(arrayTwo);
        System.out.println(Arrays.toString(arrayTwo));


        //dodanie nowego elementu na poczatek tablicy
        int[] arrayThree = new int[] {3, 5, 3, 6, 7, 8, 9};//inicjacja tablicy
        System.out.println(Arrays.toString(arrayThree));//wydruk sprawdzajacy
        int[] arrayThreeCopy = Arrays.copyOf(arrayThree, arrayThree.length+1);//stworzenie kopii tablicy z rozmiarem +1
        System.out.println(Arrays.toString(arrayThreeCopy));//wydruk sprawdzajacy
        for (int i = 0; i<arrayThreeCopy.length-1; i++) {
            arrayThreeCopy[arrayThreeCopy.length-1-i]=arrayThreeCopy[arrayThreeCopy.length-2-i];
        }//petla przesuwajaca kazdy element ze strata ostatniego
        System.out.println(Arrays.toString(arrayThreeCopy));//wydruk sprawdzajacy
        arrayThreeCopy[0] = 5;//przypisanie pierwszego elementu
        System.out.println(Arrays.toString(arrayThreeCopy));//wydruk sprawdzajacy
    }
}