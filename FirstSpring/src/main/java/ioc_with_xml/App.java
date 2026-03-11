package ioc_with_xml;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class App {
    public static void main(String[] args) {
        BeanFactory beanFactory1 = new XmlBeanFactory(new ClassPathResource("beans_configuration_1.xml"));
        Laptop l2 = (Laptop) beanFactory1.getBean("bean_id");
        System.out.println(l2);

        BeanFactory beanFactory2 = new XmlBeanFactory(new ClassPathResource("beans_configuration"));
        Laptop l3 = (Laptop) beanFactory1.getBean("bean_id");
        System.out.println(l3);

        Laptop laptop2 = (Laptop) beanFactory1.getBean("bean_id4");
        System.out.println(laptop2);

        ApplicationContext context = new ClassPathXmlApplicationContext("beans_configuration_1.xml");
        Laptop laptop3 = (Laptop) context.getBean("bean_id");
        System.out.println(laptop3);
    }
}
