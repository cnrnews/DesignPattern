package mvp.imooc.com.designpattern.abstractFactory;

/**
 * 肉夹馍门店
 * @author:candy
 * @date:2017/11/24 09:44
 * @邮箱:1601796593@qq.com
 */
public abstract class RouJiaMoStore {
    abstract RouJiaMo creteRouJiaMo(String type);
    public RouJiaMo sellRouJiaMo(String type)
    {
        RouJiaMo rouJiaMo=creteRouJiaMo(type);
        rouJiaMo.prepare(new XianRouJiaMoFactory());
        rouJiaMo.fire();
        rouJiaMo.pack();
        return  rouJiaMo;
    }
}
