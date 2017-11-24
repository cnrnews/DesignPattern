package mvp.imooc.com.designpattern.command;

/**
 * @author:candy
 * @date:2017/11/24 09:07
 * @邮箱:1601796593@qq.com
 */
public class DoorCloseCommand implements Command {
    private Door mDoor;
    public DoorCloseCommand(Door door) {
        mDoor=door;
    }
    @Override
    public void execute() {
        mDoor.close();
    }
}
