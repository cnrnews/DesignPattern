package mvp.imooc.com.designpattern.templateMethod;

import android.util.Log;

/**
 * @author:candy
 * @date:2017/11/23 10:49
 * @邮箱:1601796593@qq.com
 */
public class TemplateMain {

    public static void execute()
    {
        Book book=new Book();
        book.setId(1);
        book.setName("candy");
        book.setAuthor("jake");
        book.setPrice(12.4f);
        book.setSale(123);
        Log.i("TAG",new JsonFormatter().formatter(book));
        Log.i("TAG",new XmlFormatter().formatter(book));
        Log.i("TAG",new YAMLFormatter().formatter(book));
    }
}
