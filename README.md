# 元注解

    @Retention
        RetentionPolicy.SOURCE
        RetentionPolicy.CLASS
        RetentionPolicy.RUNTIME
    @Documented
    @Target
        ElementType.ANNOTATION_TYPE 可以给一个注解进行注解
        ElementType.CONSTRUCTOR 可以给构造方法进行注解
        ElementType.FIELD 可以给属性进行注解
        ElementType.LOCAL_VARIABLE 可以给局部变量进行注解
        ElementType.METHOD 可以给方法进行注解
        ElementType.PACKAGE 可以给一个包进行注解
        ElementType.PARAMETER 可以给一个方法内的参数进行注解
        ElementType.TYPE 可以给一个类型进行注解，比如类、接口、枚举
    @Inherited
        超类被注解修饰，子类也拥有该注解
    @Repeatable
        可重复,比如一个人他既是程序员又是产品经理,同时他还是个画家。
        
# Java预置的注解

    @Deprecated
    @Override
    @SuppressWarnings
    @SafeVarargs
    @FunctionalInterface
        