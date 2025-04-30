
class Hi extends Thread{
    public void show() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hi, I'm from class Hi");
        }
    }
    public void run(){
        show();
    }
}

class Hello extends Thread{
    public void show() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello, I'm from class Hello");
        }
        try {
            Thread.sleep(1000);
            } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " +
           e);
            }
           
    }
    public void run(){
        show();
    }
}

public class ThreadsExmp {
    public static void main(String[] args){
     Hi obj1 = new Hi();
     Hello obj2 = new Hello();
    
     System.out.println("group::"+obj1.getThreadGroup());
     System.out.println(obj2.getPriority());
     obj2.setPriority(10);

     obj1.start(); // Call method of class Hi
     //obj1.sleep(5);
     obj2.start(); //Call method of class Hello

     }
}