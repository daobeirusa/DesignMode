package Proxy;
/*
* Proxy类，保存一个引用使得代理可以访问实体，
* 并提供一个与Subject的接口相同的接口，这样代理可以用来替代实体
* */
public class Proxy extends Subject{
    RealSubject subject;

    @Override
    public void Request() {
        if (subject == null){
            subject = new RealSubject();
        }
        subject.Request();
    }
}
