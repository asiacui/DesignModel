Test类   ：为程序入口类，提供main函数；
Operation类     ：为抽象父类，提供操作对象的属性以及抽象方法；
OperationAdd类  ：继承于Operation类，并重写抽象方法为具体的加法操作；
OperationSub类  ：继承于Operation类，并重写抽象方法为具体的减法操作；
OperationMul类  ：继承于Operation类，并重写抽象方法为具体的乘法操作；
OperationDiv类  ：继承于Operation类，并重写抽象方法为具体的除法操作；

OperationFactory类：为简单工厂类，用于生厂具体的实例，其中包含有生产对象实例的判断逻辑。

简单工厂主要的好处就是：
    将对象实例化进行了封装，不用用户利用构造方法去构造，封装成了具体的接口，方便用户使用，而不用关心具体的实现。