package mvp.imooc.com.designpattern.garnishPattern;

/**
 * 鞋子
 * @author:candy
 * @date:2017/11/24 10:39
 * @邮箱:1601796593@qq.com
 */
public class ShoeEquip implements IEquip {

    @Override
    public int caculateAttack() {
        return 10;
    }
    @Override
    public String description() {
        return "圣战靴子";
    }
}
