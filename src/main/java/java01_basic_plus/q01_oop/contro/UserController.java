package java01_basic_plus.q01_oop.contro;

import java01_basic_plus.q01_oop.pojos.Student;
import java01_basic_plus.q01_oop.pojos.User;

import java.util.Date;

public class UserController {

    public static void main(String[] args) {

        //继承：继承是从已有类得到继承信息创建新类的过程
        //User中没有这类属性，调用获取
        User user = new User();
        user.setName("user");
        user.setAge(18);
        user.setAdd("china");
        user.setClass_name("math");

        //封装：封装是把数据和操作数据的方法绑定起来，
        //对数据的访问只能通过已定义的接口
        user.sayyourname();



        //多态性：多态性是指允许不同子类型的对象对同一消息作出不同的响应
        //虽然没有创建 people实体，但是还是调用了
        Student student  = new Student();
        student.setDateTime(new Date());
        student.setName("stu");
        student.setAdd("china");
        //因为是private属性，所以只能调用

        //重写toString，完全不一样
        //lombok重写
        System.out.println(user.toString());
        //自己重写，用到了父类的 public参数
        System.out.println(student.toString());
    }

}
