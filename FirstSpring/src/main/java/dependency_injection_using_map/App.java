package dependency_injection_using_map;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class App {

    public static void main(String[] args) {

        ClassPathResource resource =
                new ClassPathResource("map_dependency_injection.xml");

        BeanFactory factory = new XmlBeanFactory(resource);

        Kit kit = (Kit) factory.getBean("kit");

        System.out.println(kit);
    }
}