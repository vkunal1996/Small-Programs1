import java.util.Scanner;

class LallyEmptyException extends Exception
{
    private String message;
    LallyEmptyException(String message)
    {
        this.message=message;
    }
    public String getMessage()
    {
        return message;
    }
}
class LallyAgeRangeException extends Exception
{
    private String message;
    LallyAgeRangeException(String message)
    {
        this.message=message;
    }
    public String getMessage()
    {
        return message;
    }
}
class LallyMarksRangeException extends Exception
{
    private String message;
    LallyMarksRangeException(String message)
    {
        this.message=message;
    }
    public String getMessage()
    {
        return message;
    }
}
public class Main 
{
    public static void main(String []args)
    {
            try
            {
            String Name,Address,FatherName,MotherName;
            long Contact;
            int age,rollno;
            float m1,m2,m3,m4,m5; 
            Scanner input=new Scanner(System.in);
            System.out.println("Enter Name of Student ");
            Name=input.nextLine();
            if(Name.isEmpty())
            {
                throw new LallyEmptyException("Please Enter the Name");
            }
            System.out.println("Enter FatherName of Student ");
            FatherName=input.nextLine();
            if(FatherName.isEmpty())
            {
                throw new LallyEmptyException("Please Enter the Name");
            }
            System.out.println("Enter MotherName of Student ");
            MotherName=input.nextLine();
            if(MotherName.isEmpty())
            {
                throw new LallyEmptyException("Please Enter the Name");
            }
            System.out.println("Enter Address of Student ");
            Address=input.nextLine();
            if(Address.isEmpty())
            {
                throw new LallyEmptyException("Please Enter the Name");
            }
            System.out.println("Enter Age of Student ");
            age=input.nextInt();
            if(age<18||age>60)
            {
                throw new LallyAgeRangeException("Please Enter Correct Age");
            }
            System.out.println("Enter Rollno of Student ");
            rollno=input.nextInt();
            System.out.println("Enter Contact of Student ");
            Contact=input.nextLong();
            System.out.println("Enter Marks1 : ");
            m1=input.nextFloat();
            if(m1<0||m1>100)
            {
                throw new LallyMarksRangeException("Please Enter Correct Age");
            }
            System.out.println("Enter Marks2 : ");
            m2=input.nextFloat();
            if(m2<0||m2>100)
            {
                throw new LallyMarksRangeException("Please Enter Correct Age");
            }
            System.out.println("Enter Marks3 : ");
            m3=input.nextFloat();
            if(m3<0||m3>100)
            {
                throw new LallyMarksRangeException("Please Enter Correct Age");
            }
            System.out.println("Enter Marks4 : ");
            m4=input.nextFloat();
            if(m4<0||m4>100)
            {
                throw new LallyMarksRangeException("Please Enter Correct Age");
            }
            System.out.println("Enter Marks5 : ");
            m5=input.nextFloat();
            if(m5<0||m5>100)
            {
                throw new LallyMarksRangeException("Please Enter Correct Age");
            }
            }
            catch(LallyEmptyException e)
            {
                System.out.println(" "+e.getMessage());
            }
            catch(LallyAgeRangeException e)
            {
                System.out.println(" "+e.getMessage());
            }
            catch(LallyMarksRangeException e)
            {
                System.out.println("Please Enter Correct Marks");
            }
    }
}
