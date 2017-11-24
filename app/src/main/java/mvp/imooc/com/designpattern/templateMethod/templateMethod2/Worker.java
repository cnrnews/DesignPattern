package mvp.imooc.com.designpattern.templateMethod.templateMethod2;

import android.util.Log;

/**
 * @author:candy
 * @date:2017/11/23 11:08
 * @邮箱:1601796593@qq.com
 */
public abstract class Worker {
    private String name;
    public Worker(String name) {
        this.name=name;
    }
    private void enterCompaney(){
        Log.i("TAG",name+"进入公司");
    }
    private void openComputer(){
        Log.i("TAG",name+"打开电脑");
    }
    abstract void work();
    private void closeComputer(){
        Log.i("TAG",name+"关闭电脑");
    }
    private void exitCompaney(){
        Log.i("TAG",name+"离开公司");
    }

    /**
     * 记录一天的工作
     */
    public final void workOneDay()
    {

        Log.i("TAG","work start");
        enterCompaney();
        openComputer();
        work();
        closeComputer();
        exitCompaney();
        Log.i("TAG","work start");

    }
}
