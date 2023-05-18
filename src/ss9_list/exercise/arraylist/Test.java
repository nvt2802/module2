package ss9_list.exercise.arraylist;

public class Test {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        myList.add(6);
        myList.add(7);
        myList.add(8);
        myList.add(9);
        myList.add(10);


        myList.clear();

        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        myList.add(6);
        myList.add(7);
        myList.add(8);
        myList.add(9);
        myList.add(10);

        myList.add(5, 100);
        myList.remove(7);
        myList.add(7, 200);


        MyList<Integer> newObj = myList.cloneObj();
        for (int i = 0; i < newObj.size(); i++) {
            System.out.println(newObj.get(i));
        }

        System.out.println(myList.contain(200));
    }
}
