public class cons {
    cons()
    { 
        System.out.println("Constructor Working");
      }
      cons(float a){
        System.out.println("Constructor with float argument:"+a);
      }
      cons(int a,int b){
        System.out.println("Constructor with two int arguments:"+a+""+b);
      }

}
class ConstructorOverload{
    public static void main(String[] args)
    {
        Student  S1 = new Student();
        Student S2 = new Student(3.12f);
        Student S3 = new Student(10,20);
    }
}
