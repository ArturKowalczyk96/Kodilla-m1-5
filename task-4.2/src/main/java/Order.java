import java.time.LocalDate;

public class Order {
    public Book book;
    public int orderNo;
    public LocalDate orderDate;
    //constructor
    public Order(Book book, int orderNo, int orderYear, int orderMonth, int orderDay){
        this.book = book;
        this.orderNo = orderNo;
        this.orderDate = LocalDate.of(orderYear, orderMonth, orderDay);
    }
    //getters
    public Book getBook(){
        return book;
    }
    public int getOrderNo(){
        return orderNo;
    }
    public LocalDate getOrderDate(){
        return orderDate;
    }
    //to string for orders override
    @Override
    public String toString(){
        return "Date of order: " + orderDate + "\nNamber of order: " + orderNo + "\nBook ordert: " + book;
    }
    //hashCode for order override
    @Override
    public int hashCode(){
        return orderNo*10000 + orderDate.getMonthValue()*100 + orderDate.getDayOfMonth();
    }
    //equals for order override
    @Override
    public boolean equals(Object o){
        Order r = (Order) o;
        return (book.equals(r.getBook())) && (orderNo == r.getOrderNo()) && (orderDate.equals(r.getOrderDate()));
    }
}
