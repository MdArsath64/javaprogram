/**
 * AddElementInArray
 */
import java.util.*;
public class AddElementInArray {
    public static void main(String[] args) {
        Integer arr[] = {1,2,3,4,5,6};  
    int n = arr.length;  
    int index = 3;  
    System.out.println("Original Array: "+Arrays.toString(arr));  
    Integer newArr[] = new Integer[n+1];  
    int j = 0;  
    
    for(int i = 0; i<newArr.length; i++) {  
    if(i==index) {  
    newArr[i] = 7;  
    }else {  
    newArr[i] = arr[j];  
    j++;  
    }  
    }  
    // newArr[index] = 7;  
    
    System.out.println("Array after adding value: "+Arrays.toString(newArr));  
    }  
    }
        
