package abc;

import java.util.ArrayList;
import java.util.List;
import abc.emp;
import org.springframework.orm.hibernate3.HibernateTemplate;
public class EmpDao {
HibernateTemplate template;

public void setTemplate(HibernateTemplate template) {
	this.template=template;
}
public void saveEmp(emp e) {
	template.save(e);
}
public void updateEmp(emp e) {
	template.update(e);
}


public List<emp> getemp(){
	List<emp> list=new ArrayList<emp>();
	list=template.loadAll(emp.class);
	return list;
}
}
