package top.dynamicProxy;

/**
 * @ClassName Host
 * @Description TODO
 * @Author ZY
 * @Date2020/8/3 10:28
 * @Version 1.0
 **/
public class Host implements Rent {
    public void rent() {
        System.out.println("I am going to rent out a house to somebody!");
    }

    public void getFare() {
        System.out.println("Pay renting-charge!");
    }

    public void eagerToRent() {
        System.out.println("I am eager to rent out this house for money!");
    }

}
