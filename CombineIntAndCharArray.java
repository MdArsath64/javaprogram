public class CombineIntAndCharArray {
    //collide int and char arrays
	public static void main(String[] args) {
		int[] na={4,2};
		char[] ca={'a','b'};
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<ca.length;i++){
			char chrs=ca[i];
			int ele=na[i];
	//		System.out.print(ele);
			for(int j=0;j<ele;j++){
				sb.append(chrs);
			}
		}
			System.out.print(sb.toString());
		
	}
}
//output-aaaabb

