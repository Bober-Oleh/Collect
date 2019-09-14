package HomeworkCollect;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyListAddTest {

    public static final int SMALL_NUMBER = 100;
    public static final int MEDIUM_NUMBER = 10_000;
    public static final int BIG_NUMBER = 1000_00;

    public static void main(String[] args) {

        List<Integer> myArrayList = new ArrayList<>(1000_000);
        List<Integer> myLinckedList = new LinkedList<Integer>();

        int numberOfElementsToAdd;
        long arrayListTime;
        long linkedListTime;

        //1. Add element to beginning
        System.out.println("---------Add element to beginning----------");

        numberOfElementsToAdd = SMALL_NUMBER;
        arrayListTime = addToBeginning(myArrayList, numberOfElementsToAdd);
        linkedListTime = addToBeginning(myLinckedList, numberOfElementsToAdd);


        System.out.println(numberOfElementsToAdd + " elements");
        System.out.println("arrayListTime = " + arrayListTime);
        System.out.println("linkedListTime = " + linkedListTime);
        System.out.println("----------------------------------");

        numberOfElementsToAdd = MEDIUM_NUMBER;
        arrayListTime = addToBeginning(myArrayList, numberOfElementsToAdd);
        linkedListTime = addToBeginning(myLinckedList, numberOfElementsToAdd);

        System.out.println(numberOfElementsToAdd + " elements");
        System.out.println("arrayListTime = " + arrayListTime);
        System.out.println("linkedListTime = " + linkedListTime);
        System.out.println("----------------------------------");

        numberOfElementsToAdd = BIG_NUMBER;
        arrayListTime = addToBeginning(myArrayList, numberOfElementsToAdd);
        linkedListTime = addToBeginning(myLinckedList, numberOfElementsToAdd);

        System.out.println(numberOfElementsToAdd + " elements");
        System.out.println("arrayListTime = " + arrayListTime);
        System.out.println("linkedListTime = " + linkedListTime);
        System.out.println("----------------------------------");
        System.out.println();

        //2. Add element to end
        numberOfElementsToAdd = SMALL_NUMBER;
        arrayListTime = addToEnd(myArrayList, numberOfElementsToAdd);
        linkedListTime = addToEnd(myLinckedList, numberOfElementsToAdd);

        System.out.println("---------Add element to end----------");
        System.out.println(numberOfElementsToAdd + " elements");
        System.out.println("arrayListTime = " + arrayListTime);
        System.out.println("linkedListTime = " + linkedListTime);
        System.out.println("----------------------------------");

        numberOfElementsToAdd = MEDIUM_NUMBER;
        arrayListTime = addToEnd(myArrayList, numberOfElementsToAdd);
        linkedListTime = addToEnd(myLinckedList, numberOfElementsToAdd);

        System.out.println(numberOfElementsToAdd + " elements");
        System.out.println("arrayListTime = " + arrayListTime);
        System.out.println("linkedListTime = " + linkedListTime);
        System.out.println("----------------------------------");

        numberOfElementsToAdd = BIG_NUMBER;
        arrayListTime = addToEnd(myArrayList, numberOfElementsToAdd);
        linkedListTime = addToEnd(myLinckedList, numberOfElementsToAdd);

        System.out.println(numberOfElementsToAdd + " elements");
        System.out.println("arrayListTime = " + arrayListTime);
        System.out.println("linkedListTime = " + linkedListTime);
        System.out.println("----------------------------------");
        System.out.println();


        //3. Add element to middle
        ArrayList<Integer> arrayList100 = generateArrayListOfIntegers ();
        LinkedList<Integer> linkedList100 = generateLinkedListOfIntegers ();



        numberOfElementsToAdd = SMALL_NUMBER;
        arrayListTime = addToMiddle(myArrayList, numberOfElementsToAdd);
        linkedListTime = addToMiddle(myLinckedList, numberOfElementsToAdd);

        System.out.println("---------Add element to middle----------");
        System.out.println(numberOfElementsToAdd + " elements");
        System.out.println("arrayListTime = " + arrayListTime);
        System.out.println("linkedListTime = " + linkedListTime);
        System.out.println("----------------------------------");

        numberOfElementsToAdd = MEDIUM_NUMBER;
        arrayListTime = addToMiddle(myArrayList, numberOfElementsToAdd);
        linkedListTime = addToMiddle(myLinckedList, numberOfElementsToAdd);

        System.out.println(numberOfElementsToAdd + " elements");
        System.out.println("arrayListTime = " + arrayListTime);
        System.out.println("linkedListTime = " + linkedListTime);
        System.out.println("----------------------------------");

        numberOfElementsToAdd = BIG_NUMBER;
        arrayListTime = addToMiddle(myArrayList, numberOfElementsToAdd);
        linkedListTime = addToMiddle(myLinckedList, numberOfElementsToAdd);

        System.out.println(numberOfElementsToAdd + " elements");
        System.out.println("arrayListTime = " + arrayListTime);
        System.out.println("linkedListTime = " + linkedListTime);
        System.out.println("----------------------------------");
        System.out.println();



    }

    public static long addToBeginning(List<Integer> myList, int numberOfElementsToAdd) {
        long resultTime = 0;
        long time1 = System.currentTimeMillis();
        for (int i = 0; i < numberOfElementsToAdd; i++) {
            myList.add(0, 10);
        }
        long time2 = System.currentTimeMillis();
        resultTime = time2 - time1;
        return resultTime;
    }

    public static long addToEnd(List<Integer> myList, int numberOfElementsToAdd) {
        long resultTime = 0;
        long time1 = System.currentTimeMillis();
        for (int i = 0; i < numberOfElementsToAdd; i++) {
            myList.add(10);
        }
        long time2 = System.currentTimeMillis();
        resultTime = time2 - time1;
        return resultTime;
    }

    public static ArrayList<Integer> generateArrayListOfIntegers (){
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            arrayList.add(10);
        }
        return arrayList;
    }

    public static LinkedList<Integer> generateLinkedListOfIntegers (){
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 100; i++) {
            linkedList.add(10);
        }
        return linkedList;
    }


    public static long addToMiddle(List<Integer> myList, int numberOfElementsToAdd) {

        int midlePosition = 0;
        int listSize = myList.size();

        midlePosition = listSize/2;

        long resultTime = 0;
        long time1 = System.currentTimeMillis();
        for (int i = 0; i < numberOfElementsToAdd; i++) {
            myList.add(midlePosition,10);

            listSize = myList.size();
            midlePosition = listSize/2;
        }
        long time2 = System.currentTimeMillis();
        resultTime = time2 - time1;
        return resultTime;
    }


}
