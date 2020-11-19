package tech.jarek;

public class Main {

    public static void main(String[] args) {
        // ----------
        // Merge Sort
        // ----------
        int[] mergeArray = {1,9,12,2,-1,8,3,7,11,4,6,5,-2,0,5,10};
        MergeSort mergeSort = new MergeSort();
        mergeArray = mergeSort.sort(mergeArray);
        // Merge Sort Print
        System.out.println("Merge Sort:");
        for(int item : mergeArray) {
            System.out.print(item + " ");
        }
        System.out.println("\n");
    }
}
