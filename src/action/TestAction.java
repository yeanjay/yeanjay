package action;
import com.opensymphony.xwork2.ActionSupport;
import dataio.*;

public class TestAction extends ActionSupport {

	public String str;
	
	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	
	public String getTheString()
	{
	//	this.setStr(ArticleManager.queryAllArticles());
		return SUCCESS;
	}

	public TestAction() {
		// TODO Auto-generated constructor stub
	}

}
