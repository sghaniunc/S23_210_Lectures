package lec6_7;
// Example of Linear Search
public class LinearSearch {
    public static void main(String[] args) {
        int[] a = {20, 5, 3, 25, 10, 4, 61};
        int x = 61;         // The number to search for
        searchArray(a, x);
    }
    static void searchArray(int[] b, int key){
        int index = -1;     // index of y (if found)
        boolean result = false;
        for (int i = 0; i < b.length; i++) {
            if (b[i] == key) {
                result = true;
                index = i;
                break;
            }
        }
        if (result) System.out.println("Integer " + key + " exists in the array at index=" + index + ".");
        else System.out.println("Integer " + key + " does not exist in the array.");
    }
}
