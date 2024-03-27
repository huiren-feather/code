package com.andy.generic_;

public class CustomeInterfaceGeneric {
    public static void main(String[] args) {

    }
}

interface IUsb<U,R>{
    int i = 10;
//    U name;   //接口中都是静态属性，所以不能写
    R get(U u);
    void hi(R r);

}
//继承时确定泛型类型
interface  IA extends IUsb<String,Double>{

}
class A implements IA {

    @Override
    public Double get(String s) {
        return null;
    }

    @Override
    public void hi(Double aDouble) {

    }
}

//实现接口时，直接指定泛型接口类型
class B implements IUsb<Integer,Float>{
    public B() {
    }

    @Override
    public Float get(Integer integer) {
        return null;
    }

    @Override
    public void hi(Float aFloat) {

    }
}
//实现接口时，也可以不指定，默认是Object
class C implements IUsb{
    @Override
    public Object get(Object o) {
        return null;
    }

    @Override
    public void hi(Object o) {

    }
}

class D implements IUsb{

    @Override
    public Object get(Object o) {
        return null;
    }

    @Override
    public void hi(Object o) {

    }
}