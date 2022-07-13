public class Main
{
	public static void main(String[] args) {
	  	Student c=new Student("mithin");
	  	c.printName();
	}
} 

class Student{
    String name;
    int age;
    String place;
    
    Student(){
        
        System.out.println("Default contructor is calling!!!");
    }
    Student(String name){
       // System.out.println(name+"1 name contructor is calling!!");
      this.name=name;
        
    }
    Student(String name,int age){
        
    }
    Student(String name,int age,String place){
        
    }
    public void printName(){
        System.out.println(name);
    }
}
