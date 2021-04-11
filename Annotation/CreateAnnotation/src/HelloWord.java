import annotation.MyNumberAnnotation;

public class HelloWord {

    @MyNumberAnnotation(value = 9)
    public void sayHello() {
        System.out.println("Hello custom annotation");
    }
}
