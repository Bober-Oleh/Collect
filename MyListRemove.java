package HomeworkCollect;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MyListRemove {

    public static final int SMALL_NUMBER = 100;
    public static final int MEDIUM_NUMBER = 10_000;
    public static final int BIG_NUMBER = 100_000;

    public static void main(String[] args) {

        ArrayList<Integer> arrayList100_000;
        LinkedList<Integer> linkedList100_000;


        int numberOfElementsToRemove;
        long arrayListTime;
        long linkedListTime;

        //4. Remove element from beginning

        System.out.println("---------Remove element from beginning----------");

        numberOfElementsToRemove = SMALL_NUMBER;
        arrayList100_000 = generateArrayListOfIntegers();
        linkedList100_000 = generateLinkedListOfIntegers();
        arrayListTime = removeFromBeginning(arrayList100_000, numberOfElementsToRemove);
        linkedListTime = removeFromBeginning(linkedList100_000, numberOfElementsToRemove);


        System.out.println(numberOfElementsToRemove + " elements");
        System.out.println("arrayListTime = " + arrayListTime);
        System.out.println("linkedListTime = " + linkedListTime);
        System.out.println("----------------------------------");

        numberOfElementsToRemove = MEDIUM_NUMBER;
        arrayList100_000 = generateArrayListOfIntegers();
        linkedList100_000 = generateLinkedListOfIntegers();
        arrayListTime = removeFromBeginning(arrayList100_000, numberOfElementsToRemove);
        linkedListTime = removeFromBeginning(linkedList100_000, numberOfElementsToRemove);

        System.out.println(numberOfElementsToRemove + " elements");
        System.out.println("arrayListTime = " + arrayListTime);
        System.out.println("linkedListTime = " + linkedListTime);
        System.out.println("----------------------------------");

        numberOfElementsToRemove = BIG_NUMBER;
        arrayList100_000 = generateArrayListOfIntegers();
        linkedList100_000 = generateLinkedListOfIntegers();
        arrayListTime = removeFromBeginning(arrayList100_000, numberOfElementsToRemove);
        linkedListTime = removeFromBeginning(linkedList100_000, numberOfElementsToRemove);

        System.out.println(numberOfElementsToRemove + " elements");
        System.out.println("arrayListTime = " + arrayListTime);
        System.out.println("linkedListTime = " + linkedListTime);
        System.out.println("----------------------------------");
        System.out.println();

        //5. Remove element from end

        System.out.println("---------Remove element from end----------");

        numberOfElementsToRemove = SMALL_NUMBER;
        arrayList100_000 = generateArrayListOfIntegers();
        linkedList100_000 = generateLinkedListOfIntegers();

        arrayListTime = removeFromEnd(arrayList100_000, numberOfElementsToRemove);
        linkedListTime = removeFromEnd(linkedList100_000, numberOfElementsToRemove);

        System.out.println(numberOfElementsToRemove + " elements");
        System.out.println("arrayListTime = " + arrayListTime);
        System.out.println("linkedListTime = " + linkedListTime);
        System.out.println("----------------------------------");

        numberOfElementsToRemove = MEDIUM_NUMBER;
        arrayList100_000 = generateArrayListOfIntegers();
        linkedList100_000 = generateLinkedListOfIntegers();

        arrayListTime = removeFromEnd(arrayList100_000, numberOfElementsToRemove);
        linkedListTime = removeFromEnd(linkedList100_000, numberOfElementsToRemove);

        System.out.println(numberOfElementsToRemove + " elements");
        System.out.println("arrayListTime = " + arrayListTime);
        System.out.println("linkedListTime = " + linkedListTime);
        System.out.println("----------------------------------");

        numberOfElementsToRemove = BIG_NUMBER;
        arrayList100_000 = generateArrayListOfIntegers();
        linkedList100_000 = generateLinkedListOfIntegers();

        arrayListTime = removeFromEnd(arrayList100_000, numberOfElementsToRemove);
        linkedListTime = removeFromEnd(linkedList100_000, numberOfElementsToRemove);

        System.out.println(numberOfElementsToRemove + " elements");
        System.out.println("arrayListTime = " + arrayListTime);
        System.out.println("linkedListTime = " + linkedListTime);
        System.out.println("----------------------------------");
        System.out.println();


        //6. Remove element from middle
        System.out.println("---------Remove element from middle----------");

        numberOfElementsToRemove = SMALL_NUMBER;
        arrayList100_000 = generateArrayListOfIntegers();
        linkedList100_000 = generateLinkedListOfIntegers();

        arrayListTime = removeFromMiddle(arrayList100_000, numberOfElementsToRemove);
        linkedListTime = removeFromMiddle(linkedList100_000, numberOfElementsToRemove);


        System.out.println(numberOfElementsToRemove + " elements");
        System.out.println("arrayListTime = " + arrayListTime);
        System.out.println("linkedListTime = " + linkedListTime);
        System.out.println("----------------------------------");

        numberOfElementsToRemove = MEDIUM_NUMBER;
        arrayList100_000 = generateArrayListOfIntegers();
        linkedList100_000 = generateLinkedListOfIntegers();

        arrayListTime = removeFromMiddle(arrayList100_000, numberOfElementsToRemove);
        linkedListTime = removeFromMiddle(linkedList100_000, numberOfElementsToRemove);

        System.out.println(numberOfElementsToRemove + " elements");
        System.out.println("arrayListTime = " + arrayListTime);
        System.out.println("linkedListTime = " + linkedListTime);
        System.out.println("----------------------------------");

        numberOfElementsToRemove = BIG_NUMBER;
        arrayList100_000 = generateArrayListOfIntegers();
        linkedList100_000 = generateLinkedListOfIntegers();

        arrayListTime = removeFromMiddle(arrayList100_000, numberOfElementsToRemove);
        linkedListTime = removeFromMiddle(linkedList100_000, numberOfElementsToRemove);

        System.out.println(numberOfElementsToRemove + " elements");
        System.out.println("arrayListTime = " + arrayListTime);
        System.out.println("linkedListTime = " + linkedListTime);
        System.out.println("----------------------------------");
        System.out.println();
    }

    private static long removeFromMiddle(List<Integer> myList, int numberOfElementsToRemove) {
        long resultTime = 0;

        int listSize = myList.size();

        long time1 = System.currentTimeMillis();
        for (int i = 0; i < numberOfElementsToRemove; i++) {
            int indexToRemove = (listSize - 1 - i) / 2;
            myList.remove(indexToRemove);
        }
        long time2 = System.currentTimeMillis();

        resultTime = time2 - time1;
        return resultTime;

    }

    private static long removeFromEnd(List<Integer> myList, int numberOfElementsToRemove) {
        long resultTime = 0;

        int listSize = myList.size();

        long time1 = System.currentTimeMillis();
        for (int i = 0; i < numberOfElementsToRemove; i++) {
            int indexToRemove = listSize - 1 - i;
            myList.remove(indexToRemove);
        }
        long time2 = System.currentTimeMillis();


        resultTime = time2 - time1;
        return resultTime;
    }

    public static long removeFromBeginning(List<Integer> myList, int numberOfElementsToRemove) {
        long resultTime = 0;

        int listSize = myList.size();

        long time1 = System.currentTimeMillis();

        for (int i = 0; i < numberOfElementsToRemove; i++) {
            int indexToRemove = 0;
            myList.remove(indexToRemove);
        }

        long time2 = System.currentTimeMillis();

        resultTime = time2 - time1;
        return resultTime;
    }


    public static ArrayList<Integer> generateArrayListOfIntegers() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 100_000; i++) {
            arrayList.add(10);
        }
        return arrayList;
    }

    public static LinkedList<Integer> generateLinkedListOfIntegers() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 100_000; i++) {
            linkedList.add(10);
        }
        return linkedList;
    }


}