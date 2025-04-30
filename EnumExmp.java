enum MyStatus {
    Single('s'), Married,Divorced('d');
    char c;
    MyStatus(){
        System.out.println("MyStatus()");
    }
    MyStatus(char x){
        c=x;
        System.out.println("MyStatus(char):"+this.name());
    }
    public char getC() {
        return c;
    }
    public void setC(char c) {
        this.c = c;
    }
    
}

public class EnumExmp {
    public static void main(String[] args) {
        MyStatus sts[]=  MyStatus.values();

        for(MyStatus ms: sts){
            System.out.println(ms+" : "+ms.ordinal());
            //+" ::: " +ms.values());
        }
        System.out.println("name:num "+MyStatus.Single);
        MyStatus mst = MyStatus.Married;
        switch (mst){
            case Single: System.out.println("Not married");
                break;
            case Married: System.out.println("Married, cute baby");
                break;
            case Divorced: System.out.println("breakup..");
                break;
            default: System.out.println("unknown status");                           
        }

        if(mst==MyStatus.Single)
            System.out.println("Not married");
        else if(mst==MyStatus.Married)
            System.out.println("Married, cute baby");
        else if (mst==MyStatus.Divorced)
            System.out.println("breakup..");  
            
            MyStatus ms1 =MyStatus.Married;
            ms1.setC('M');
            for(MyStatus ms: MyStatus.values())
            {
                System.out.println("ordinal="+ms.ordinal()+"name= "+ms.name()+", sign:"+ms.getC());
            }
    }
}
