package java01_basic_plus.q02_reload_rewrite;

public class Reload_demo {
    private final static String reload_msg = "reload_msg";

    //重载
    public void Reload_demo()
    {
        System.out.println(reload_msg);
    }

    public void Reload_msg(String msg)
    {
        System.out.println("this function is  "+ msg);
    }

    //重载发生在本类
    //重载的方法名必须相同
    //重载的参数列表不同
}
