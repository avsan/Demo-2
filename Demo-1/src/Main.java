import java.io.Serializable;

import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.satya.hibernate.dao.ProductDAO;
import com.satya.hibernate.dao.ProductDAOFactory;
import com.satya.hibernate.modal.Product;
import com.satya.hibernate.utill.HibernateUtill;



public class Main {

	private static SessionFactory factory;
	private static Session session;
	public static void main(String[] args) {
		
		Product product = new Product();
		product.setProductId(111);
		product.setProductName("nokia");
		product.setPrice(30);
		
		factory = HibernateUtill.getSessionFactory();
		session = factory.openSession();
		Transaction tx=session.beginTransaction();
		/*Object o1 = session.get(Product.class, 110);
		Product product = (Product)o1;
		product.setPrice(34567899);
		*///int save = (Integer)session.saveOrUpdate(product);
	//	session.saveOrUpdate(product);
		session.update(product);
		//System.out.println(save);
	//	session.update(product);
		//session.save(product);
		tx.commit();
		//ProductDAO dao = ProductDAOFactory.getInstance();
		//dao.saveProduct(product);
		//Product readProduct1 = dao.readProduct(103);
		/*Object o1 = session.get(Product.class, 109);
		Object o2 = session.get(Product.class, 103);
		//Product readProduct2 = dao.readProduct(103);
		session.evict(o1);
		Object o3 = session.get(Product.class, 103);
		Object o4 = session.get(Product.class, 103);
		*///Product readProduct3 = dao.readProduct(103);
		//Product readProduct4 = dao.readProduct(103);
		/*System.out.println(readProduct.getProductId());
		System.out.println(readProduct.getProductName());
		System.out.println(readProduct.getPrice());
		*/
		
	}
	
	
}
