package mvp.imooc.com.designpattern.staticFactory;

/**
 * 静态工厂
 * 1.
 * 简单工厂模式最大的优点在于实现对象的创建和对象的使用分离，将对象的创建交给专门的工厂类负责，但是其最大的缺点在于工厂类不够灵活，
 * 增加新的具体产品需要修改工厂类的判断逻辑代码，而且产品较多时，工厂方法代码将会非常复杂
 * 2.
 * 简单工厂模式适用情况包括：工厂类负责创建的对象比较少；客户端只知道传入工厂类的参数，对于如何创建对象不关心
 * @author:candy
 * @date:2017/11/22 18:19
 * @邮箱:1601796593@qq.com
 */
public class ProductFactory {


    public Product createProduct(String name)
    {
        if ("A".equals(name))
        {
            return new ProductA();
        }else if("B".equals(name))
        {
            return new ProductB();
        }
        return null;
    }

}
