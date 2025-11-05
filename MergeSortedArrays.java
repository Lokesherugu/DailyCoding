public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {3, 5, 8, 9};

        int i = 0, j = 0;
        int n1 = arr1.length, n2 = arr2.length;

        while (i < n1 || j < n2) {
            if (i < n1 && (j >= n2 || arr1[i] < arr2[j])) {
                System.out.print(arr1[i] + " ");
                i++;
            } else if (j < n2 && (i >= n1 || arr2[j] < arr1[i])) {
                System.out.print(arr2[j] + " ");
                j++;
            } else { // equal elements
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }
        }
    }
}
