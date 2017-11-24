package mvp.imooc.com.designpattern.strategyPattern.strategyPattern2;

import android.util.Log;

import mvp.imooc.com.designpattern.strategyPattern.strategyPattern2.algorithms.IRunBehavior;

/**
 * @author:candy
 * @date:2017/11/24 11:49
 * @邮箱:1601796593@qq.com
 */
public class RunLB implements IRunBehavior {
    @Override
    public void run() {
        Log.i("TAG","凌波微步");
    }
}
