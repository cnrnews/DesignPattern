package mvp.imooc.com.designpattern.templateMethod.templateMethod2;

import android.util.Log;

/**
 * @author:candy
 * @date:2017/11/23 11:11
 * @邮箱:1601796593@qq.com
 */
public class ITWorker extends Worker {

    private String name;
    public ITWorker(String name) {
        super(name);
        this.name=name;
    }
    @Override
    void work() {
        Log.i("TAG",name+"改bug-制造bug");
    }
}
