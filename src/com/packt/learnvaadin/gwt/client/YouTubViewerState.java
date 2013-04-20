package com.packt.learnvaadin.gwt.client;

import com.vaadin.shared.AbstractComponentState;

@SuppressWarnings("serial")
public class YouTubViewerState extends AbstractComponentState {

	private String movieId;

	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
}
