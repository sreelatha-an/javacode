import java.io.*;

public class IOFileExm {

    public static void main(String[] args) {
        String strpath = "D:\\MasterJava\\smpdir\\sample.txt";
        File dir = new File("D:\\MasterJava\\smpdir");
        File file1 = null;
        FileWriter fWriter =null;
        FileReader fReader = null;
        PrintWriter pw = null;
        try{
            if(!dir.exists()) dir.mkdir();
            file1 = new File(strpath);
            if (!file1.exists()) file1.createNewFile();
            // fWriter = new FileWriter(file1);
            // fWriter.write(71);
            // fWriter.write("\n");
            // fWriter.write("Hi this is sreelatha");
            // fWriter.close();
             pw = new PrintWriter(file1);
            pw.println(79);
            pw.println('c');
            char ch[] =  {'a','b','c'};
            pw.println(ch);
pw.close();

            fReader = new FileReader(file1);
             char chs[]=new char[(int)file1.length()];
			fReader.read(chs);
			
			for(char sc:chs)
			{
				System.out.println(sc);
			}
            System.out.println("file length="+file1.length());
            // int c = fReader.read();            
            // while (c>=0){                
            //     System.out.println((char)c);
            //     c = fReader.read();
            // }
            fReader.close();
            System.out.println("done check file");
        }catch(IOException ie) { ie.printStackTrace();}
        finally{
          
        }
    }
}