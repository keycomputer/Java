// Develop a program for implementation of single & multilevel inheritance. 
// -Single Level Inheritance
// Write to create a class "Book" having data members 'author', 
// 'title', 'publisher'. Derive a class "BookInfo"
// display information
//  having data members 'price', 'stock position' and a method 'show()'.
//  Initialize and for 3 objects of "BookInfo".



// -. MultiLevel Inheritance
// "BookInfo"
// Write to create "Book"
//  having
//  a class  data members
//  having data members 'author', 'title', 'publisher'. Derive a class
// from BookInfo having
//  'price', 'stock in position'. Derive next level class "BookSales" data members 'noofcopiessold' 
// and methods RevenueGenerated() and AllShow(). 
// Accept and display information for all three classes data through BookSales class 
// 

// - Multiple Inheritance:
// Declare FY and SY as base class / interface with data members rollno, name and result. Create a
// subclass Student from these two to accept and display both class data.


class Book{
    String author;
    String title;
    String publisher;
    public Book () { }
    public Book(String author, String title, String publisher){
        this.author = author;
        this.publisher = publisher;
    }
}
class BookInfo extends Book
{
    float price;
    int stockposition;
    BookInfo(){}
    BookInfo(String author, String title, String publisher, float price, int stockposition)
    {
        super(author, title,publisher);
        this.price = price;
        this.stockposition = stockposition;
    }
    public void show()
    {

    }
}
class BookSales extends BookInfo{
    int noofcopiessold; 
    public void RevenueGenerated(){} 
    void AllShow(){}
     
}
