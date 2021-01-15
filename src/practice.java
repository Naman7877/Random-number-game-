import java.util.Random;
import java.util.Scanner;

public class practice {
    class game{

    }
    public static void main(String[] args) {
        System.out.println("in this code we create a game of number gessing  ");
        int number;
        int cout=0;
        Random random=new Random();
        int rand =random.nextInt(100);
        System.out.println("enter your number between 0 to 100");
         Scanner sc =new Scanner(System.in);
         number=sc.nextInt();


            while (number!=rand)
            {
                if (number>rand)
                {
                    System.out.println("enter smaller number");
                }
                else {
                    System.out.println("please enter large number ");
                }
                System.out.println("reenter the number ");
                number=sc.nextInt();
                cout++;

                String s1=sc.next();
                System.out.println(s1);




            }
        if (number==rand)
        {
            cout++;
            System.out.println("you win ");
            System.out.println("in step "+ cout);
        }

    }
}
