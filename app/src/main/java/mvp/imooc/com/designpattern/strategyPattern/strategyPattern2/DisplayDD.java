package mvp.imooc.com.designpattern.strategyPattern.strategyPattern2;

import android.util.Log;

import mvp.imooc.com.designpattern.strategyPattern.strategyPattern2.algorithms.IDiaplayBehavior;

/**
 * @author:candy
 * @date:2017/11/24 11:48
 * @邮箱:1601796593@qq.com
 */
public class DisplayDD implements IDiaplayBehavior {
    @Override
    public void display() {
        Log.i("TAG","好哦好哦");
    }
}
