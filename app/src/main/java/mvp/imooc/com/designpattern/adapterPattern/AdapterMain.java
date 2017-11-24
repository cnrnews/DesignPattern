package mvp.imooc.com.designpattern.adapterPattern;

import android.util.Log;

/**
 * 适配器模式
 * 将一个类的接口转换成客户希望的另外一个接口。适配器模式使得原本由于接口不兼容而不能一起工作的那些类可以一起工作
 * @author:candy
 * @date:2017/11/23 09:00
 * @邮箱:1601796593@qq.com
 */
public class AdapterMain {
    public static void execute() {
        String xml1=XmlBuild.xmlBuild(new ServerOne());
        String xml2=XmlBuild.xmlBuild(new ServerTwo());
        String xml3=XmlBuild.xmlBuild(new ServerThree());
        Log.i("TAG",xml1);
        Log.i("TAG",xml2);
        Log.i("TAG",xml3);
    }
}
