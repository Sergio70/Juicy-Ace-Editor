package com.juicy;

import com.juicy.mode.JuicyAceMode;
import com.juicy.theme.JuicyAceTheme;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasSize;
import com.vaadin.flow.component.Synchronize;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;

@SuppressWarnings("serial")
@Tag("juicy-ace-editor")
@HtmlImport("bower_components/juicy-ace-editor/juicy-ace-editor.html")
public class JuicyAceEditor extends Component implements HasSize {

	public JuicyAceEditor() {
	}

	public void setMode(JuicyAceMode mode) {
		getElement().setAttribute("mode", "ace/mode/" + mode);
	}

	public void setTheme(JuicyAceTheme theme) {
		getElement().setAttribute("theme", "ace/theme/" + theme);
	}

	public void setFontsize(Integer fontsize) {
		getElement().setAttribute("fontsize", String.valueOf(fontsize));
	}

	public void setSofttabs(Boolean softtabs) {
		getElement().setAttribute("softtabs", String.valueOf(softtabs));
	}

	public void setTabsize(Integer tabsize) {
		getElement().setAttribute("tabsize", String.valueOf(tabsize));
	}

	public void setReadonly(Boolean readonly) {
		getElement().setAttribute("readonly", String.valueOf(readonly));
	}

	public void setWrapmode(Boolean wrapmode) {
		getElement().setAttribute("wrapmode", String.valueOf(wrapmode));
	}

	public void setMaxLines(Integer maxLines) {
		getElement().setAttribute("max-lines", String.valueOf(maxLines));
	}

	public void setMinLines(Integer minLines) {
		getElement().setAttribute("min-lines", String.valueOf(minLines));
	}

	public void setShadowStyle(String shadowStyle) {
		getElement().setAttribute("shadow-style", String.valueOf(shadowStyle));
	}

	public void clear() {
		getElement().setProperty("value", "");
	}

	public void setValue(String value) {
		getElement().setProperty("value", value);
	}

	@Synchronize(value = { "change" })
	public String getValue() {
		return getElement().getProperty("value");
	}

	public void addValueChangeListener(ValueChangeListener listener) {
		this.getElement().addEventListener("change", args -> listener.valueChange(this));
	}

	public static interface ValueChangeListener {
		public void valueChange(JuicyAceEditor juicyAceEditor);
	}

}