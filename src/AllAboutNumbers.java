import java.util.Scanner;

public class AllAboutNumbers {
    public static void main(String arg[]) {
        int num1, num2,num3;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the first number:");
        num1 = keyboard.nextInt();
        System.out.println("please enter the second number");
        keyboard = new Scanner(System.in);
        num2 = keyboard.nextInt();
        System.out.println("please enter the third number");
        keyboard = new Scanner(System.in);
        num3 = keyboard.nextInt();

        System.out.println(highestNumber(num1, num2, num3));
        System.out.println(lowestNumber (num1, num2, num3));
        System.out.println(sum(num1,num2,num3));
        System.out.println(product(num1, num2, num3));
        System.out.println(average(num1, num2, num3));
    }
    public static int highestNumber(int num1, int num2,int num3) {
        int highestNumber=1;
        if (  num3>num2) {
            highestNumber = num3;
        }else if (num2 > num1)
        {
            highestNumber=num2;
        }else{
            highestNumber=num1;
        }

        return highestNumber;

    }
    public static int lowestNumber (int num1, int num2, int num3) {
        int lowestNum=1 ;
        if (num1 < num2) {
            lowestNum = num1;
        }else if(num2<num3)
        {
            lowestNum=num2;
        }else{
            lowestNum=num3;
        }
        return lowestNum;

    }

    public static int sum (int num1, int num2, int num3)
    {
        int sum=num1+num2+num3;
        return sum;

    }
    public static int product (int num1, int num2, int num3)
    { int prod=num1*num2*num3;
        return prod;
    }
    public static double average (int num1, int num2, int num3)
    {double avg=((num1+num2+num3)/3);
        return avg;
    }
}