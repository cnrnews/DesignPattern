package mvp.imooc.com.designpattern.garnishPattern;

/**
 * 护腕
 * @author:candy
 * @date:2017/11/24 10:39
 * @邮箱:1601796593@qq.com
 */
public class WristEquip implements IEquip {

    @Override
    public int caculateAttack() {
        return 11;
    }
    @Override
    public String description() {
        return "护腕";
    }
}
