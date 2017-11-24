package mvp.imooc.com.designpattern.abstractFactory;

import android.util.Log;

/**
 * @author:candy
 * @date:2017/11/24 09:42
 * @邮箱:1601796593@qq.com
 */
public abstract class RouJiaMo {
    public String name;
    public void prepare(RouJiaMoYLFactory rouJiaMoYLFactory){
        Meat meat=rouJiaMoYLFactory.createMeat();
        YuanLiao yuanLiao=rouJiaMoYLFactory.createYuanLiao();
        Log.i("TAG","肉夹馍-准备-肉:"+meat+":原料:"+yuanLiao);
    }
    public void fire(){
        Log.i("TAG","肉夹馍-烘烤");
    }
    public void pack(){
        Log.i("TAG","肉夹馍-包装");
    }
}
