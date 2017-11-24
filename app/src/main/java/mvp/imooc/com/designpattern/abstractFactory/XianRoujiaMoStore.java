package mvp.imooc.com.designpattern.abstractFactory;

/**
 * @author:candy
 * @date:2017/11/24 09:59
 * @邮箱:1601796593@qq.com
 */
public class XianRoujiaMoStore extends RouJiaMoStore {

    @Override
    RouJiaMo creteRouJiaMo(String type) {

        if (type.equals("suan"))
        {
            return new SuanRouJiaMo();
        }else if (type.equals("tian"))
        {
            return new TianRouJiaMo();
        }else if (type.equals("la"))
        {
            return new LaRouJiaMo();
        }
        return null;
    }
}
