//wap using loop to find percentage and grade of user entered no of subject

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int sum = 0;
        String key="";
        System.out.println("Enter n to stop taking input.");
        while (i) {
            System.out.println("Enter grade of Subject " + i);
            key = obj.next();
            if(key.equals('n')==false){
                int num_marks = Integer.parseInt(key);
                 sum += num_marks;

            }else{
                break;
            }
            marks = obj.nextInt();


        }
    }
}

