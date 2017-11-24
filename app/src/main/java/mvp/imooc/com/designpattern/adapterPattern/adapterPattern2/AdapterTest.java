package mvp.imooc.com.designpattern.adapterPattern.adapterPattern2;

/**
 * @author:candy
 * @date:2017/11/24 08:44
 * @邮箱:1601796593@qq.com
 */
public class AdapterTest {

    public static void execute()
    {

        Mobile mobile=new Mobile();
        mobile.inputPower(new V5Adapter(new V220Power()));
    }
}
