package e01;
import java.util.Scanner;

public class E01 {
    
    public static void main(String[] args) {

        int num_of_sub,Degree = 0, count = 0;
       float average;
       
        System.out.println("enter number of your subjects");
        Scanner input1 =  new Scanner(System.in);
        num_of_sub = input1.nextInt();
       
    for (int i=1 ;i<=num_of_sub;i++)
        {
            System.out.println("Enter Degree of Subject " + i);
        Scanner input2 =  new Scanner(System.in);
        int x = input2.nextInt();  
        Degree =Degree + x; 
        }
        System.out.println(Degree);
        average = Degree /num_of_sub;
        System.out.println(average);
    if (average >=50 && average <65){
        System.out.println("You pass and your Degree is 'D'");
    }
       if (average >=65 && average <75){
        System.out.println("You pass and your Degree is 'C'");
    }
        if (average >=75 && average <85){
        System.out.println("You pass and your Degree is 'B'");
    }
         if (average >=85 && average <=100){
        System.out.println("You pass and your Degree is 'A'");
    }
    if (average >=0&& average <50){
        System.out.println("You Failed");
    }
    
}
}