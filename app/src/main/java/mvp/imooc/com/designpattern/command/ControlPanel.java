package mvp.imooc.com.designpattern.command;

/**
 * @author:candy
 * @date:2017/11/24 09:10
 * @邮箱:1601796593@qq.com
 */
public class ControlPanel {


    private static final int BUTTON_SIZE=9;
    private Command[]mCommands;

    public ControlPanel() {
        mCommands = new Command[BUTTON_SIZE];

        for (int i = 0; i <mCommands.length ; i++) {
            mCommands[i]=new NoCommand();
        }
    }

    public void setCommand(int index,Command command)
    {
        mCommands[index]=command;
    }
    public void keyPress(int index)
    {
        mCommands[index].execute();
    }

}
