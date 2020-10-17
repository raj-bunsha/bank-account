import java.io.*;
import java.util.*;
class file_reader
{
    public static String main(int account,int i){
        try
        {
            File x=new File("C:/Users/Raj/Desktop/bank account/"+account+".txt");
            Scanner sc=new Scanner(x);
            int j=0; 
            BufferedReader reader=new BufferedReader(new FileReader("C:/Users/Raj/Desktop/bank account/"+account+".txt"));
           while(true)
            {
            String a=reader.readLine();
            if(a==null)
             throw new Exception();
            j++;
            if(i==j)
            {
                return a;
            }
            }
        }
        catch(Exception e)
        {
            return "";
        }
    }
    public static int totallines(int account)
    {
        try{
       BufferedReader reader=new BufferedReader(new FileReader("C:/Users/Raj/Desktop/bank account/"+account+".txt"));
       int lines=0;
       File x=new File("C:/Users/Raj/Desktop/bank account/"+account+".txt");
       if(x.exists()==true)
       {
       }
       else
       {
           x.createNewFile();
       }
       while(reader.readLine()!=null)
        lines++;
          return lines;
       }
       catch(Exception e)
       {
           return 0;
        }
    }
}