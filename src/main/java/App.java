import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld newBean = (HelloWorld) applicationContext.getBean("helloworld");

        Cat myCat = applicationContext.getBean("catBean", Cat.class);
        System.out.println(myCat.getName());
        Cat yourCat = applicationContext.getBean("catBean", Cat.class);
        System.out.println(bean == newBean);
        System.out.println(myCat == yourCat);

    }
}