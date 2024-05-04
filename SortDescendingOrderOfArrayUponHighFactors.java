public class SortDescendingOrderOfArrayUponHighFactors {
    //sorted in descending based upon no of factors of the array elemets
    public static void main(String[] args) {
    int[] arr={8,2,3,12,16};
    int[] brr=new int[arr.length];
    int count=0,m=0,temp;
    for(int i=0;i<arr.length;i++){
    count=0;
    for(int j=1;j<=arr[i];j++){
    if(arr[i]%j==0){gi
    System.out.print(j);
    count++;
    }
    }
    brr[i]=count;
    System.out.println();
    System.out.println("count is :"+count);
    }
    for(int i=0;i<arr.length;i++){
    for(int j=i+1;j<brr.length;j++){
    if(brr[i]<brr[j]){//swap brr[]array
    temp=brr[i];
    brr[i]=brr[j];
    brr[j]=temp;
    //swap arr[] array
    temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
    }
    }
    }
    for(int num:arr){
    System.out.print(num+" ");
    }
    }
}

