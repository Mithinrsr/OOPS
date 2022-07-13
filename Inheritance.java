public class Main
{
	public static void main(String[] args) {
	  C obj=new C();
      obj.run();
		
	}
} 
class A 
{
    A(){
    //explict
    //implict
    }

    public void run(){
        System.out.println("Running");
    }
}
class B extends A {
    public void swim(){
        System.out.println("Swimming!! ");
    }
}
class C extends B
{
    public void hi(){
        System.out.println("Hello!");
    }
}


