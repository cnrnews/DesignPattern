package mvp.imooc.com.designpattern.command;

/**
 * @author:candy
 * @date:2017/11/24 09:07
 * @邮箱:1601796593@qq.com
 */
public class ComputerOnCommand implements Command {
    private Computer mComputer;
    public ComputerOnCommand(Computer computer) {
        mComputer=computer;
    }
    @Override
    public void execute() {
        mComputer.on();
    }
}
