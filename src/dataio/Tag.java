package dataio;

import java.util.HashSet;
import java.util.Set;

public class Tag {

	private int id;
	private String name;
	private Set<TaggedArticle> taggedArticles = new HashSet<TaggedArticle>();
	
	public Tag()
	{
		
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<TaggedArticle> getTaggedArticles() {
		return taggedArticles;
	}
	public void setTaggedArticles(Set<TaggedArticle> taggedArticles) {
		this.taggedArticles = taggedArticles;
	}
}
