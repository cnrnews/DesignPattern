package mvp.imooc.com.designpattern.observerPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author:candy
 * @date:2017/11/24 11:12
 * @邮箱:1601796593@qq.com
 */
public class SubjectFor3D implements Subject {

    private List<Observer>mObservers=new ArrayList<>();

    private String msg;

    public void setMsg(String msg) {
        this.msg = msg;
        notifyObservers();
    }
    @Override
    public void registerObserver(Observer observer) {
        mObservers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int index=mObservers.indexOf(observer);
        if (index>=0)
        {
            mObservers.remove(index);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : mObservers) {
            observer.update(msg);
        }
    }
}
