import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ReflectionTest {
    public static void main(String[] args) {

        Reflection reflection = new Reflection();
        Class reflectionClass = reflection.getClass();

        System.out.println(reflectionClass.getSimpleName());

        Method[] methods = reflectionClass.getDeclaredMethods();
        for (Method m:methods){
            System.out.println(m);
            Parameter[] parameters = m.getParameters();
            for (Parameter parameter:parameters){
                System.out.println(parameter.getName());
            }
        }


    }


}
