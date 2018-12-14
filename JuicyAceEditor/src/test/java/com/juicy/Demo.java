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
		juicyAceEditor.setValue("demo");
		juicyAceEditor.setTheme(JuicyAceTheme.eclipse);
		juicyAceEditor.setMode(JuicyAceMode.xml);
		juicyAceEditor.setWidth("1000px");
		juicyAceEditor.setHeight("500px");
		juicyAceEditor.setFontsize(15);
//		juicyAceEditor.setSofttabs(false);
//		juicyAceEditor.setTabsize(15);
		juicyAceEditor.setReadonly(false);
//		juicyAceEditor.setWrapmode(false);
//		juicyAceEditor.setMaxLines(2);
//		juicyAceEditor.setMinLines(2);
		// juicyAceEditor.setShadowStyle("");

		System.out.println("getValue: " + juicyAceEditor.getValue());
		juicyAceEditor.addValueChangeListener(e -> {
			System.out.println("ValueChangeListener: " + e.getValue());
		});

		add(juicyAceEditor);
	}
}
