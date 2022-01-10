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

    ArrayList randomOrder = new ArrayList<Integer>();
      for (int k = 0; k <= 10; k++){
        randomOrder.add((int) (Math.random()*11));
      }

    ArrayList randomOrder2 = new ArrayList<Integer>();
      for (int l = 0; l < randomOrder.size(); l++){
        randomOrder2.add(randomOrder.get(l));
      }
    //System.out.println(randomOrder2);

    ArrayList randomOrder3 = new ArrayList<Integer>();
      for (int m = 0; m < randomOrder.size(); m++){
        randomOrder3.add(randomOrder.get(m));
      }
    //System.out.println(randomOrder3);
    System.out.println("\nAscending Array: " + ascend);
    System.out.println("Bubble Sort Starting");
    Sorts.bubbleSort(ascend);
    System.out.println("List after bubble sort: " + ascend );

    System.out.println("\nDescending Array: " + descend);
    System.out.println("Bubble Sort Starting");
    Sorts.bubbleSort(descend);
    System.out.println("List after bubble sort: " + descend );

    System.out.println("\nRandom Array:" + randomOrder);
    System.out.println("Bubble Sort Starting");
    Sorts.bubbleSort(randomOrder);
    System.out.println("List after bubble sort: " + randomOrder );

    System.out.println("\nAscending Array: " + ascend2);
    System.out.println("Insertion Sort Starting");
    Sorts.insertionSort(ascend2);
    System.out.println("List after insertion sort: " + ascend2);

    System.out.println("\nDescending Array: " + descend2);
    System.out.println("Insertion Sort Starting");
    Sorts.insertionSort(descend2);
    System.out.println("List after insertion sort: " + descend2);

    System.out.println("\nRandom Array:" + randomOrder2);
    System.out.println("Insertion Sort Starting");
    Sorts.insertionSort(randomOrder2);
    System.out.println("List after insertion sort:" + randomOrder2);

    System.out.println("\nAscending Array: " + ascend3);
    System.out.println("Selection Sort Starting");
    Sorts.bubbleSort(ascend3);
    System.out.println("List after selection sort: " + ascend3 );

    System.out.println("\nDescending Array: " + descend3);
    System.out.println("Selection Sort Starting");
    Sorts.bubbleSort(descend3);
    System.out.println("List after selection sort: " + descend3 );

    System.out.println("\nRandom Array:" + randomOrder3);
    System.out.println("Selection Sort Starting");
    Sorts.selectionSort(randomOrder3);
    System.out.println("List after selection sort: " + randomOrder3);
  }
}
