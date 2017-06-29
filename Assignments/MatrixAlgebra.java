import java.util.Scanner;
public class MatrixAlgebra
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the Rows and Columns  of first Matrix :  ");
            int row1=input.nextInt();
            int column1=input.nextInt();
        System.out.print("Enter the Rows and Columns  of second Matrix :  ");
            int row2=input.nextInt();
            int column2=input.nextInt();
                    
                    int i,j,temp=0;
                    int array1[][]=new int[row1][column1];
                    int array2[][]=new int[row2][column2];
                    int array3[][]=new int[row1][column2]; 
        
        
           if(row1!=row2||column1!=column2)
            {
                System.out.println("Sorry ,Rows and columns are Not Equal");
            }
                else
                {
                    
                    System.out.println("Enter the Elements of 1st Array");
                    for(i=0;i<row1;i++)
                    {
                        for(j=0;j<column1;j++)
                        {
                            array1[i][j]=input.nextInt();
                        }
                    }
                    
                    System.out.println("Enter the Elements of 2nd Array");
                    for(i=0;i<row2;i++)
                    {
                        for(j=0;j<column2;j++)
                        {
                            array2[i][j]=input.nextInt();
                        }
                    }
                    System.out.println("Sum of the Two Matrix is : ");
                        for(i=0;i<row1;i++)
                        {
                            for(j=0;j<column1;j++)
                            {
                                array3[i][j]=array1[i][j]+array2[i][j];
                            }
                        }
                    for(i=0;i<row1;i++)
                    {
                        for(j=0;j<column1;j++)
                        {
                            System.out.print(" "+array3[i][j]+" ");
                        }
                        System.out.println();
                    }
                }
        
        if(column1!=row2)
        {
            System.out.print("Sorry , Multplication is not possible ");
        }
            else
            {
                int k;
                System.out.println("Multiplication is : ");
                    for(i=0;i<row1;i++)
                    {
                        for(j=0;j<column2;j++)
                        {
                            temp=0;
                            for(k=0;k<column2;k++)
                            {
                              temp=temp+(array1[i][k]*array2[k][j]);
                            }
                            array3[i][j]=temp;
                            
                        }
                    }
                
                for(i=0;i<row1;i++)
                {
                    for(j=0;j<column2;j++)
                    {
                        System.out.print(" "+array3[i][j]+" ");
                    }
                    System.out.println();
                }
            }
        
    }
}