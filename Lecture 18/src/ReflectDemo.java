import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;

class Person {
    private String name = "Default";

    public void sayHello() {
        System.out.println("Hello, my name is " + name);
    }
}

public class ReflectDemo {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Person.class;
        Object obj = clazz.getDeclaredConstructor().newInstance();

        Field nameField = clazz.getDeclaredField("name");
        nameField.setAccessible(true);
        nameField.set(obj, "Alice");

        Method sayHello = clazz.getDeclaredMethod("sayHello");
        // sayHello.setAccessible(true);
        sayHello.invoke(obj);
    }
}
