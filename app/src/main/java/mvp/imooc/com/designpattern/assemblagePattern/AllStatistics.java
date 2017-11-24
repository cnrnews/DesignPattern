package mvp.imooc.com.designpattern.assemblagePattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author:candy
 * @date:2017/11/23 10:11
 * @邮箱:1601796593@qq.com
 */
public class AllStatistics implements Statistics {

    private List<Statistics> mStatistics=new ArrayList<>();
    public AllStatistics() {
        mStatistics.add(new NovalStatistics());
        mStatistics.add(new TechinicalStatistics());
    }
    @Override
    public int getBrowerCount() {
        int browerCount=0;
        for (Statistics statistic : mStatistics) {
            browerCount+=statistic.getBrowerCount();
        }
        return browerCount;
    }

    @Override
    public int getSaleCount() {
        int browerCount=0;
        for (Statistics statistic : mStatistics) {
            browerCount+=statistic.getSaleCount();
        }
        return browerCount;
    }
}
