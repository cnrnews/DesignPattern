package mvp.imooc.com.designpattern.assemblagePattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author:candy
 * @date:2017/11/23 10:09
 * @邮箱:1601796593@qq.com
 */
public class TechinicalStatistics implements Statistics {

    private List<Statistics>mStatistics=new ArrayList<>();

    public TechinicalStatistics() {
        mStatistics.add(new ComputerStatistics());
        mStatistics.add(new MedicalStatistics());
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
        int saleCount=0;
        for (Statistics statistic : mStatistics) {
            saleCount+=statistic.getSaleCount();
        }
        return saleCount;
    }
}
