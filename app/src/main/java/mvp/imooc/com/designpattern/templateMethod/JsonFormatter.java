package mvp.imooc.com.designpattern.templateMethod;

/**
 * @author:candy
 * @date:2017/11/23 10:46
 * @邮箱:1601796593@qq.com
 */
public class JsonFormatter extends Formatter {

    @Override
    public String formatter(Book book) {
        String result = "";
        result += "{\n";
        result += "\"id\" : \"" + book.getId() + "\",\n";
        result += "\"name\" : \"" + book.getName() + "\",\n";
        result += "\"price\" : \"" + book.getPrice() + "\",\n";
        result += "\"author\" : \"" + book.getAuthor() + "\",\n";
        result += "\"sale\" : \"" + book.getSale() + "\",\n";
        result += "}";
        return result;
    }
}
