package com.juicy;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasSize;
import com.vaadin.flow.component.HasText;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;

@SuppressWarnings("serial")
@Tag("juicy-ace-editor")
@HtmlImport("bower_components/juicy-ace-editor/juicy-ace-editor.html")
public class JuicyAceEditor extends Component implements HasSize, HasText {

	public JuicyAceEditor() {
	}

	public void setMode(String mode) {
		getElement().setAttribute("mode", "ace/mode/" + mode);
	}

	public void setTheme(String theme) {
		getElement().setAttribute("theme", "ace/theme/" + theme);
	}
 
	public void clear() {
		getElement().setText("");
	}

	public void setValue(String value) {
		getElement().setText(value);
	}

}