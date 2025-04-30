import java.io.*;
class StudentA implements Serializable
{
    private int id;
    private String name;
    private int age;

    public StudentA(int id, String name, int age) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public void disp()
    {
        System.out.println("id "+ id);
        System.out.println("name "+ name);
        System.out.println("age "+ age);

    }
}

public class SerializableExm {

    public static void main(String[] args) {

		StudentA stu1 =new StudentA(1, "sree", 18);
		stu1.disp();
        try
        {
			FileOutputStream fos=new FileOutputStream("D:\\MasterJava\\smpdir\\serial.txt",true);
			BufferedOutputStream bos=new BufferedOutputStream(fos);
			ObjectOutputStream oos=new ObjectOutputStream(bos);
			oos.writeObject(stu1);
            oos.writeObject(stu1);
            System.out.println("Please check the file to see serialized object");
			oos.close();
			fos.close();

            FileInputStream fis=new FileInputStream("D:\\MasterJava\\smpdir\\serial.txt");
            BufferedInputStream bis=new BufferedInputStream(fis);
            ObjectInputStream ois=new ObjectInputStream(bis);

            StudentA st=(StudentA) ois.readObject();
            StudentA st2=(StudentA) ois.readObject();
            st2.disp();
            st.disp();

            ois.close();
            fis.close();
        }
        catch (FileNotFoundException e)
        {

            e.printStackTrace();
        }
        catch (IOException e)
        {

            e.printStackTrace();
        }
        catch (ClassNotFoundException e)
        {

            e.printStackTrace();
        }


    }
}
