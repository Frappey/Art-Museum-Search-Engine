package interface_adapters;

import interface_adapters.comment.CommentState;
import interface_adapters.favorite.FavoriteState;
import interface_adapters.rating.RatingState;
import view.CFRState;


import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class CFRViewModel {
    private final PropertyChangeSupport support = new PropertyChangeSupport(this);
    private RatingState ratingState;
    private CommentState commentState;
    private FavoriteState favoriteState;
    private final String viewName = "CFRView";

    public CFRViewModel() {
        this.commentState = null;
        this.favoriteState = null;
        this.ratingState = null;
    }

    public CommentState getCommentState() {
        return commentState;
    }

    public FavoriteState getFavoriteState() {
        return favoriteState;
    }

    public void setCommentState(CommentState commentState) {
        this.commentState = commentState;
    }

    public void setFavoriteState(FavoriteState favoriteState) { this.favoriteState = favoriteState; }

    public String getViewName() {
        return viewName;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        support.removePropertyChangeListener(listener);
    }

    public void firePropertyChanged() {
        support.firePropertyChange("commentState", null, this.commentState);
    }

    public RatingState getRatingState() {
        return ratingState;
    }
}


