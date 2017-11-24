package mvp.imooc.com.designpattern.strategyPattern.strategyPattern2;

import android.util.Log;

/**
 * @author:candy
 * @date:2017/11/24 11:54
 * @邮箱:1601796593@qq.com
 */
public class StrategyPattern2Test {

    public static void execute()
    {
        Role role1=new RoleA("A");

        role1.setIAttactBehavior(new AtackJY())
                .setIDefendBehavior(new DefendTB())
                .setIDiaplayBehavior(new DisplayDD())
                .setIRunBehavior(new RunLB());

        Log.i("TAG","rolename:"+role1.name);

        role1.run();
        role1.attack();
        role1.defend();
        role1.display();
    }
}
