import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import annotation.MyNumberAnnotation;

public class Test {
    public static void main(String[] args) throws Exception {
        HelloWord h = new HelloWord();
        Method m = h.getClass().getMethod("sayHello");
        Annotation annotation = m.getAnnotation(MyNumberAnnotation.class);
        
        if (annotation instanceof MyNumberAnnotation) {
            MyNumberAnnotation myNumberAnnotation = (MyNumberAnnotation) annotation;
            System.out.println(myNumberAnnotation.value());
        }
    }
}
