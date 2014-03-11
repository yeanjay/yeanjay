package dataio;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class ArticleDAO {
	
    public static void createArticle(int id, String title, String content, Date timestamp)
    {
    	Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();

        Article article = new Article();
    //    article.setId(id);
        article.setTitle(title);
        article.setContent(content);
        article.setTimestamp(timestamp);
        
        session.save(article);
        session.getTransaction().commit();
        
        HibernateUtil.getSessionFactory().close();
    }
    
	public static List<Article> queryAllArticles()
	{
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
		String hql = "from Article";
		Query query = session.createQuery(hql);
		List<Article> list = query.list();
		/*for (int i=0;i<list.size();i++)
		{
			Article article = list.get(i);
			temp = article.getContent();
		}*/
		session.getTransaction().commit();
    //  HibernateUtil.getSessionFactory().close();
        
        return list;
	}
	public static Article getArticleById(int id)
	{
		Article article = new Article();
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
		article = (Article) session.get(Article.class, id);
		/*
		String hql = "from Article as a where a.id = \'"+ id +"\'";
		System.out.println(hql);
		Query query = session.createQuery(hql);
		List<Article> list = query.list();
		article = list.get(0);
		*/
		session.getTransaction().commit();
		
   //     HibernateUtil.getSessionFactory().close();
		
		return article;
	}
}
