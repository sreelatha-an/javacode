import java.io.*;

public class BufferIpOpExm {
    public static void main(String[] args) throws IOException,NullPointerException
    {
        String filePath="D:\\MasterJava\\smpdir\\buff.txt";
        FileWriter writer =null;
        BufferedWriter bwriter=null;
        try
        {
            File file1=new File(filePath);
            writer=new FileWriter(file1, false);
            bwriter=new BufferedWriter(writer);
            bwriter.write("Nikhil");
            bwriter.newLine();
            bwriter.write(67);
            bwriter.newLine();
            bwriter.write("check check");
            bwriter.newLine();
            char ch[]= {'j', 'a','v','a'};
            bwriter.write(ch);
            bwriter.newLine();
            System.out.println("Open buf.txt file in your hd");
        }
        catch(Exception e)
        {
            System.out.println("Some problem");
        }
        finally
        {
            bwriter.flush();
            bwriter.close();
        }
        FileReader reader =null;
        BufferedReader  br=null;

        try
        {
            File file1=new File(filePath);
            reader=new FileReader(file1);
            br=new BufferedReader(reader);

            String str=br.readLine();
            while(str!=null)
            {
                System.out.println(str);
                str=br.readLine();
            }


        }
        catch(Exception e)
        {
            System.out.println("Some problem");
        }
        finally
        {
            br.close();
        }


    }
}
