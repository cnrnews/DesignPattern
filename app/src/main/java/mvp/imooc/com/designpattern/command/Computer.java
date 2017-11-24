package mvp.imooc.com.designpattern.command;

import android.util.Log;

/**
 * @author:candy
 * @date:2017/11/24 09:03
 * @邮箱:1601796593@qq.com
 */
public class Computer {
    public void on()
    {
        Log.i("TAG","打开电脑");

    }
    public void off()
    {
        Log.i("TAG","关闭电脑");
    }
}
