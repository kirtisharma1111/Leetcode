class Solution {  
    static int count; // Global variable to store the number of reverse pairs

// Function to count reverse pairs between two sorted halves  
    public void inversion(int[] a, int[] b) {  
        int i = 0, j = 0;  // Two pointers to traverse arrays a[] and b[]  
        while (i < a.length && j < b.length) { 
            if ((long) a[i] > ((long) 2 * (long) b[j])) {  
                count += (a.length - i); // All remaining elements in a[] form valid reverse pairs  
                j++; // Move j to next element in b[]  
            } else {  
                i++; // Otherwise, move i forward  
            }  
        }  
    }  
// Function to merge two sorted arrays a[] and b[] into c[]  
    public void merge(int[] a, int[] b, int[] c) {  
        int i = 0, j = 0, k = 0;  
        while (i < a.length && j < b.length) {  
            if (a[i] <= b[j]) {    
                c[k++] = a[i++];  
            } else {  
                c[k++] = b[j++];   
            }  
        }  
        while (j < b.length) { 
            c[k++] = b[j++];  
        }  

        while (i < a.length) {  
            c[k++] = a[i++];  
        }  
    }  

    // Merge Sort function to sort the array and count reverse pairs  
    public void mergesort(int[] arr) {  
        int n = arr.length;  
        if (n == 1) return; // Base case: If array has only 1 element, return  

        int[] a = new int[n / 2];  // Create left subarray (first half)  
        int[] b = new int[n - n / 2];  // Create right subarray (second half)  

        for (int i = 0; i < n / 2; i++) a[i] = arr[i];  // Copy elements to left half  
        for (int i = 0; i < n - n / 2; i++) b[i] = arr[i + n / 2];  // Copy elements to right half  

        mergesort(a); // Recursively sort left half  
        mergesort(b); // Recursively sort right half  

        inversion(a, b); // Count reverse pairs between sorted halves  
        merge(a, b, arr); // Merge sorted halves back into original array  

    }  
    public int reversePairs(int[] nums) {  
        count = 0;  // Initialize count to 0  
        mergesort(nums); // Sort the array and count reverse pairs  
        return count; // Return final count of reverse pairs  
    }  
}
