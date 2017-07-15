import java.io.*;
import java.util.Scanner;
class Practice 
{
    public static void main(String[] args)
    {
       try
       {
           String str;
           String filename;
           File f,f1,f2,f3;
           FileWriter fw,fw1,fw2,fw3;
           FileReader fr;
           int countvowel=0;
           int countconsonents=0;
           int countspaces=0;
           Scanner input=new Scanner(System.in);           
           
               f=new File("Main.txt");
               if(f.exists()==true)
                {
                   throw new Exception("File Already Exists");
                }
                    else
                    {
                    f.createNewFile();
                    System.out.println("File Named Main.txt is created Successfully");
                    fw=new FileWriter(f);
                    System.out.print("Enter the Contents : ");
                    str=input.nextLine();
                    str=str.toLowerCase();
                    fw.write(str);
                    fw.close();
                    }
               
                        fr=new FileReader(f);
                        
                        f1=new File("Consonents.txt");
                        System.out.println("File Name Consonents.txt is Created Successfully");
                        f2=new File("Vowels.txt");
                        System.out.println("File Name Vowels.txt is Created Successfully");
                        f3=new File("Summary.txt");
                        System.out.println("File Name Summary.txt is Created Successfully");
           
                        fw2=new FileWriter(f2);
                        fw1=new FileWriter(f1);
                        fw3=new FileWriter(f3);
           
                        int a;
                        char b;
                        countvowel=0;
                        countspaces=0;
                        countconsonents=0;
                            while((a=fr.read())!=-1)
                            {
                                b=(char)a;
                                switch(b)
                                {
                                    case'a':
                                    case'e':
                                    case'i':
                                    case'o':
                                    case'u':
                                    case'A':
                                    case'I':
                                    case'O':
                                    case'U':
                                    case'E':
                                        countvowel++;
                                        fw2.write(b+" ");                
                                        break;
                                    case ' ':
                                        countspaces++;
                                        break;
                                    default:
                                        countconsonents++;
                                        fw1.write(b+" ");
                                        break;
                                        
                                }
                            }
                            fw3.write("Number of Vowels : "+countvowel+"\n Number of Consonents : "+countconsonents+"\nNumber of Spaces : "+countspaces+"\n Tahnk You Very Much");
                            fw2.close();
                            fw1.close();
                            fw3.close();
                            fr.close();           
       }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
