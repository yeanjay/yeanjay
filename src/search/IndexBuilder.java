package search;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.search.FullTextSession;
import org.hibernate.search.Search;

import dataio.Article;
import dataio.HibernateUtil;

public class IndexBuilder {  
//	static Logger log = Logger.getLogger("IndexBuilder");
	
	public static void buildeIndex()
	{
		Session session = HibernateUtil.getSessionFactory().openSession(); 
		FullTextSession fullTextSession = Search.getFullTextSession(session);  
		Transaction tx = fullTextSession.beginTransaction();
		
		try {
			fullTextSession.createIndexer().startAndWait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		List<Article> list = session.createQuery("from Article").list();
		Iterator<Article> itr = list.iterator();
		while (itr.hasNext())
		{
			Article article = itr.next();
			fullTextSession.index(article);
		}
		tx.commit();
	}
}