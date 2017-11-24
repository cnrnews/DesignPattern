package mvp.imooc.com.designpattern.observerPattern;

/**
 * 主题
 * @author:candy
 * @date:2017/11/24 11:10
 * @邮箱:1601796593@qq.com
 */
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
