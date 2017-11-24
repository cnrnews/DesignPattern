package mvp.imooc.com.designpattern.strategyPattern.strategyPattern2;

import android.util.Log;

import mvp.imooc.com.designpattern.strategyPattern.strategyPattern2.algorithms.IAttactBehavior;

/**
 * @author:candy
 * @date:2017/11/24 11:45
 * @邮箱:1601796593@qq.com
 */
public class AtackJY implements IAttactBehavior {
    @Override
    public void attack() {
        Log.i("TAG","九阳神功");
    }
}
