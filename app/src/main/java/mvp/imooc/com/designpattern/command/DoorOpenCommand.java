package mvp.imooc.com.designpattern.command;

/**
 * @author:candy
 * @date:2017/11/24 09:07
 * @邮箱:1601796593@qq.com
 */
public class DoorOpenCommand implements Command {
    private Door mDoor;
    public DoorOpenCommand(Door door) {
        mDoor=door;
    }
    @Override
    public void execute() {
        mDoor.open();
    }
}
