package com.juicy;

import com.juicy.mode.JuicyAceMode;
import com.juicy.theme.JuicyAceTheme;
import com.vaadin.flow.component.AbstractSinglePropertyField;
import com.vaadin.flow.component.Focusable;
import com.vaadin.flow.component.HasSize;
import com.vaadin.flow.component.Synchronize;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;

/**
 * @author: Sergio Alberto Hilerio.
 */
@SuppressWarnings("serial")
@Tag("juicy-ace-editor")
@HtmlImport("bower_components/juicy-ace-editor/juicy-ace-editor.html")
public class JuicyAceEditor extends AbstractSinglePropertyField<JuicyAceEditor, String> implements HasSize, Focusable<JuicyAceEditor> {

	public JuicyAceEditor() {
		super("value", "", false);
	}

	/**
	 * Sets the mode(language) of the editor.
	 *
	 * @param mode mode(language)
	 */
	public void setMode(JuicyAceMode mode) {
		getElement().setAttribute("mode", "ace/mode/" + mode);
	}

	/**
	 * Sets the theme (style) of the editor.
	 *
	 * @param theme theme(style)
	 */
	public void setTheme(JuicyAceTheme theme) {
		getElement().setAttribute("theme", "ace/theme/" + theme);
	}

	/**
	 * Sets the font size of the editor.
	 *
	 * @param fontsize fontsize
	 */
	public void setFontsize(Integer fontsize) {
		getElement().setAttribute("fontsize", String.valueOf(fontsize));
	}

	/**
	 * Pass true to enable the use of soft tabs. Soft tabs means you're using spaces
	 * instead of the tab character ('\t').
	 *
	 * @param softtabs softtabs
	 */
	public void setSofttabs(Boolean softtabs) {
		getElement().setAttribute("softtabs", softtabs);
	}

	/**
	 * Set the number of spaces that define a soft tab; for example, passing in 4
	 * transforms the soft tabs to be equivalent to four spaces. This function also
	 * emits the changeTabSize event.
	 *
	 * @param tabsize tabsize
	 */
	public void setTabsize(Integer tabsize) {
		getElement().setAttribute("tabsize", String.valueOf(tabsize));
	}

	/**
	 * Pass true to enable the editor in read-only mode.
	 *
	 * @param readonly readonly.
	 */
	public void setReadonly(Boolean readonly) {
		getElement().setAttribute("readonly", readonly);
	}

	/**
	 * Sets whether or not line wrapping is enabled.
	 *
	 * @param wrapmode wrapmode.
	 */
	public void setWrapmode(Boolean wrapmode) {
		getElement().setAttribute("wrapmode", wrapmode);
	}

	/**
	 * Sets the boundaries of wrap(maxLines). Either value can be null to have an
	 * unconstrained wrap, or, they can be the same number to pin the limit.
	 *
	 * @param maxLines maxLines.
	 */
	public void setMaxLines(Integer maxLines) {
		getElement().setAttribute("max-lines", String.valueOf(maxLines));
	}

	/**
	 * Sets the boundaries of wrap(minLines). Either value can be null to have an
	 * unconstrained wrap, or, they can be the same number to pin the limit.
	 *
	 * @param minLines minLines.
	 */
	public void setMinLines(Integer minLines) {
		getElement().setAttribute("min-lines", String.valueOf(minLines));
	}

	public void setShadowStyle(String shadowStyle) {
		getElement().setAttribute("shadow-style", String.valueOf(shadowStyle));
	}

	/**
	 * Cleans the value contained in the editor.
	 */
	public void clear() {
		getElement().setProperty("value", "");
	}

	/**
	 * Sets value for the editor.
	 */
	public void setValue(String value) {
		getElement().setProperty("value", value);
	}

	/**
	 * Returns the current value of the editor.
	 * 
	 * @return the current value.
	 */
	@Synchronize(value = { "change" })
	public String getValue() {
		return getElement().getProperty("value");
	}


//	/**
//	 * Add a value change listener. The listener is called when the user or
//	 * programmatically changes the value of editor.
//	 * 
//	 * @return this JuicyAceEditor.
//	 */
//	public void addValueChangeListener(ValueChangeListener listener) {
//		this.getElement().addEventListener("change", args -> listener.valueChange(this));
//	}
//
//	public static interface ValueChangeListener {
//		public void valueChange(JuicyAceEditor juicyAceEditor);
//	}

}