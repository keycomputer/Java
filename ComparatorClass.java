package Java;


import java.util.*;


// compare  -> 
// Comparator -> functional interface 

class Person{
    public String name ;
    public int age;
    public String toString()
    {
        return age +" "+ name +"\n";
    }
}
class MyComp implements Comparator<Integer>
{
    @Override
    public int compare(Integer i , Integer j)
    {
        return (i < j)? 1 : (i==j)?0 : -1;
    }    
}
class MyComp2 implements Comparator<Person>
{
    @Override
    public int compare(Person i , Person j)
    {
        return (i.age < j.age)? 1 : (i==j)?0 : -1;
    }    
}
public class ComparatorClass {
    public static void main(String[] args) {
        List <Integer> l1 = new ArrayList<>();
        l1.add(100);
        l1.add(30);
        l1.add(60);
        l1.add(20);
        l1.add(80);
        // l1.sort(new MyComp());
        Collections.sort(l1, new MyComp());
        System.out.println(l1);
        Person p1 = new Person();
        p1.name = "abc";
        p1.age = 20 ;
        Person p2 = new Person();
        p2.name = "rbc";
        p2.age = 30 ;
        Person p3 = new Person();
        p3.name = "wbc";
        p3.age = 19 ;
        
        List <Person> l2 = new Vector<>();
        l2.add(p1);
        l2.add(p2);
        l2.add(p3);
        Collections.sort(l2, new MyComp2());
        System.out.println(l2);
    }    
}
