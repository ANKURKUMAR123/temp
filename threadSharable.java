package lab3;
public class threadSharable 
{
    public static void main(String[] args)
    {
        
        one_3 t1 = new one_3();
        one_3 t2 = new one_3();
        one_3 t3 = new one_3();
        one_3 t4 = new one_3();
        
        t1.setPriority(1);
        t2.setPriority(2);
        t3.setPriority(3);
        t4.setPriority(4);
        
       
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    
    }
}


class one_3 extends Thread
{
    public void run()
    {
        num a = new num();
        
        if(this.getPriority()==1)
        {
            a.add(1,4);
        }
         
        else if(this.getPriority()==2)
        {   
            a.sub(1,4);
        }
        else if(this.getPriority()==3)
        {
           a.mul(1,4);
            
        }
        else if(this.getPriority()==4)
        {
           a.div(1,4);
        }
        
    }
}

class num 
{
    public void add(int a,int b)
    {
        System.out.println("The Sum is "+(a+b));
    }
    public void sub(int a,int b)
    {
        System.out.println("The difference is "+(a-b));
    }
    public void mul(int a,int b)
    {
        System.out.println("The multipliction is "+(a*b));
    }
    public void div(int a,int b)
    {
        System.out.println("The division is "+(a/b));
    }
}


