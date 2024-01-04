/* 
Reasons for Multiple Inheritance 
A class should be tightly coupled on only one class
Disadvantages :  
 1. Hard to Maintain
 2. Increase complexity
 
 */
// Using Extends Keyword
abstract class Computer{
    abstract void nam();
}
class HP extends Computer{
    void nam(){
        System.out.println("Hi I'm HP");
    }
}
class Dell extends Computer{
    void nam(){
        System.out.println("Hi I'm Dell");
    }
}
public class Abstract{
    public static void main(String[] args){
        Computer h = new Dell();
        h.nam();
    }
}

// Using Implements Keyword 
interface FirstInterface {
  public void myMethod(); // interface method
}

interface SecondInterface {
  public void myOtherMethod(); // interface method
}

// DemoClass "implements" FirstInterface and SecondInterface
class DemoClass implements FirstInterface, SecondInterface {
  public void myMethod() {
    System.out.println("Some text..");
  }
  public void myOtherMethod() {
    System.out.println("Some other text...");
  }
}

class Main {
  public static void main(String[] args) {
    DemoClass myObj = new DemoClass();
    myObj.myMethod();
    myObj.myOtherMethod();
  }
}