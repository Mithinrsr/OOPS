public class Main
{
	public static void main(String[] args) {
  Child obj= new Child();
  obj.run();
  
	}
} 

//polymorphism
//Method overloading
//Method overriding - same method name, same parameter.
class Parent{
    public void run(){
        System.out.println("Parent Running");
    }
    
}
class Child extends Parent
{
    public void run(){
      System.out.println("child Running");
    }
    public int run(int speed){
        System.out.println("child Running in a speed : "+speed);
        return 1;
    }
}

