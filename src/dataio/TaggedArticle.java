package dataio;

import java.io.Serializable;

public class TaggedArticle {

	public static class Id implements Serializable {
		
		private Integer articleId;
		private Integer tagId;
		
		public Id()
		{
			
		}
		public Id(Integer tagId, Integer articleId)
		{
			this.articleId = articleId;
			this.tagId = tagId;	
		}
		public boolean equals(Object o)
		{
			if (o != null && o instanceof Id)
			{
				Id that = (Id)o;
				return (this.articleId == that.articleId && this.tagId == that.tagId );
			}
			else
				return false;
		}
		public int hashCode()
		{
			return articleId.hashCode() + tagId.hashCode();
		}
	}
	
	private Id id;
	private Tag tag;
	private Article article;
	
	public TaggedArticle()
	{
		
	}
	
	public TaggedArticle(Tag tag, Article article)
	{
		this.article = article;
		this.tag = tag;
		this.id = new Id(tag.getId(),article.getId());
		
		tag.getTaggedArticles().add(this);
		article.getTaggedArticles().add(this);
	}

	public Id getId() {
		return id;
	}
	public void setId(Id id) {
		this.id = id;
	}
	public Tag getTag() {
		return tag;
	}
	public void setTag(Tag tag) {
		this.tag = tag;
	}
	public Article getArticle() {
		return article;
	}
	public void setArticle(Article article) {
		this.article = article;
	}
	
}
