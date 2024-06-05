package Codesoft;
// Grade calculator
import java.util.*;
public class GradeCalculator{
	@SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		int totalmarks=0;
		System.out.println("Enter the number of subjects");
		int totsub=sc.nextInt();
		int[] marks=new int[totsub];
		System.out.println("Enter the  marks of "+totsub+" subjects out of 100");
		for(int i=0;i<totsub;i++){
			marks[i]=sc.nextInt();
			totalmarks+=marks[i];
		}
	double average=totalmarks/totsub;
	String grade=gradecalculator(average);	
        System.out.println("Total Marks: " + totalmarks);
        System.out.println("Average Percentage: " + average);
        System.out.println("Grade: " + grade);
	}
        public static String gradecalculator(double avg){
        	if (avg >= 90) {
            return "A";
        } else if (avg >= 80) {
            return "B";
        } else if (avg >= 70) {
            return "C";
        } else if (avg >= 60) {
            return "D";
        } else {
            return "F";
        }
        
    }
      
}