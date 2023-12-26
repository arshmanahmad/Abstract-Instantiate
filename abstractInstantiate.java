abstract class FirstClass{
    static int i = 5;
  
}
class SecondClass extends FirstClass{
    public static void main(String []args){
        FirstClass c1 = new FirstClass();
        System.out.println("This is the number" + c1.i);
    }
}// is creating the error cz is being instantiated