package top.dynamicProxy;

/**
 * @ClassName Client
 * @Description TODO
 * @Author ZY
 * @Date2020/8/3 10:49
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        //需要找代理出租房子的房东
        Host host = new Host();

        //使用用于创建代理的代理类
        ProxyInvocationHandler pih = new ProxyInvocationHandler();

        //代理人给谁代理？——host房东。传入房东。
        pih.setRent(host);

        //创建出代理人——得到一个代理对象
        Rent proxy = (Rent) pih.getProxy();

        //代理对象执行接口的方法。注——代理仅执行接口中的方法，即不执行实现这个接口的类的自定义的方法（例如Host的eagerToRent()）。
        proxy.rent();
        proxy.getFare();

    }


}
