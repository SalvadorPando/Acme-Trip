package domain;

import java.util.Collection;



public interface Comentable {

	Collection<Comment> getComments();	
	void setComments(Collection<Comment> comments);
}
