/*
class SayName implements Runnable{
    public  String name ;
    SayName(String nme){
        name=nme;
    }
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hi, I am "+name);
        }
    }
    
} */

public class ThreadsRunnableExmp {
    public static void main(String[] args){
        //SayName obj1 = new SayName("Nikhil");
        //SayName obj2 = new SayName("Sree");
    
        Runnable obj1 = ()-> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Hi, I am Sree");
            }        
    };
    Runnable obj2 = ()-> {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hi, I am Nikhil");
        }    
    };
        Thread t1 = new Thread(obj1);
        try {
            t1.sleep(5);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

     }
}

