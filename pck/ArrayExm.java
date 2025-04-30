package pck;
class Student{
    int rollno;
    String name;
    String subject;
    
    protected Student(int rollno,String name,String subject){
        this.rollno = rollno;
        this.name = name;
        this.subject = subject;
        int pin[];
        pin = new int[10];
        System.out.println("lenth=="+pin.length);
        System.out.println("rollno=="+this.rollno);

    }
}

class ArrayExm{
 public ArrayExm(){
    System.out.println("inside ArrayExm()");
 }
     int []arr = {1,2,3,4,5};
     int arr1[]  = new int[10];
     
        public static void main(String[] args) {
          
            ArrayExm arrExm = new ArrayExm();
            arrExm.arr[4]=9;
            for (int x=0;x<10;x++) {

                System.out.println("arr1["+x+"] = "+ arrExm.arr1[x]);
                
            }         
            System.out.println("arrExm.arr1==>"+arrExm.arr1);   
            int arry[][]  = new int[3][];
            //System.out.println(arry[0][0]);//NullpointerException
            arry[0]= new int[4];
            arry[1]= new int[2];
            arry[2]= new int[3];
            System.out.println("arry[0][0]==>"+arry[0][0]);
            
           Student students[] = new Student[3];
           Student s1 = new Student(1,"sree","maths");
           Student s2 = new Student(2,"nik","science");            
           Student s3 = new Student(3,"Rohini","English");            
           students[0]=s1;
           students[1] =s2; 
           students[2] = s3;
           for(Student ss : students){
            System.out.println("name= "+ss.name+", subject: "+ss.subject);
            
//int x;
//System.out.println("x=="+x); //without initializing we cannot use
//compiletime error not initialized...
           } 
           System.out.println("ss=="+students);


    }
}
