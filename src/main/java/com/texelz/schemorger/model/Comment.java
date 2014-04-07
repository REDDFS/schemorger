package com.texelz.schemorger.model;

/**
 *
 * A comment on an item - for example, a comment on a blog post. The comment's content is expressed via the &quot;text&quot; property, and its topic via &quot;about&quot;, properties shared with all CreativeWorks.
 * @fullPath Thing > CreativeWork > Comment
 *
 * @author Texelz (by Onhate)
 *
 */
public class Comment extends CreativeWork {

	private Integer downvoteCount;
	private Question parentItem;
	private Integer upvoteCount;
	/**
	 * The number of downvotes this question has received from the community.
	 */
	public Integer getDownvoteCount() {
		return this.downvoteCount;
	}
	public void setDownvoteCount(Integer downvoteCount) {
		this.downvoteCount = downvoteCount;
	}
	/**
	 * The parent of a question, answer or item in general.
	 */
	public Question getParentItem() {
		return this.parentItem;
	}
	public void setParentItem(Question parentItem) {
		this.parentItem = parentItem;
	}
	/**
	 * The number of upvotes this question has received from the community.
	 */
	public Integer getUpvoteCount() {
		return this.upvoteCount;
	}
	public void setUpvoteCount(Integer upvoteCount) {
		this.upvoteCount = upvoteCount;
	}
}