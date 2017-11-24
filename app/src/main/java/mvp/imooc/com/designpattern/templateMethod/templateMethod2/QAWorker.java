package mvp.imooc.com.designpattern.templateMethod.templateMethod2;

import android.util.Log;

/**
 * @author:candy
 * @date:2017/11/23 11:11
 * @邮箱:1601796593@qq.com
 */
public class QAWorker extends Worker {

    private String name;
    public QAWorker(String name) {
        super(name);
        this.name=name;
    }
    @Override
    void work() {
        Log.i("TAG",name+"写测试用例-测试-写测试用例");
    }
}
