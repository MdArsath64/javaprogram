public class PassingArrayToFunction {
    //arrray passing .to function 
    public static void modifyArray(int[] array) {  
        for (int i = 0; i < array.length; i++) {  
            array[i] *= 2;  
        }  
    }  
    public static void main(String[] args) {  
        int[] arr = {1, 2, 3, 4, 5};  
        System.out.print("Pass by Value: ");  
        modifyArray(arr);  
      //  for (int num : arr) {  
        //    System.out.print(num + " ");  
    //    }  
     
     //use.this.for.loop.or.above the.for loop//
    for(int i=0;i<arr.length;i++){
    	System.out.println(arr[i]);
    }
    }  
}

