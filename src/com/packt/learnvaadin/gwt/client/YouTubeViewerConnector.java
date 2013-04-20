package com.packt.learnvaadin.gwt.client;

import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.widgetideas.client.YouTubeViewer;
import com.vaadin.client.communication.StateChangeEvent;
import com.vaadin.client.ui.AbstractComponentConnector;
import com.vaadin.shared.ui.Connect;

@SuppressWarnings({ "serial", "deprecation" })
@Connect(com.packt.learnvaadin.gwt.YouTubeViewer.class)
public class YouTubeViewerConnector extends AbstractComponentConnector {

	@Override
	public YouTubViewerState getState() {

		return (YouTubViewerState) super.getState();
	}

	@Override
	public YouTubeViewer getWidget() {

		return (YouTubeViewer) super.getWidget();
	}

	@Override
	protected Widget createWidget() {

		return new YouTubeViewer("");
	}

	@Override
	public void onStateChanged(StateChangeEvent stateChangeEvent) {

		super.onStateChanged(stateChangeEvent);

		String movieId = getState().getMovieId();

		getWidget().setMovieID(movieId);
	}
}
