package mvp.imooc.com.designpattern.assemblagePattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 医学
 * @author:candy
 * @date:2017/11/23 10:02
 * @邮箱:1601796593@qq.com
 */
public class MedicalStatistics implements Statistics {
    @Override
    public int getBrowerCount() {
        int browerCount=0;
        List<String>novals= getAllMedicalBoooks();
        for (String noval : novals) {
            browerCount+=getBrowerCount(noval);
        }
        return browerCount;
    }
    @Override
    public int getSaleCount() {
        int saleCount=0;
        List<String>novals= getAllMedicalBoooks();
        for (String noval : novals) {
            saleCount+=getSaleCount(noval);
        }
        return saleCount;
    }
    public List<String> getAllMedicalBoooks()
    {
        List<String>novals=new ArrayList<>();
        novals.add("医学1");
        novals.add("医学2");
        return novals;
    }

    public int getBrowerCount(String novalName){
        return 62;
    }
    public int getSaleCount(String novalName){
        return 12;
    }
}
