package mvp.imooc.com.designpattern.adapterPattern.adapterPattern2;

import android.util.Log;

/**
 * @author:candy
 * @date:2017/11/24 08:45
 * @邮箱:1601796593@qq.com
 */
public class Mobile {


    public void inputPower(V5Power v5Power)
    {
        Log.i("TAG","我需要5v电压,现在是"+v5Power.providerV5Power());
    }
}
