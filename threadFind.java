package lab3;



public class threadFind {

	   
    static int m=0;
    
    static int max=0;
    static int count=1000;

public static void main(String[] args) {
    
       
   One p1 = new One();
Two p2 = new Two();
Three p3 = new Three();

   p1.start();
   p2.start();
   p3.start();
   System.out.println("Thread "+max+" threadFindrements more");
  
}
}
class One extends Thread {

  // private static int count = 1000;
   int c=0;
   public int threadFindrement() {
       synchronized(One.class) {
           threadFind.count = threadFind.count - 1;
           return threadFind.count;
       }

   }

   public int getCount() {
       synchronized(One.class) {
           return threadFind.count;
       }
   }

   public void run(){
       while( getCount() > 0){
           c++;
           synchronized(One.class) {
           if(c>threadFind.m)
           {
               threadFind.m=c;
               threadFind.max=1;
           }
       }
           int count = this.threadFindrement();
           
       }
   }
}
class Two extends Thread {

//   private static int count = 1000;
int c=0;
   public int threadFindrement() {
       synchronized(Two.class) {
           threadFind.count = threadFind.count - 4;
           return threadFind.count;
       }

   }

   public int getCount() {
       synchronized(Two.class) {
           return threadFind.count;
       }
   }

   public void run(){
       while( getCount() > 0){
           c++;
           synchronized(Two.class) {
           if(c>threadFind.m)
           {
               threadFind.m=c;
               threadFind.max=2;
           }
       }
           int count = this.threadFindrement();
          
       }
   }
}
class Three extends Thread {

  // private static int count = 1000;
int c=0;
   public int threadFindrement() {
       synchronized(Three.class) {
           threadFind.count = threadFind.count - 3;
           return threadFind.count;
       }

   }

   public int getCount() {
       synchronized(Three.class) {
           return threadFind.count;
       }
   }

   public void run(){
       while( getCount() > 0){
           c++;
           synchronized(Three.class) {
           if(c>threadFind.m)
           {
               threadFind.m=c;
               threadFind.max=3;
           }
       }
           int count = this.threadFindrement();
           
       }
   }
}
