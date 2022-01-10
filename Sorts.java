import java.util.ArrayList;

public class Sorts {
  public static void bubbleSort( ArrayList<Comparable> data )
  {
    int passes = 0;
    int swaps = 0;
    int comparsions = 0;
    int sortSwap = 0;
    for (int i = 0; i < data.size() - 1; i++) {
      sortSwap = 0;
      passes += 1;
      for (int j = data.size() - 1; j > i; j--) {
        comparsions += 1;
        if (data.get(j).compareTo(data.get(j-1)) < 0) {
          Comparable temp = data.get(j);
          data.set(j, data.get(j-1));
          data.set(j-1, temp);
          swaps += 1;
            }
        else {
          sortSwap++  
        }
       
          }
      if (sortSwap == data.size()){
        return;
      }
        }
    System.out.println("Number of swaps: " + swaps);
    System.out.println("Number of passes: " + passes);
    System.out.println("Number of comparsions: " + comparsions);
  }
  public static void selectionSort( ArrayList<Comparable> data )
{
  int passes = 0;
  int swaps = 0;
  int comparsions = 0;
  for( int pass = 1; pass<=data.size();pass++ ) {
    //System.out.println( "\nbegin pass " + (pass) );//diag
    passes += 1;
    int maxPos=0;
    for(int idx = 0;idx<=data.size()-pass;idx++) {
      //System.out.println( "maxPos: " + maxPos );//diag
      //System.out.println( data );//diag
      comparsions += 1;
      if (data.get(maxPos).compareTo(data.get(idx))<0){
        maxPos = idx;
      }
    }
    Comparable temp = data.get(maxPos);
    data.set(maxPos,data.get(data.size()-pass));
    data.set(data.size()-pass,temp);
    swaps += 1;
    //System.out.println( "after swap: " +  data );//diag
  }
  System.out.println("Number of swaps: " + swaps);
  System.out.println("Number of passes: " + passes);
  System.out.println("Number of comparsions: " + comparsions);
}
public static void insertionSort( ArrayList<Comparable> data )
 {
   int passes = 0;
   int swaps = 0;
   int comparsions = 0;
   for(int part = 0; part < data.size(); part++  ) {
     passes += 1;
     //partition marks first item in unsorted region
     int partition = part;
     //System.out.println( "\npartition: " + partition + "\tdataset:"); //diag
    // System.out.println( data );

     //traverse sorted region from right to left
     for(int i = part + 1; i > 0; i --  ) {
       comparsions += 1;
       // "walk" the current item to where it belongs
       // by swapping adjacent items
       if (i == data.size()){
         break;
       }
       else if (data.get(i).compareTo(data.get(i-1)) <0  ) {

         //System.out.println( "swap indices "+(i-1)+" & "+i+"..." ); //diag
         Comparable temp = data.get(i);
         data.set(i,data.get(i-1));
         data.set(i-1,temp);
         swaps += 1;
       }
       else
         break;
     }
   }
   System.out.println("Number of swaps: " + swaps);
   System.out.println("Number of passes: " + passes);
   System.out.println("Number of comparsions: " + comparsions);
 }
}
