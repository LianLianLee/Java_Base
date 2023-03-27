package java01_basic_plus.q02_reload_rewrite;

public class app {
    public static void main(String[] args) {

        //重载方法调用
        Reload_demo reload_demo = new Reload_demo();
        reload_demo.Reload_msg("reload_msg");

        //重写方法调用
        Rewrite newrewrite = new Rewrite_demo();
        newrewrite.Rewrite("rewrite_msg");
    }
}
