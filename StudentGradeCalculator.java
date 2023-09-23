package TASK2;

import java.util.Scanner;

public class StudentGradeCalculator {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the total number of Subject");
	int sub =  sc.nextInt();
	int count = 0;
	int total = 0;

	while(count < sub)
	{
		System.out.print("Enter marks for subject " + ++count + " (out of 100): ");
		int marks = sc.nextInt();
		total += marks;
	}
	 double avrage = (double) total/sub;
	 
	 String grade;
     if (avrage >= 90) {
         grade = "A+";
     } else if (avrage >= 80) {
         grade = "A";
     } else if (avrage >= 70) {
         grade = "B";
     } else if (avrage >= 60) {
         grade = "C";
     } else if (avrage >= 50) {
         grade = "D";
     } else {
         grade = "F";
     }

		
	System.out.println("Total marks  "+total);
	System.out.println("Average Percentage  "+ avrage+"%");
	System.out.println("Grade "+grade);
}
}
