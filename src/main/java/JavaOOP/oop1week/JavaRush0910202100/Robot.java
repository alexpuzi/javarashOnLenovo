package JavaOOP.oop1week.JavaRush0910202100;

import com.sun.xml.internal.ws.wsdl.writer.document.soap.Body;

public class Robot extends AbstractRobot{

    private String name;

    public Robot(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    //здесь ошибся, не надо имплементирвоать тут
}
