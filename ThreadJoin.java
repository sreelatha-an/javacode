
class Counter  {
    int count;
    public synchronized void increment() { count++;
            //System.out.println("Hi, I am "+name);
            try {
                System.out.println("b4 wait.");
                wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        public synchronized void decrease() {
             count++;
            System.out.println("b4 notify");
                notifyAll();
        }
} 

public class ThreadJoin {
    public static void main(String[] args){
       Counter cntr = new Counter();
       System.out.println("count=="+cntr.count);
        Runnable r1 = () -> { 
            for (int i = 0; i < 1; i++) {
                cntr.increment();
            //System.out.println("in r1: "+cntr.count);
            } 
                   
            };
        Runnable r2 = () -> { 
            for (int i = 0; i < 1; i++) {
                cntr.decrease();
              //  System.out.println("in r2: "+cntr.count);
              }
           //   cntr.notifyAll();
        };
Thread t1 = new Thread(r1);
Thread t2 = new Thread(r2);

t1.start();
t2.start();
try {
    t1.join();
    t2.join();
} catch (InterruptedException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}

        
System.out.println("count=="+cntr.count);
     }
}

