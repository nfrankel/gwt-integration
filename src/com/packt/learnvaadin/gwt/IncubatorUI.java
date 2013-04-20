package com.packt.learnvaadin.gwt;

import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.data.Property.ValueChangeListener;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
public class IncubatorUI extends UI {

	@Override
	protected void init(VaadinRequest request) {

		final YouTubeViewer viewer = new YouTubeViewer("yWrkinZkKjI");

		TextField field = new TextField("Movie ID:", "yWrkinZkKjI");

		field.setImmediate(true);

		field.addValueChangeListener(new ValueChangeListener() {

			@Override
			public void valueChange(ValueChangeEvent event) {

				String movieId = (String) event.getProperty().getValue();

				viewer.setMovieId(movieId);
			}
		});

		VerticalLayout layout = new VerticalLayout(viewer, field);

		layout.setSpacing(true);
		layout.setMargin(true);

		setContent(layout);
	}
}