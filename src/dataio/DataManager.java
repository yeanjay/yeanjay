package dataio;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class DataManager {

	public static void test()
	{
		Article a0 = new Article();
		a0.setTitle("a0");
		Article a1 = new Article();
		a1.setTitle("a1");
		
		Tag t0 = new Tag();
		t0.setName("t0");
		Tag t1 = new Tag();
		t1.setName("t1");
		
		Session session = HibernateUtil.getSessionFactory().openSession();  
        Transaction transaction = session.beginTransaction();  
          
        session.save(a0);  
        session.save(t0);  
        session.save(a1);  
        session.save(t1); 
        
        TaggedArticle ta0 = new TaggedArticle(t0,a0);
        TaggedArticle ta1 = new TaggedArticle(t0,a1);
        TaggedArticle ta2 = new TaggedArticle(t1,a0);
          
        //测试保存  
        session.save(ta0);  
        session.save(ta1);  
        session.save(ta2);  
          
        session.flush();  
        
        session.getTransaction().commit();
        HibernateUtil.getSessionFactory().close();
	}
	
	public static void test1()
	{
		Session session = HibernateUtil.getSessionFactory().openSession();  
        Transaction transaction = session.beginTransaction();
        String hql = "from Article as a where a.id = \'"+ 9 +"\'";
        
        Query query = session.createQuery(hql);
		List<Article> list = query.list();
		
		Article	article = list.get(0);
		Set<TaggedArticle> set = article.getTaggedArticles();
		Iterator<TaggedArticle> itr = set.iterator();
		
		while (itr.hasNext())
		{
			TaggedArticle ta = itr.next();
			System.out.println(ta.getArticle().getId()+" "+ta.getTag().getId());
		}
		
		session.getTransaction().commit();
		
        HibernateUtil.getSessionFactory().close();
	}
	public static void deleteTest()
	{
		Session session = HibernateUtil.getSessionFactory().openSession();  
        Transaction transaction = session.beginTransaction();
        Article a = (Article) session.get(Article.class, (Integer)8);
     //   System.out.println(a.getTitle());
        
        session.delete(a);
        
        session.getTransaction().commit();
        HibernateUtil.getSessionFactory().close();
	}
	
	public static List<Article> getArticlelistFromTag(Tag tag)
	{
		List<Article> articleList = new LinkedList<Article>();
		Set<TaggedArticle> set = tag.getTaggedArticles();
		Iterator<TaggedArticle> itr = set.iterator();
		while (itr.hasNext())
		{
			TaggedArticle ta = itr.next();
			articleList.add(ta.getArticle());
		}
		return articleList;
	}
	
	public static List<Tag> getTaglistFromArticle(Article article)
	{
		List<Tag> tagList = new LinkedList<Tag>();
		Set<TaggedArticle> set = article.getTaggedArticles();
		Iterator<TaggedArticle> itr = set.iterator();
		while (itr.hasNext())
		{
			TaggedArticle ta = itr.next();
			tagList.add(ta.getTag());
		}
		return tagList;
	}
}
