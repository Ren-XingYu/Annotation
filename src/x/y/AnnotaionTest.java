package x.y;

import x.y.annotation.CustomAnnotation;
import x.y.dao.User;

import java.lang.reflect.Method;

public class AnnotaionTest {
    public static void main(String[] args) throws Exception {
        Class clazz=Class.forName("x.y.dao.User");
        Method[] methods=clazz.getMethods();
        for (Method method:methods){
            if (method.isAnnotationPresent(CustomAnnotation.class)){
                CustomAnnotation annotation=method.getAnnotation(CustomAnnotation.class);
                System.out.println(annotation.name());
                System.out.println(annotation.timeout());
                method.invoke(new User());
            }
        }
    }
}
