package mvp.imooc.com.designpattern.templateMethod;

/**
 * @author:candy
 * @date:2017/11/23 10:46
 * @邮箱:1601796593@qq.com
 */
public class XmlFormatter extends Formatter {

    @Override
    public String formatter(Book book) {
        String result = "";
        result += "<book_name>" + book.getName() + "</book_name>\n";
        result += "<id>" + book.getId() + "</id>\n";
        result += "<price>" + book.getPrice() + "</price>\n";
        result += "<author>" + book.getAuthor() + "</author>\n";
        result += "<sale>" + book.getSale() + "</sale>\n";
        return result;
    }
}
