package action;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.opensymphony.xwork2.ActionSupport;

import dataio.*;

public class TagAction extends ActionSupport {

	private int tagId;
	private List<Article> articleList;
	
	public TagAction()
	{
		
	}
	
	public int getTagId() {
		return tagId;
	}
	public void setTagId(int tagId) {
		this.tagId = tagId;
	}
	public List<Article> getArticleList() {
		return articleList;
	}
	public void setArticleList(List<Article> articleList) {
		this.articleList = articleList;
	}
	
	public String execute()
	{
		Tag tag = TagDAO.getTagById(this.getTagId());
		this.setArticleList(DataManager.getArticlelistFromTag(tag));
		return SUCCESS;
	}
	
	
}
