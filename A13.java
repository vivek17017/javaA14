package assignments;

import java.util.Scanner;

public class A13 {
    Scanner sc;
    public void driver()
    {
        f4();
    }
    public void f1()
    {
        sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        int n=sc.nextInt();
        if(n%2==0)
            System.out.println("Even");
        else
            System.out.println("Odd");

    }
    public void f2()
    {
        sc=new Scanner(System.in);
        System.out.println("Enter first number ");
        int a=sc.nextInt();
        System.out.println("Enter first number ");
        int b=sc.nextInt();
        System.out.println("Enter first number ");
        int c=sc.nextInt();
        if(a>b)
        {
            if(a>c)
                System.out.println(a);
            else
                System.out.println(c);
        }
        else
        {
            if(b>c)
                System.out.println(b);
            else
                System.out.println(c);
        }

    }
    public int f3()
    {
        sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        int n=sc.nextInt();
        int count=0;

        while (n>0){
            n=n/10;
            count++;
        }
        return count;

    }
    public void f4()
    {
        sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();

        while (n>0)
        {
            System.out.print(""+n%10);
            n=n/10;
        }


    }

}

