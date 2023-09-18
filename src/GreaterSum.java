
public class GreaterSum {
    public static void main(String[] args) {
        int sum_even = 0, sum_odd=0;
        System.out.println("Even\t\t\t"+"Odd");
        for(int i = 0; i<=10; i++){
            if (i%2 ==0){
                System.out.print(i);
                 sum_even = sum_even+ i;
            }
            else{
                System.out.println("\t\t\t\t"+i);
                 sum_odd = sum_odd + i;
            }
        }
        System.out.println("Sum of even numbers: "+ sum_even + "\nSum of odd numbers: "+sum_odd);
        if(sum_even>sum_odd){
            System.out.println( " even is greater");
        }else if (sum_even==sum_odd) {
            System.out.println( "Both sum are equal.");
        }else{
            System.out.println(" odd sum is greater");
        }
    }
}
