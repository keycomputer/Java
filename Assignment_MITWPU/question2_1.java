
// -Define a class 'cube' with data members 'length', 
// 'breadth' & 'height',Initialize 3 objects using different 
// constructors and display its volume.
class Cube
{
    private int length;
    private int breadth;
    private int height;

    public Cube()
    {
        length = breadth = height =0 ;
    }
    public Cube(int length, int height, int breadth)
    {
        this.breadth = breadth ;
        this.height = height ;
        this.length = length ;
    }
    public Cube(Cube obj)
    {
        this.breadth = obj.breadth ;
        this.height = obj.height ;
        this.length = obj.length ;
    }
    void display()
    {
        System.out.println(length + " "+ height +" "+ breadth) ;
    }
}

class question2_1
{
    public static void main(String[] args) {
        Cube obj1 = new Cube();
        obj1.display();
        Cube obj2 = new Cube(10, 20, 30);
        obj2.display();
        Cube obj3 = new Cube(obj2);
        obj3.display();
    }
}