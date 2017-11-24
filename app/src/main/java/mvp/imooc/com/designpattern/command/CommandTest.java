package mvp.imooc.com.designpattern.command;

/**
 * @author:candy
 * @date:2017/11/24 09:13
 * @邮箱:1601796593@qq.com
 */
public class CommandTest {


    public static void execute(){

        ControlPanel controlPanel=new ControlPanel();


        Door door=new Door();
        Light light=new Light();
        Computer computer=new Computer();


        controlPanel.setCommand(0,new DoorCloseCommand(door));
        controlPanel.setCommand(1,new LightOffCommand(light));
        controlPanel.setCommand(2,new ComputerOnCommand(computer));
        controlPanel.setCommand(3,new LightOnCommand(light));
        controlPanel.setCommand(4,new ComputerOffCommand(computer));
        controlPanel.setCommand(5,new DoorOpenCommand(door));


        controlPanel.keyPress(0);
        controlPanel.keyPress(1);
        controlPanel.keyPress(2);
        controlPanel.keyPress(3);
        controlPanel.keyPress(4);
        controlPanel.keyPress(5);
        controlPanel.keyPress(8);

    }


}
