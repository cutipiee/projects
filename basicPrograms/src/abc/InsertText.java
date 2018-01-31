package abc;

/*import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;*/

public class InsertText {

	public static void main(String args[]) {
	//	Resource r=new ClassPathResource("spring.xml");
		//BeanFactory bean=new XmlBeanFactory(r);
	//	EmpDao dao=(EmpDao)bean.getBean("d");
		
		emp e=new emp();
		e.setId(121);
		e.setName("manpreet");
		e.setSalary(400000);
	//dao.saveEmp(e);
	}
	
}
