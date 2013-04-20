package com.packt.learnvaadin.gwt;

import com.packt.learnvaadin.gwt.client.YouTubViewerState;
import com.vaadin.ui.AbstractComponent;

@SuppressWarnings("serial")
public class YouTubeViewer extends AbstractComponent {

	public YouTubeViewer() {}

	public YouTubeViewer(String movieId) {

		setMovieId(movieId);
	}

	@Override
	protected YouTubViewerState getState() {

		return (YouTubViewerState) super.getState();
	}

	public void setMovieId(String movieId) {

		getState().setMovieId(movieId);
	}
}
