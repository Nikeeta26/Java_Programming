//super constructor

 Used to invoke the parent class constructor

class demo
{
demo()
{
  System.out.println("Super constructor");
}
}
class sample extends demo{
  sample()
    {
      super();
      System.out.println("Sub class constructor");
    }
public static void main(String args[]) {
  sample s1=new sample();
  
}
}