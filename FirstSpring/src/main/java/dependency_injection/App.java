package dependency_injection;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class App {

    public static void main(String[] args) {

        ClassPathResource resource = new ClassPathResource("library_book_dependency_injection.xml");

        BeanFactory factory = new XmlBeanFactory(resource);

        Library library = (Library) factory.getBean("library");

        System.out.println(library);
    }
}