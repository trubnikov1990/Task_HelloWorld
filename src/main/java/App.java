import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld beanOne =
                (HelloWorld) applicationContext.getBean("helloworld");

        System.out.println(beanOne.getMessage());

        HelloWorld beanTwo = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(beanTwo.getMessage());
        System.out.println(beanOne == beanTwo);

        Cat catFirst = (Cat) applicationContext.getBean("cat");
        Cat catSecond = (Cat) applicationContext.getBean("cat");
        System.out.println(catFirst == catSecond);

    }
}