package Lesson1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] array = new String[] {"a", "b", "c", "d", "e"};
        changeArr(0, 1, array);
        arrayToArrayList(array);

        Box<Apple> appleBox1 = new Box<Apple>("Apple");
        appleBox1.arrayList = new ArrayList<Apple>();
        appleBox1.addElement(new Apple());
        appleBox1.addElement(new Apple());
        appleBox1.addElement(new Apple());
        System.out.println(appleBox1.getWeight());

        Box<Apple> appleBox2 = new Box<Apple>("Apple");
        appleBox2.arrayList = new ArrayList<Apple>();
        appleBox2.addElement(new Apple());
        appleBox2.addElement(new Apple());
        appleBox2.addElement(new Apple());
        appleBox2.addElement(new Apple());
        appleBox2.addElement(new Apple());
        System.out.println(appleBox2.getWeight());

        Box<Orange> orangeBox1 = new Box<Orange>("Orange");
        orangeBox1.arrayList = new ArrayList<Orange>();
        orangeBox1.addElement(new Orange());
        orangeBox1.addElement(new Orange());
        orangeBox1.addElement(new Orange());
        orangeBox1.addElement(new Orange());
        System.out.println(orangeBox1.getWeight());

        Box<Orange> orangeBox2 = new Box<Orange>("Orange");
        orangeBox2.arrayList = new ArrayList<Orange>();
        orangeBox2.addElement(new Orange());
        orangeBox2.addElement(new Orange());
        orangeBox2.addElement(new Orange());
        System.out.println(orangeBox2.getWeight());

        Box<Orange> orangeBox3 = new Box<Orange>("Orange");
        orangeBox3.arrayList = new ArrayList<Orange>();
        orangeBox3.addElement(new Orange());
        orangeBox3.addElement(new Orange());
        System.out.println(orangeBox3.getWeight());

        System.out.println(appleBox1.compare(appleBox2));
        System.out.println(appleBox1.compare(orangeBox3));

        appleBox1.moveToAnotherBox(appleBox2);
        appleBox1.moveToAnotherBox(orangeBox1);
        orangeBox1.moveToAnotherBox(appleBox1);
        orangeBox3.moveToAnotherBox(appleBox2);

    }

    public static <E> void changeArr (int i, int j, E... arr) {
        if(i < arr.length && i >= 0 && j >= 0 && j < arr.length){
            E element = arr[i];
            arr[i] = arr[j];
            arr[j] = element;
        }
        for(int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println();
    }

    public static <Q> void arrayToArrayList (Q... arr) {
        ArrayList<Q> arrayList = new ArrayList<Q>();
        arrayList.addAll(Arrays.asList(arr));
        System.out.println(arrayList);

    }
}
