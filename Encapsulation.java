public class Encapsulation{
    public static void main(String[] args){

        
        System.out.println();

        Student s1 = new Student();

        s1.setId(3746);
        s1.setName("Richelle");
        System.out.println("Student ID: " + s1.getId());
        System.out.println("Student Name: " + s1.getName());
        System.out.println();

  
        System.out.println();

        Book b1 = new Book();

        b1.setBookNumber(123);
        b1.setAuthor("Erica");
        b1.setTitle("History");
        b1.setPrice(40.00);
        System.out.println("Book Number: " + b1.getBookNumber());
        System.out.println("Book Title: " + b1.getTitle());
        System.out.println("Book Author: " + b1.getAuthor());
        System.out.println("Book Price: " + b1.getPrice());
        System.out.println();
    }
}


class Student{
    private int Student_id;
    private String Name;

    public void setId(int s_id){
        this.Student_id = s_id;
    }

    public void setName(String s_name){
        this.Name = s_name;
    }

    public String getName(){
        return this.Name;
    }

    public int getId(){
        return this.Student_id;
    }

}

class Book{
    private int _book_number;
    private String _title;
    private String _author;
    private Double _price;

    public void setBookNumber(int bookNum){
        this._book_number = bookNum;
    }

    public void setTitle(String Title){
        this._title = Title;
    }


    public void setAuthor(String Author){
        this._author = Author;
    }

    public void setPrice(Double Price){
        this._price = Price;
    }

    public int getBookNumber(){
        return this._book_number;
    }

    public String getTitle(){
        return this._title;
    }


    public String getAuthor(){
        return this._author;
    }

    public Double getPrice(){
        return this._price;
    }
}