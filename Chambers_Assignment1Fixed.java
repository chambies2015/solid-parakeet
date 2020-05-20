import java.util.ArrayList;
import java.util.Scanner;

public class Chambers_Assignment1Fixed {

    public static void DuplicateElimination()
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> intarray = new ArrayList<Integer>();

        for (int i = 0; i < 5; i++)
        {
            System.out.print("Enter an integer between 10 and 100:");
            int num = scanner.nextInt();
            if (num < 10 || num > 100)
            {
                System.out.print("Input number invalid. Please reenter a valid number between 10 and 100:");
                num = scanner.nextInt();
            }
            if (!intarray.contains(num))
            {
                intarray.add(num);
                System.out.println("This is the first time " + num + " has been entered");
            }
        }
        System.out.println("The complete set of unique values entered is:");
        for (int i = 0; i < intarray.size(); i++)
        {
            System.out.println("Unique Value "+ (i+1) + ": is " + intarray.get(i));
        }


    }


    public static void main(String[] args)
    {
        DuplicateElimination();
    }
}



