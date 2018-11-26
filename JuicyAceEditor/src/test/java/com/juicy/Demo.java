package com.juicy;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

@Route("")
public class Demo extends Div {

	public Demo() {

		JuicyAceEditor juicyAceEditor = new JuicyAceEditor();
		juicyAceEditor.setTheme("eclipse");
		juicyAceEditor.setMode("xml");
		juicyAceEditor.setWidth("1000px");
		juicyAceEditor.setHeight("500px");

		add(juicyAceEditor);
	}
}
