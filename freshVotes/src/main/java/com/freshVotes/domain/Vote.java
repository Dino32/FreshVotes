package com.freshVotes.domain;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "vote")
public class Vote {

	private VoteId pk; // primary key for this table
	private Boolean upvote;

	public Boolean getUpvote() {
		return upvote;
	}

	public void setUpvote(Boolean upvote) {
		this.upvote = upvote;
	}
	
	@EmbeddedId
	public VoteId getPk() {
		return pk;
	}

	public void setPk(VoteId pk) {
		this.pk = pk;
	}
	
	 
}
