抽象工厂模式：围绕一个超级工厂创建其他工厂
提供一个创建一系列相关或相互依赖对象的接口，主要解决接口选择的问题

优点：当一个产品族中的多个对象被设计成一起工作时，能保证客户端始终只用同一个产品族中的对象
缺点：产品族扩展非常困难，要增加一系列的某一产品，既要在抽象的Creator中加代码，又要在具体实现中加代码

注意事项：产品族难扩展，产品等级以扩展

