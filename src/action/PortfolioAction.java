package action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import dataio.*;

public class PortfolioAction extends ActionSupport{

	private List<Article> articleList;

	public List<Article> getArticleList() {
		return articleList;
	}

	public void setArticleList(List<Article> articleList) {
		this.articleList = articleList;
	}
	
	public PortfolioAction()
	{
		
	}
	
	public String execute()
	{
		this.setArticleList(ArticleDAO.queryAllArticles());
		return SUCCESS;
	}
}
