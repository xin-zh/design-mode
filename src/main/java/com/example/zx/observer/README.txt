观察者模式
    原理：对象间多对一依赖的一种设计方案，被依赖的对象称为subject，依赖的对象为observer，subject通知observer数据变更
        Subject:登记注册、移除和通知
        Observer:接收输入【是直接接收数据还是收到通知后主动去拉取】

    Java内置观察者
        在通知前要设置setChange函数（boolean）
        Observable  java.util包下的class 不能多重继承
        Observer

    优点：
        低耦合、高内聚，隔离影响