package mvp.imooc.com.designpattern.strategyPattern.strategyPattern2;

import mvp.imooc.com.designpattern.strategyPattern.strategyPattern2.algorithms.IAttactBehavior;
import mvp.imooc.com.designpattern.strategyPattern.strategyPattern2.algorithms.IDefendBehavior;
import mvp.imooc.com.designpattern.strategyPattern.strategyPattern2.algorithms.IDiaplayBehavior;
import mvp.imooc.com.designpattern.strategyPattern.strategyPattern2.algorithms.IRunBehavior;

/**
 * @author:candy
 * @date:2017/11/24 11:49
 * @邮箱:1601796593@qq.com
 */
public abstract class Role {

    protected String name;
    private IRunBehavior mIRunBehavior;
    private IDiaplayBehavior mIDiaplayBehavior;
    private IDefendBehavior mIDefendBehavior;
    private IAttactBehavior mIAttactBehavior;

    public Role(String name) {
        this.name = name;
    }
    public Role setIRunBehavior(IRunBehavior IRunBehavior) {
        mIRunBehavior = IRunBehavior;
        return this;
    }

    public Role setIDiaplayBehavior(IDiaplayBehavior IDiaplayBehavior) {
        mIDiaplayBehavior = IDiaplayBehavior;
        return this;
    }
    public Role setIDefendBehavior(IDefendBehavior IDefendBehavior) {
        mIDefendBehavior = IDefendBehavior;
        return this;
    }
    public Role setIAttactBehavior(IAttactBehavior IAttactBehavior) {
        mIAttactBehavior = IAttactBehavior;
        return this;
    }
    protected void run() {
        mIRunBehavior.run();
    }
    protected void attack() {
        mIAttactBehavior.attack();
    }
    protected void display() {
        mIDiaplayBehavior.display();
    }
    protected void defend() {
        mIDefendBehavior.defend();
    }
}
