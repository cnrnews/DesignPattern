package mvp.imooc.com.designpattern.garnishPattern;

import android.util.Log;

/**
 * @author:candy
 * @date:2017/11/24 10:44
 * @邮箱:1601796593@qq.com
 */
public class GarinishTest {


    public static void execute()
    {
        System.out.println(" 一个镶嵌2颗红宝石，1颗蓝宝石的靴子");
        IEquip iEquip=new RedGemDecorator(new RedGemDecorator(new BlueGemDecorator(new ShoeEquip())));
        Log.i("TAG","攻击力:"+iEquip.caculateAttack());
        Log.i("TAG","描述:"+iEquip.description());
        System.out.println("-----------------------------------------");
        System.out.println(" 一个镶嵌1颗红宝石，1颗蓝宝石,1颗黄宝石的武器");
        IEquip iEquip2=new RedGemDecorator(new BlueGemDecorator(new YellowGemDecorator(new ArmEquip())));
        Log.i("TAG","攻击力:"+iEquip2.caculateAttack());
        Log.i("TAG","描述:"+iEquip2.description());
    }
}
