public class Main
{
    public static void run(){
        System.out.println("A Running");
    }
	public static void main(String[] args) {
      A obj=new A();
       A obj1=new A();
        A obj2=new A();
        
      System.out.println(obj.Pro);
      System.out.println(obj1.Pro);
      System.out.println(obj2.Pro);
      
      obj.changeName("Arun");
      System.out.println(obj.Pro);
        System.out.println(obj1.Pro);
      System.out.println(obj2.Pro);
	}
}

class A{
   static String Pro="Mithin";
    public  void run(){
        System.out.println("A Running");
    }
    public  void changeName(String name){
        Pro=name;
    }
}


