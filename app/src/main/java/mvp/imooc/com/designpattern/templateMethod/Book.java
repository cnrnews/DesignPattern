package mvp.imooc.com.designpattern.templateMethod;

/**
 * @author:candy
 * @date:2017/11/23 10:45
 * @邮箱:1601796593@qq.com
 */
public class Book {
    private int id;
    private String name;
    private String author;
    private double price;
    private int sale;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSale() {
        return sale;
    }

    public void setSale(int sale) {
        this.sale = sale;
    }
}
