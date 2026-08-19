package Java.Generic;

class Test <T>
{
    T data ;
    public Test() { data= null;} 
    public Test (T data ){ this.data = data;}
    void input(T data)
    {
        this.data = data ;
    }
    void output()
    { System.out.println(data );}
}
class Emp{
    int id ;
    String name;
    public Emp(int id, String name ) { this.id = id ; this.name  = name; }
    void output(){ System.out.println(id+" "+name);}
    @Override
    public String toString(){
        return id+" "+name;
    }
}
public class GenericProgram1 {
    public static void main(String[] args) {
        Test <Integer> obj1 = new Test<>();
        obj1.input(100);
        obj1.output();
        Test <String> obj2 = new Test<>();
        obj2.input("abc");
        obj2.output();
        Emp e1 = new Emp(1,"abc");
        Test <Emp> obj3  = new Test<>(e1);
        obj3.output();
    }
}
