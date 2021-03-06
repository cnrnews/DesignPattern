package mvp.imooc.com.designpattern.abstractFactory;

/**
 * @author:candy
 * @date:2017/11/24 09:47
 * @邮箱:1601796593@qq.com
 */
public class XianRouJiaMoFactory extends RouJiaMoYLFactory {
    @Override
    public Meat createMeat() {
        return new FreshMeate();
    }
    @Override
    public YuanLiao createYuanLiao() {
        return new XianTeSeYuanliao();
    }
}
