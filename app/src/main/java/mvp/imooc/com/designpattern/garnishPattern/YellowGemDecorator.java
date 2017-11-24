package mvp.imooc.com.designpattern.garnishPattern;

/**
 * @author:candy
 * @date:2017/11/24 10:42
 * @邮箱:1601796593@qq.com
 */
public class YellowGemDecorator implements IEquipDecorator {


    private IEquip mIEquip;
    public YellowGemDecorator(IEquip iEquip) {

        mIEquip=iEquip;
    }

    @Override
    public int caculateAttack() {
        return 15+mIEquip.caculateAttack();
    }

    @Override
    public String description() {
        return mIEquip.description()+"黄宝石";
    }
}
