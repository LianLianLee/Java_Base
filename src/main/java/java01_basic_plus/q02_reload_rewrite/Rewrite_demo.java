package java01_basic_plus.q02_reload_rewrite;

public class Rewrite_demo implements Rewrite{

    @Override
    public void Rewrite(String msg) {
        System.out.println("this function is  "+ msg);
    }

    //重写发生在父类与子类之间
    //重写的方法名相同且返回值类型必须相同
    //重写的参数列表必须相同
    //重写的访问权限不能比父类中被重写的方法的访问权限更低

    //这里的父类更适合用 类去验证， 接口只是做一个扩展
}
