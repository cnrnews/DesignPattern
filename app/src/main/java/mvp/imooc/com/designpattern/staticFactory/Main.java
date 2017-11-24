package mvp.imooc.com.designpattern.staticFactory;

/**
 * @author:candy
 * @date:2017/11/22 18:21
 * @邮箱:1601796593@qq.com
 */
public class Main {
    public static void main() {
        ProductFactory factory = new ProductFactory();
        ProductA productA = (ProductA) factory.createProduct("A");
    }
}
