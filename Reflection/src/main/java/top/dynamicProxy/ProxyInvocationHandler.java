package top.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName ProxyInvocationHandler
 * @Description TODO
 * @Author ZY
 * @Date2020/8/3 10:33
 * @Version 1.0
 **/
//这个类用于自动生成代理类
public class ProxyInvocationHandler implements InvocationHandler {
    //一问——要动态代理谁？？
    //声明一个接口对象——被代理的接口
    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    //二问——怎么生成？？
    //用于生成得到代理类
    public Object getProxy() {
        //参数：类加载器，接口，中介代理类
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), rent.getClass().getInterfaces(), this);
    }

    //三问——中介代理怎么执行要代理的接口中的方法？？
    //处理代理实例，并返回结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //本质：利用反射
        Object result = method.invoke(rent, args);
        return result;
    }
}
