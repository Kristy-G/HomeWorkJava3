package Lesson1;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    public ArrayList<T> arrayList;
    public String str;

    public Box(String str) {
        this.str = str;
    }

    public float getWeight() {
        if(!arrayList.isEmpty()){
            return arrayList.size() * arrayList.get(0).getWeight();
        }
        return 0;
    }

    public void addElement(T t) {
        arrayList.add(t);
    }

    public boolean compare(Box b) {
        return Math.abs(this.getWeight() - b.getWeight()) < 0.0001;
    }

    public void moveToAnotherBox(Box b) {
        if(!this.arrayList.isEmpty() && this.str.equals(b.str)) {
            b.arrayList.addAll(this.arrayList);
            this.arrayList.clear();
            System.out.println(this.getWeight());
            System.out.println(b.getWeight());
        }
        else if (this.arrayList.isEmpty()) System.out.println("The box is empty!");
        else System.out.println("Different type of boxes!");
    }
}
