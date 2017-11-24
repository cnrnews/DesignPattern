package mvp.imooc.com.designpattern.command;

/**
 * @author:candy
 * @date:2017/11/24 09:07
 * @邮箱:1601796593@qq.com
 */
public class ComputerOffCommand implements Command {
    private Computer mComputer;
    public ComputerOffCommand(Computer computer) {
        mComputer=computer;
    }
    @Override
    public void execute() {
        mComputer.off();
    }
}
