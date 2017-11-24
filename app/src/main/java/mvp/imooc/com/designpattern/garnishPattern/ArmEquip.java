package mvp.imooc.com.designpattern.garnishPattern;

/**
 * 武器
 * @author:candy
 * @date:2017/11/24 10:39
 * @邮箱:1601796593@qq.com
 */
public class ArmEquip implements IEquip {

    @Override
    public int caculateAttack() {
        return 12;
    }

    @Override
    public String description() {
        return "武器";
    }
}
