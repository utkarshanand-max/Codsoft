//STUDENT GRADE CALCULATOR

import java.util.Scanner;


public class Task2 {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of subjects: ");
        int numberofSubjects=sc.nextInt();
        int[]marks=new int[numberofSubjects];

        for (int i = 0; i < numberofSubjects; i++) {
            System.out.println("Enter the marks obtained out of 100 in subject "+(i+1)+":");
            marks[i]=sc.nextInt();
        }
        //calculate the total marks
        int totalMarks=0;
        for(int mark : marks){
            totalMarks += mark;
        }
        //calculate average percentage
        float averagePercentage=(float) totalMarks/numberofSubjects;

        //calculate grade based on average percentage
        String grade;
        if(averagePercentage >= 90){
            grade="A";
        }
        else if(averagePercentage >= 80){
            grade="B";
        }
        else if(averagePercentage >= 70){
            grade="C";
        }
        else if(averagePercentage >= 60){
            grade="D";
        }
        else if(averagePercentage >= 50){
            grade="E";
        }
        else{
            grade="F";
        }

        //Display the result
        System.out.println("Total Marks: "+totalMarks+"/"+(numberofSubjects*100));
        System.out.println("Average Percentage: "+averagePercentage);
        System.out.println("Grade: "+grade);

        sc.close();

	
    }	
		    
}		

