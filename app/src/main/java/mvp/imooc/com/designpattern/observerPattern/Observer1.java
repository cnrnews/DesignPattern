package mvp.imooc.com.designpattern.observerPattern;

import android.util.Log;

/**
 * @author:candy
 * @date:2017/11/24 11:15
 * @邮箱:1601796593@qq.com
 */
public class Observer1 implements Observer {



    private Subject mSubject;

    public Observer1(Subject subject) {
        mSubject=subject;
        mSubject.registerObserver(this);
    }

    @Override
    public void update(String msg) {
        Log.i("TAG","Observer1收到订阅消息:"+msg
        );
    }
}
