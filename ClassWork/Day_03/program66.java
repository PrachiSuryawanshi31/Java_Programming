import java.util.Scanner;

class program66
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
        int icnt = 0;       //Default value
        icnt = 1;           //initalized for loop start

        while(icnt <= iNo)          //while loop -->head checking
        {
            System.out.println("-------------");
            System.out.println(icnt + " Jay Ganesh...");
            System.out.println("-------------");
            icnt++;
        }
    }
}