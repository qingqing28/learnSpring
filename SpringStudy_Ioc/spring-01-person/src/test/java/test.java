import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Animal animal1 = new Dog("黑色" , "wang~" , false);
        Animal animal = new Cat("白色", "miao~" , true);
        Person person = new Person("高晨楠" , 22 , animal1);
        person.feed();
    }
}
