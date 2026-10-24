import java.util.Scanner;

class program60
{

    public static void main(String A[])
    {
        Scanner scanner = new Scanner(System.in);
        int iValue = 0;

        System.out.println("Enter Frequency");
        iValue =scanner.nextInt();

        Iteration iteration = new Iteration();
        
        iteration.Display(iValue);
    }
}

class Iteration
{
    public void Display(int iNo)
    {
        int icnt = 0;

        for(icnt = 1; icnt <= iNo; icnt++)
        {
            System.out.println("-------------");
            System.out.println("Jay Ganesh...");
            System.out.println("-------------");
        
        }
    }
}