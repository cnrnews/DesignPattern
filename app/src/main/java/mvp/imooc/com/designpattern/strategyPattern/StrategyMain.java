package mvp.imooc.com.designpattern.strategyPattern;

/**
 * @author:candy
 * @date:2017/11/23 10:31
 * @邮箱:1601796593@qq.com
 */
public class StrategyMain {

    public static void execute()
    {
        QueryUtils.querySql(new String[]{"jake","candt"},new Strategy1());
        QueryUtils.querySql(new String[]{"smith","noke"},new Strategy2());
    }

}
