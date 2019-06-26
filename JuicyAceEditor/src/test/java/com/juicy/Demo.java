package com.juicy;

import com.juicy.mode.JuicyAceMode;
import com.juicy.theme.JuicyAceTheme;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

@SuppressWarnings("serial")
@Route("")
public class Demo extends Div {

	public Demo() {

		JuicyAceEditor juicyAceEditor = new JuicyAceEditor();
		juicyAceEditor.setTheme(JuicyAceTheme.eclipse);
		juicyAceEditor.setMode(JuicyAceMode.xml);
		juicyAceEditor.setWidth("1000px");
		juicyAceEditor.setHeight("500px");

		add(juicyAceEditor);
	}
}
