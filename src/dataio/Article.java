package dataio;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.search.annotations.*;

@Indexed(index = "articles")
public class Article {

	private int id;
	private String title;
	private Date timestamp;
	private String content;
	private String abstractWords;
	private Set<TaggedArticle> taggedArticles = new HashSet<TaggedArticle>();
	
	public Article()
	{
		
	}
	
	@Field(name = "title", store = Store.NO)
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	@DocumentId
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	
	@Field(name = "content")
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getAbstractWords() {
		return abstractWords;
	}
	public void setAbstractWords(String abstractWords) {
		this.abstractWords = abstractWords;
	}
	public Set<TaggedArticle> getTaggedArticles() {
		return taggedArticles;
	}
	public void setTaggedArticles(Set<TaggedArticle> taggedArticles) {
		this.taggedArticles = taggedArticles;
	}
}
