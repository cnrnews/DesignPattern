package mvp.imooc.com.designpattern.abstractFactory;

/**
 * @author:candy
 * @date:2017/11/24 09:56
 * @邮箱:1601796593@qq.com
 */
public class AbstratFactoryTest {
    public static void execute() {
        RouJiaMoStore rouJiaMoStore = new XianRoujiaMoStore();
        rouJiaMoStore.sellRouJiaMo("la");
    }
}
