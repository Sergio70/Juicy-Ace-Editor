package com.juicy;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasSize;
import com.vaadin.flow.component.HasText;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.dependency.JavaScript;

@SuppressWarnings("serial")
@Tag("juicy-ace-editor")
@JavaScript("src-noconflict/ext-beautify.js")
@JavaScript("src-noconflict/ext-elastic_tabstops_lite.js")
@JavaScript("src-noconflict/ext-emmet.js")
@JavaScript("src-noconflict/ext-error_marker.js")
@JavaScript("src-noconflict/ext-keybinding_menu.js")
@JavaScript("src-noconflict/ext-language_tools.js")
@JavaScript("src-noconflict/ext-linking.js")
@JavaScript("src-noconflict/ext-modelist.js")
@JavaScript("src-noconflict/ext-options.js")
@JavaScript("src-noconflict/ext-rtl.js")
@JavaScript("src-noconflict/ext-searchbox.js")
@JavaScript("src-noconflict/ext-settings_menu.js")
@JavaScript("src-noconflict/ext-spellcheck.js")
@JavaScript("src-noconflict/ext-split.js")
@JavaScript("src-noconflict/ext-static_highlight.js")
@JavaScript("src-noconflict/ext-statusbar.js")
@JavaScript("src-noconflict/ext-textarea.js")
@JavaScript("src-noconflict/ext-themelist.js")
@JavaScript("src-noconflict/ext-whitespace.js")
@JavaScript("src-noconflict/keybinding-emacs.js")
@JavaScript("src-noconflict/keybinding-vim.js")
@JavaScript("src-noconflict/mode-abap.js")
@JavaScript("src-noconflict/mode-abc.js")
@JavaScript("src-noconflict/mode-actionscript.js")
@JavaScript("src-noconflict/mode-ada.js")
@JavaScript("src-noconflict/mode-apache_conf.js")
@JavaScript("src-noconflict/mode-apex.js")
@JavaScript("src-noconflict/mode-applescript.js")
@JavaScript("src-noconflict/mode-asciidoc.js")
@JavaScript("src-noconflict/mode-asl.js")
@JavaScript("src-noconflict/mode-assembly_x86.js")
@JavaScript("src-noconflict/mode-autohotkey.js")
@JavaScript("src-noconflict/mode-batchfile.js")
@JavaScript("src-noconflict/mode-bro.js")
@JavaScript("src-noconflict/mode-c9search.js")
@JavaScript("src-noconflict/mode-cirru.js")
@JavaScript("src-noconflict/mode-clojure.js")
@JavaScript("src-noconflict/mode-cobol.js")
@JavaScript("src-noconflict/mode-coffee.js")
@JavaScript("src-noconflict/mode-coldfusion.js")
@JavaScript("src-noconflict/mode-csharp.js")
@JavaScript("src-noconflict/mode-csound_document.js")
@JavaScript("src-noconflict/mode-csound_orchestra.js")
@JavaScript("src-noconflict/mode-csound_score.js")
@JavaScript("src-noconflict/mode-csp.js")
@JavaScript("src-noconflict/mode-css.js")
@JavaScript("src-noconflict/mode-curly.js")
@JavaScript("src-noconflict/mode-c_cpp.js")
@JavaScript("src-noconflict/mode-d.js")
@JavaScript("src-noconflict/mode-dart.js")
@JavaScript("src-noconflict/mode-diff.js")
@JavaScript("src-noconflict/mode-django.js")
@JavaScript("src-noconflict/mode-dockerfile.js")
@JavaScript("src-noconflict/mode-dot.js")
@JavaScript("src-noconflict/mode-drools.js")
@JavaScript("src-noconflict/mode-edifact.js")
@JavaScript("src-noconflict/mode-eiffel.js")
@JavaScript("src-noconflict/mode-ejs.js")
@JavaScript("src-noconflict/mode-elixir.js")
@JavaScript("src-noconflict/mode-elm.js")
@JavaScript("src-noconflict/mode-erlang.js")
@JavaScript("src-noconflict/mode-forth.js")
@JavaScript("src-noconflict/mode-fortran.js")
@JavaScript("src-noconflict/mode-fsharp.js")
@JavaScript("src-noconflict/mode-fsl.js")
@JavaScript("src-noconflict/mode-ftl.js")
@JavaScript("src-noconflict/mode-gcode.js")
@JavaScript("src-noconflict/mode-gherkin.js")
@JavaScript("src-noconflict/mode-gitignore.js")
@JavaScript("src-noconflict/mode-glsl.js")
@JavaScript("src-noconflict/mode-gobstones.js")
@JavaScript("src-noconflict/mode-golang.js")
@JavaScript("src-noconflict/mode-graphqlschema.js")
@JavaScript("src-noconflict/mode-groovy.js")
@JavaScript("src-noconflict/mode-haml.js")
@JavaScript("src-noconflict/mode-handlebars.js")
@JavaScript("src-noconflict/mode-haskell.js")
@JavaScript("src-noconflict/mode-haskell_cabal.js")
@JavaScript("src-noconflict/mode-haxe.js")
@JavaScript("src-noconflict/mode-hjson.js")
@JavaScript("src-noconflict/mode-html.js")
@JavaScript("src-noconflict/mode-html_elixir.js")
@JavaScript("src-noconflict/mode-html_ruby.js")
@JavaScript("src-noconflict/mode-ini.js")
@JavaScript("src-noconflict/mode-io.js")
@JavaScript("src-noconflict/mode-jack.js")
@JavaScript("src-noconflict/mode-jade.js")
@JavaScript("src-noconflict/mode-java.js")
@JavaScript("src-noconflict/mode-javascript.js")
@JavaScript("src-noconflict/mode-json.js")
@JavaScript("src-noconflict/mode-jsoniq.js")
@JavaScript("src-noconflict/mode-jsp.js")
@JavaScript("src-noconflict/mode-jssm.js")
@JavaScript("src-noconflict/mode-jsx.js")
@JavaScript("src-noconflict/mode-julia.js")
@JavaScript("src-noconflict/mode-kotlin.js")
@JavaScript("src-noconflict/mode-latex.js")
@JavaScript("src-noconflict/mode-less.js")
@JavaScript("src-noconflict/mode-liquid.js")
@JavaScript("src-noconflict/mode-lisp.js")
@JavaScript("src-noconflict/mode-livescript.js")
@JavaScript("src-noconflict/mode-logiql.js")
@JavaScript("src-noconflict/mode-logtalk.js")
@JavaScript("src-noconflict/mode-lsl.js")
@JavaScript("src-noconflict/mode-lua.js")
@JavaScript("src-noconflict/mode-luapage.js")
@JavaScript("src-noconflict/mode-lucene.js")
@JavaScript("src-noconflict/mode-makefile.js")
@JavaScript("src-noconflict/mode-markdown.js")
@JavaScript("src-noconflict/mode-mask.js")
@JavaScript("src-noconflict/mode-matlab.js")
@JavaScript("src-noconflict/mode-maze.js")
@JavaScript("src-noconflict/mode-mel.js")
@JavaScript("src-noconflict/mode-mixal.js")
@JavaScript("src-noconflict/mode-mushcode.js")
@JavaScript("src-noconflict/mode-mysql.js")
@JavaScript("src-noconflict/mode-nix.js")
@JavaScript("src-noconflict/mode-nsis.js")
@JavaScript("src-noconflict/mode-objectivec.js")
@JavaScript("src-noconflict/mode-ocaml.js")
@JavaScript("src-noconflict/mode-pascal.js")
@JavaScript("src-noconflict/mode-perl.js")
@JavaScript("src-noconflict/mode-perl6.js")
@JavaScript("src-noconflict/mode-pgsql.js")
@JavaScript("src-noconflict/mode-php.js")
@JavaScript("src-noconflict/mode-php_laravel_blade.js")
@JavaScript("src-noconflict/mode-pig.js")
@JavaScript("src-noconflict/mode-plain_text.js")
@JavaScript("src-noconflict/mode-powershell.js")
@JavaScript("src-noconflict/mode-praat.js")
@JavaScript("src-noconflict/mode-prolog.js")
@JavaScript("src-noconflict/mode-properties.js")
@JavaScript("src-noconflict/mode-protobuf.js")
@JavaScript("src-noconflict/mode-puppet.js")
@JavaScript("src-noconflict/mode-python.js")
@JavaScript("src-noconflict/mode-r.js")
@JavaScript("src-noconflict/mode-razor.js")
@JavaScript("src-noconflict/mode-rdoc.js")
@JavaScript("src-noconflict/mode-red.js")
@JavaScript("src-noconflict/mode-redshift.js")
@JavaScript("src-noconflict/mode-rhtml.js")
@JavaScript("src-noconflict/mode-rst.js")
@JavaScript("src-noconflict/mode-ruby.js")
@JavaScript("src-noconflict/mode-rust.js")
@JavaScript("src-noconflict/mode-sass.js")
@JavaScript("src-noconflict/mode-scad.js")
@JavaScript("src-noconflict/mode-scala.js")
@JavaScript("src-noconflict/mode-scheme.js")
@JavaScript("src-noconflict/mode-scss.js")
@JavaScript("src-noconflict/mode-sh.js")
@JavaScript("src-noconflict/mode-sjs.js")
@JavaScript("src-noconflict/mode-slim.js")
@JavaScript("src-noconflict/mode-smarty.js")
@JavaScript("src-noconflict/mode-snippets.js")
@JavaScript("src-noconflict/mode-soy_template.js")
@JavaScript("src-noconflict/mode-space.js")
@JavaScript("src-noconflict/mode-sparql.js")
@JavaScript("src-noconflict/mode-sql.js")
@JavaScript("src-noconflict/mode-sqlserver.js")
@JavaScript("src-noconflict/mode-stylus.js")
@JavaScript("src-noconflict/mode-svg.js")
@JavaScript("src-noconflict/mode-swift.js")
@JavaScript("src-noconflict/mode-tcl.js")
@JavaScript("src-noconflict/mode-terraform.js")
@JavaScript("src-noconflict/mode-tex.js")
@JavaScript("src-noconflict/mode-text.js")
@JavaScript("src-noconflict/mode-textile.js")
@JavaScript("src-noconflict/mode-toml.js")
@JavaScript("src-noconflict/mode-tsx.js")
@JavaScript("src-noconflict/mode-turtle.js")
@JavaScript("src-noconflict/mode-twig.js")
@JavaScript("src-noconflict/mode-typescript.js")
@JavaScript("src-noconflict/mode-vala.js")
@JavaScript("src-noconflict/mode-vbscript.js")
@JavaScript("src-noconflict/mode-velocity.js")
@JavaScript("src-noconflict/mode-verilog.js")
@JavaScript("src-noconflict/mode-vhdl.js")
@JavaScript("src-noconflict/mode-visualforce.js")
@JavaScript("src-noconflict/mode-wollok.js")
@JavaScript("src-noconflict/mode-xml.js")
@JavaScript("src-noconflict/mode-xquery.js")
@JavaScript("src-noconflict/mode-yaml.js")
@JavaScript("src-noconflict/theme-ambiance.js")
@JavaScript("src-noconflict/theme-chaos.js")
@JavaScript("src-noconflict/theme-chrome.js")
@JavaScript("src-noconflict/theme-clouds.js")
@JavaScript("src-noconflict/theme-clouds_midnight.js")
@JavaScript("src-noconflict/theme-cobalt.js")
@JavaScript("src-noconflict/theme-crimson_editor.js")
@JavaScript("src-noconflict/theme-dawn.js")
@JavaScript("src-noconflict/theme-dracula.js")
@JavaScript("src-noconflict/theme-dreamweaver.js")
@JavaScript("src-noconflict/theme-eclipse.js")
@JavaScript("src-noconflict/theme-github.js")
@JavaScript("src-noconflict/theme-gob.js")
@JavaScript("src-noconflict/theme-gruvbox.js")
@JavaScript("src-noconflict/theme-idle_fingers.js")
@JavaScript("src-noconflict/theme-iplastic.js")
@JavaScript("src-noconflict/theme-katzenmilch.js")
@JavaScript("src-noconflict/theme-kr_theme.js")
@JavaScript("src-noconflict/theme-kuroir.js")
@JavaScript("src-noconflict/theme-merbivore.js")
@JavaScript("src-noconflict/theme-merbivore_soft.js")
@JavaScript("src-noconflict/theme-monokai.js")
@JavaScript("src-noconflict/theme-mono_industrial.js")
@JavaScript("src-noconflict/theme-pastel_on_dark.js")
@JavaScript("src-noconflict/theme-solarized_dark.js")
@JavaScript("src-noconflict/theme-solarized_light.js")
@JavaScript("src-noconflict/theme-sqlserver.js")
@JavaScript("src-noconflict/theme-terminal.js")
@JavaScript("src-noconflict/theme-textmate.js")
@JavaScript("src-noconflict/theme-tomorrow.js")
@JavaScript("src-noconflict/theme-tomorrow_night.js")
@JavaScript("src-noconflict/theme-tomorrow_night_blue.js")
@JavaScript("src-noconflict/theme-tomorrow_night_bright.js")
@JavaScript("src-noconflict/theme-tomorrow_night_eighties.js")
@JavaScript("src-noconflict/theme-twilight.js")
@JavaScript("src-noconflict/theme-vibrant_ink.js")
@JavaScript("src-noconflict/theme-xcode.js")
@JavaScript("src-noconflict/worker-coffee.js")
@JavaScript("src-noconflict/worker-css.js")
@JavaScript("src-noconflict/worker-html.js")
@JavaScript("src-noconflict/worker-javascript.js")
@JavaScript("src-noconflict/worker-json.js")
@JavaScript("src-noconflict/worker-lua.js")
@JavaScript("src-noconflict/worker-php.js")
@JavaScript("src-noconflict/worker-xml.js")
@HtmlImport("bower_components/juicy-ace-editor/juicy-ace-editor.html")
public class JuicyAceEditor extends Component implements HasSize, HasText {

	public JuicyAceEditor() {
		UI.getCurrent().getPage().addJavaScript("src-noconflict/worker-xquery.js");
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