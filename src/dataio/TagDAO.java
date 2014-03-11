package dataio;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;

public class TagDAO {

	public static Tag getTagById(int id)
	{
		Tag tag = new Tag();
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
		tag = (Tag) session.get(Tag.class, id);

		session.getTransaction().commit();
		
   //     HibernateUtil.getSessionFactory().close();
		
		return tag;
	}
}
