package mvp.imooc.com.designpattern.templateMethod.templateMethod2;

import android.util.Log;

/**
 * @author:candy
 * @date:2017/11/23 11:11
 * @邮箱:1601796593@qq.com
 */
public class HRWorker extends Worker {
    private String name;
    public HRWorker(String name) {
        super(name);
        this.name=name;
    }
    @Override
    void work() {
        Log.i("TAG",name+"看简历-打电话-接电话");
    }
}
