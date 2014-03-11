package search;

import org.hibernate.Session;
import org.hibernate.search.FullTextSession;
import org.hibernate.search.Search;
import org.hibernate.search.SearchFactory;
import org.hibernate.search.query.dsl.QueryBuilder;

import dataio.HibernateUtil;

public class Query {

	public static void queryByKeywords()
	{
//		Session session = HibernateUtil.getSessionFactory().openSession(); 
//		FullTextSession fullTextSession = Search.getFullTextSession(session);  
//		SearchFactory searchFactory = fullTextSession.getSearchFactory();
//		QueryBuilder mythQB = searchFactory.buildQueryBuilder().forEntity( Myth.class ).get();
	}
}
