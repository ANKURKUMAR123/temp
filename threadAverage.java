package lab3;


public class threadAverage
{
    public static void main(String[] args)
    {
       one_4 t1 = new one_4();
       one_4 t2 = new one_4();
       one_4 t3 = new one_4();
       one_4 t4 = new one_4();
       one_4 t5 = new one_4();
       t1.start();
       t2.start();
       t3.start();
       t4.start();
       t1.setPriority(1);
       t2.setPriority(2);
       t3.setPriority(3);
       t4.setPriority(4);
       try
       {
           t1.join();
           t2.join();
           t3.join();
           t4.join();
       }
       catch(Exception e)
       {
           System.out.println(e);
       }
    
       t5.start();
       t5.setPriority(5);    
    }
}
class one_4 extends Thread
{
    int[] arr = new int[100];
    static int sum=0;
    void initialize(int[] arr)
    {
        for(int i=0;i<100;i++)
        {
           arr[i]=i;
        }
    }
    public void run()
    {
        one_4 obj = new one_4();
        obj.initialize(arr);
        if(this.getPriority()==1)
        {
            int sum1=0;
            for(int i=0;i<25;i++)
            {
                sum1+=arr[i];
            }
            sum+=sum1;
            System.out.println("The sum of first segment is "+sum1); 
        }
        else if(this.getPriority()==2)
        {   
            int sum2=0;
            for(int i=25;i<50;i++)
            {
                sum2+=arr[i];
            }
            sum+=sum2;
            System.out.println("The sum of second segment is "+sum2); 
        }
        else if(this.getPriority()==3)
        {   
            int sum3=0;
            for(int i=50;i<75;i++)
            {
                sum3+=arr[i];
            }
            sum+=sum3;
            System.out.println("The sum of third segment is "+sum3);
        }
        else if(this.getPriority()==4)
        {
            int sum4=0;
            for(int i=75;i<100;i++)
            {
                sum4+=arr[i];    
            }
            sum+=sum4;
            System.out.println("The sum of fourth segment is "+sum4);
        }
        else
        {
            System.out.println("The sum of the full array is "+sum/100);
        }
    }    
}