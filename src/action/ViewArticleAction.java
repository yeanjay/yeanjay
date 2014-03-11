package action;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import dataio.*;

public class ViewArticleAction extends ActionSupport{

	private Article article;
	private int articleId;
	private List<Tag> tagList;
	
	

	public ViewArticleAction ()
	{
		
	}
	
	public Article getArticle() {
		return article;
	}

	public void setArticleId(int articleId) {
		this.articleId = articleId;
	}

	public int getArticleId() {
		return articleId;
	}

	public void setArticle(Article article) {
		this.article = article;
	}
	
	public List<Tag> getTagList() {
		return tagList;
	}

	public void setTagList(List<Tag> tagList) {
		this.tagList = tagList;
	}
	
	public String execute()
	{
		this.setArticle(ArticleDAO.getArticleById(this.articleId));
		this.setTagList(DataManager.getTaglistFromArticle(article));
	/*	this.tagList = new LinkedList<Tag>();
		Iterator<TaggedArticle> itr = article.getTaggedArticles().iterator();
		while (itr.hasNext())
		{
			TaggedArticle ta = itr.next();
			this.tagList.add(ta.getTag());
		}*/
		return SUCCESS;
	}
	
}
