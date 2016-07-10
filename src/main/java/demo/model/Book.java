package demo.model;

import java.io.Serializable;

/**
 * Created at 221
 * 16-7-10 上午10:44.
 */
public class Book implements Serializable {
    private Integer id;
    private String title;
    private String author;
    private String date;
    private double price;
    private int amount;

    public Book() {
    }

    public Book(Integer id, String title, String author, String date, double price, int amount) {

        this.id = id;
        this.title = title;
        this.author = author;
        this.date = date;
        this.price = price;
        this.amount = amount;
    }

    public Integer getId() {

        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", date='" + date + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                '}';
    }
}
