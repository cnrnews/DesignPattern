package mvp.imooc.com.designpattern.garnishPattern;

/**
 * 戒指
 * @author:candy
 * @date:2017/11/24 10:39
 * @邮箱:1601796593@qq.com
 */
public class RingEquip implements IEquip {

    @Override
    public int caculateAttack() {
        return 16;
    }

    @Override
    public String description() {
        return "圣战戒指";
    }
}
