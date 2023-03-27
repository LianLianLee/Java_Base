package java01_basic_plus.q01_oop.contro;

import java01_basic_plus.q01_oop.pojos.Student;
import java01_basic_plus.q01_oop.pojos.User;

import java.util.Date;

public class UserController {

    public static void main(String[] args) {

        //继承：继承是从已有类得到继承信息创建新类的过程
        //User中没有这类属性，调用获取
        User user = new User();
        user.setName("wang");
        user.setAge(18);
        user.setAdd("china");
        user.setClass_name("math");

        //封装：封装是把数据和操作数据的方法绑定起来，
        //对数据的访问只能通过已定义的接口
        System.out.println(user.getAdd());


        //多态性：多态性是指允许不同子类型的对象对同一消息作出不同的响应
        Student student  = new Student();
        student.setDateTime(new Date());
        System.out.println(student.toString());
    }

}
