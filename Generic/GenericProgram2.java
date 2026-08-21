
class Pair<key, value>
{
    key k;
    value v;
    public void setKey(key k)
    {
        this.k = k ;
    }
    public void setvalue(value v)
    {
        this.v = v ;
    }
    void display()
    {
        System.out.println(k + " "+ v);
    }
}
class GenericProgram2
{
    public static void main(String[] args) {
        Pair<Integer, String> p1 = new Pair<>();
        p1.setKey(1);
        p1.setvalue("abc");
        p1.display();
        Emp obj = new Emp(2,"xyz");
        Pair<Integer, Emp> p2 = new Pair<Integer, Emp>();
        p2.setKey(2);
        p2.setvalue(obj);
        p2.display();
    }
}