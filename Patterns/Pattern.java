import java.util.Scanner;
public class Pattern
{
    public static void main(String []args)
    {
        Scanner input=new Scanner(System.in);
       
        
        int j,i;
        int n,k=1,t;
        
        System.out.println("1.)\n   *\n  ***\n *****\n*******\n *****\n  ***\n   *");
        System.out.println("2.)\n      1\n     121\n    12312\n   1234123\n  123451234\n");
        System.out.println("3.)\n      1\n     121\n    12321\n   1234321\n  123454321\n");
        System.out.println("4.)\n****    *********\n*****    ********\n******    *******\n*******    ******\n********    *****\n*********    ****");
        System.out.println("5.)\n1       1\n12     21\n123   321\n1234 4321\n123454321\n");
        System.out.println("6.)\n     0\n    101\n   12012\n  1230123\n 123401234\n");
        System.out.println("7.)\n54321\n4321\n321\n21\n1\n");
        System.out.println("8.)\n    1\n   21\n  321\n 4321\n54321\n");
        System.out.println("9.)\nE\nED\nEDC\nEDCB\nEDCBA\n");
        System.out.println("10.)\nANCDEDCBA\nABCD DCBA\nABC   CBA\nAB     BA\nA       A\n");
        

        
        System.out.println("Enter Choice : ");
        int choice;
        choice=input.nextInt();
       
        switch(choice)
        {
            case 1:
            System.out.println("Enter any number Ranging from 1-10 : ");
            n=input.nextInt(); 
                for(i=n;i>=1;i--)
            {
                for(j=i;j>=1;j--)
                {
                    System.out.print(" ");
                }
                    for(j=1;j<=k;j++)
                    {
                        System.out.print("*");
                    }
                k+=2;
                System.out.println();
            }
                for(i=1;i<=n+1;i++)
                {
                    for(j=1;j<=i;j++)
                    {
                        if(j==1)
                        {
                            continue;
                        }
                        System.out.print(" ");
                    }
                        for(j=1;j<=k;j++)
                        {
                            System.out.print("*");
                        }
                    k-=2;
                    System.out.println();
                }
                break;
            case 2:
            System.out.println("Enter any number Ranging from 1-10 : ");
            n=input.nextInt(); 
                k=1;
                for(i=n;i>=1;i--)
                {
                    for(j=i;j>=1;j--)
                    {
                        System.out.print(" ");
                    }
                        for(j=1;j<=k;j++)
                        {
                            System.out.print(j);
                        }
                        for(j=1;j<=k-1;j++)
                        {
                            if(i==n)
                            {continue;}
                            System.out.print(j);   
                        }
                    k++;
                    System.out.println();
                }
                break;
                case 3:
            System.out.println("Enter any number Ranging from 1-10 : ");
            n=input.nextInt(); 
                k=1;
                for(i=n;i>=1;i--)
                {
                    for(j=i;j>=1;j--)
                    {
                        System.out.print(" ");
                    }
                        for(j=1;j<=k;j++)
                        {
                            System.out.print(j);
                        }
                        for(j=k;j>=1;j--)
                        {
                            if(j==k)
                            {continue;}
                            System.out.print(j);   
                        }
                    k++;
                    System.out.println();
                }
                break;
            case 4:
            System.out.println("Enter any number Ranging from 1-10 : ");
            n=input.nextInt();
                k=n;
                for(i=4;i<=n+4;i++)
                {
                    for(j=1;j<=i;j++)
                    {
                        System.out.print("*");
                    }
                        for(j=1;j<=4;j++)
                        {
                            System.out.print(" ");
                        }
                            for(j=k+4;j>=1;j--)
                            {
                                System.out.print("*");
                            }
                    k--;
                        
                    System.out.println();
                }
                k=5;
                for(i=n-1+4;i>=4;i--)
                {
                    for(j=1;j<=i;j++)
                    {
                        System.out.print("*");
                    }
                        for(j=1;j<=4;j++)
                        {
                            System.out.print(" ");
                        }
                            for(j=1;j<=k;j++)
                            {
                                System.out.print("*");
                            }
                    k++;
                    System.out.println();
                }
                break;
            case 5:
            System.out.println("Enter any number Ranging from 1-10 : ");
            n=input.nextInt();
                k=n-1;
                t=1;
                    for(i=1;i<=n;i++)
                    {
                        for(j=1;j<=i;j++)
                        {
                            System.out.print(j);
                        }
                            for(j=1;j<=2*k-1;j++)
                            {
                                System.out.print(" ");
                            }
                            k--;
                                    for(j=t;j>=1;j--)
                                    {
                                        if(j==n)
                                        {
                                            continue;
                                        }
                                        System.out.print(j);
                                    }
                                    t++;
                        System.out.println();
                    }
                break;
                
            case 6:
            System.out.println("Enter any number Ranging from 1-10 : ");
            n=input.nextInt();
                k=0;
                for(i=n;i>=1;i--)
                {
                    for(j=1;j<=i-1;j++)
                    {
                        System.out.print(" ");
                    }
                        for(j=k;j>=0;j--)
                        {
                            System.out.print(j);
                        }
                        for(j=0;j<k;j++)
                        {
                            System.out.print(j+1);
                        }
                    k++;
                        
                    System.out.println();
                }
            break;    
            case  7:
            System.out.println("Enter any number Ranging from 1-10 : ");
            n=input.nextInt();
                for(i=5;i>=1;i--)
                {
                    for(j=i;j>=1;j--)
                    {
                        System.out.print(j);
                    }
                    System.out.println();
                }
                break;
            case 8:
            System.out.println("Enter any number Ranging from 1-10 : ");
            n=input.nextInt();
                k=1;
                for(i=n;i>=1;i--)
                {
                    for(j=1;j<=i-1;j++)
                    {
                        System.out.print(" ");
                    }
                    for(j=k;j>=1;j--)
                    {
                        System.out.print(j);
                    }
                    k++;
                    System.out.println();
                }
                break;
            case 9:
            System.out.println("Enter any number Ranging from 1-10 : ");
            n=input.nextInt();
                for(i=65+n;i>=65;i--)
                {
                    for(j=65+n;j>=i;j--)
                    {
                        System.out.print((char)j);
                    }
                    System.out.println();
                }
                break;
            case 10:
            System.out.println("Enter any number Ranging from 1-10 : ");
            n=input.nextInt();
                k=1;
                t=n;
                for(i=n;i>=1;i--)
                {
                    for(j=65;j<=65+i-1;j++)
                    {
                        System.out.print((char)j);
                    }
                    for(j=4;j<=2*k;j++)
                    {
                        System.out.print(" ");
                    }
                    k++;
                    for(j=65+t-1;j>=65;j--)
                    {
                        if(j==65+n-1)
                        {
                            continue;
                        }
                        else
                        System.out.print((char)j);
                    }
                    t--;
                    System.out.println();
                }
                break;
            
                
        }
            
    }
}
