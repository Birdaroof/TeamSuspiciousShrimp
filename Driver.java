import java.util.ArrayList;
public class Driver {
  public static void main(String[] args){
    ArrayList ascend = new ArrayList<Integer>();
    ArrayList ascend2 = new ArrayList<Integer>();
    ArrayList ascend3 = new ArrayList<Integer>();
      for (int i = 0; i <= 10; i++){
        ascend.add(i);
        ascend2.add(i);
        ascend3.add(i);
      }

    //System.out.println(ascend);

    ArrayList descend = new ArrayList<Integer>();
    ArrayList descend2 = new ArrayList<Integer>();
    ArrayList descend3 = new ArrayList<Integer>();
      for (int j = 10; j >= 0; j--){
        descend.add(j);
        descend2.add(j);
        descend3.add(j);
      }
    //System.out.println(descend);
    ArrayList bubbleTest = Sorts.populate(10,0,10);
    ArrayList bubbleTest1 = Sorts.populate(100,0,100);
    ArrayList bubbleTest2 = Sorts.populate(1000,0,1000);
    ArrayList bubbleTest3 = Sorts.populate(10000,0,10000);
    //System.out.println(randomOrder3);
    System.out.println("\nAscending Array: " + ascend);
    System.out.println("Bubble Sort Starting");
    Sorts.bubbleSort(ascend);
    System.out.println("Bubble Sort Finished\n" );

    System.out.println("\nDescending Array: " + descend);
    System.out.println("Bubble Sort Starting");
    Sorts.bubbleSort(descend);
    System.out.println("Bubble Sort Finished\n" );

    System.out.println("Bubble Sort Starting on random array length 10");
    Sorts.bubbleSort(bubbleTest);
    System.out.println("Bubble Sort Finished\n");
    
    System.out.println("Bubble Sort Starting on random array length 100");
    Sorts.bubbleSort(bubbleTest1);
    System.out.println("Bubble Sort Finished\n" );
    
    System.out.println("Bubble Sort Starting on random array length 1000");
    Sorts.bubbleSort(bubbleTest2);
    System.out.println("Bubble Sort Finished\n" );
    
    System.out.println("Bubble Sort Starting on random array length 10000");
    Sorts.bubbleSort(bubbleTest3);
    System.out.println("Bubble Sort Finished\n" );
    
    ArrayList insertionTest = Sorts.populate(10,0,10);
    ArrayList insertionTest1 = Sorts.populate(100,0,100);
    ArrayList insertionTest2 = Sorts.populate(1000,0,1000);
    ArrayList insertionTest3 = Sorts.populate(10000,0,10000);
    
    System.out.println("\nAscending Array: " + ascend2);
    System.out.println("Insertion Sort Starting");
    Sorts.insertionSort(ascend2);
    System.out.println("Insertion Sort Finished");

    System.out.println("\nDescending Array: " + descend2);
    System.out.println("Insertion Sort Starting");
    Sorts.insertionSort(descend2);
    System.out.println("Insertion Sort Finished");

    //System.out.println("\nRandom Array:" + randomOrder2);
    System.out.println("\nInsertion Sort Starting on random array length 10");
    Sorts.insertionSort(insertionTest);
    System.out.println("Insertion Sort Finished");

    System.out.println("\nInsertion Sort Starting on random array length 100");
    Sorts.insertionSort(insertionTest1);
    System.out.println("Insertion Sort Finished");
    
    System.out.println("\nInsertion Sort Starting on random array length 1000");
    Sorts.insertionSort(insertionTest2);
    System.out.println("Insertion Sort Finished");
    
    System.out.println("\nInsertion Sort Starting on random array length 10000");
    Sorts.insertionSort(insertionTest3);
    System.out.println("Insertion Sort Finished");
    
    ArrayList selectionTest = Sorts.populate(10,0,10);
    ArrayList selectionTest1 = Sorts.populate(100,0,100);
    ArrayList selectionTest2 = Sorts.populate(1000,0,1000);
    ArrayList selectionTest3 = Sorts.populate(10000,0,10000);

    System.out.println("\nAscending Array: " + ascend3);
    System.out.println("Selection Sort Starting");
    Sorts.bubbleSort(ascend3);
    System.out.println("List after selection sort: " + ascend3 );

    System.out.println("\nDescending Array: " + descend3);
    System.out.println("Selection Sort Starting");
    Sorts.bubbleSort(descend3);
    System.out.println("List after selection sort: " + descend3 );

    System.out.println("\nSelection Sort Starting on random array length 10");
    Sorts.insertionSort(selectionTest);
    System.out.println("Selection Sort Finished");

    System.out.println("\nSelection Sort Starting on random array length 100");
    Sorts.insertionSort(selectionTest1);
    System.out.println("Selection Sort Finished");
    
    System.out.println("\nSelection Sort Starting on random array length 1000");
    Sorts.insertionSort(selectionTest2);
    System.out.println("Selection Sort Finished");
    
    System.out.println("\nSelection Sort Starting on random array length 10000");
    Sorts.insertionSort(selectionTest3);
    System.out.println("Selection Sort Finished");
  }
}
