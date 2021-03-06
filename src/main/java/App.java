import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        Cat bean2 = (Cat) applicationContext.getBean("кошка");
        Cat bean3 = (Cat) applicationContext.getBean("кошка");
        boolean hell = (bean == bean1);
        boolean cat = (bean2 == bean3);

        System.out.println(hell);
        System.out.println(cat);
    }
}