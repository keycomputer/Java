// Define a class 'mobile' with data members 
// 'company_name'& 'screen_size'. Initialize and 
// display values of data members for five mobiles
class Mobile
{
    private String company_name;
    private int screen_size;

    public Mobile()
    {
        company_name = " ";
        screen_size = 0 ;
    }
    public Mobile(String company_name, int screen_size)
    {
        this.company_name = company_name ;
        this.screen_size = screen_size ;
    }
    public Mobile(Mobile obj)
    {
        this.company_name = obj.company_name ;
        this.screen_size = obj.screen_size ;
    }
    void display()
    {
        System.out.println(company_name + " "+ screen_size) ;
    }
}
public class question2_2 {
    public static void main(String[] args) {
        Mobile obj1 [] = new Mobile[5]; // array of objects
        for(int i=0;i<5;i++)
        {
            obj1[i] = new Mobile();
            obj1[i].display();
        }
        
    }
}
