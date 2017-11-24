package mvp.imooc.com.designpattern.strategyPattern.strategyPattern2;

import android.util.Log;

import mvp.imooc.com.designpattern.strategyPattern.strategyPattern2.algorithms.IDefendBehavior;

/**
 * @author:candy
 * @date:2017/11/24 11:47
 * @邮箱:1601796593@qq.com
 */
public class DefendTB implements IDefendBehavior {
    @Override
    public void defend() {
        Log.i("TAG","铁布衫");
    }
}
