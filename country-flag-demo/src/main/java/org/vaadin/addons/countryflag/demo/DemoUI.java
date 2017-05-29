package org.vaadin.addons.countryflag.demo;

import com.vaadin.ui.*;
import com.vaadin.ui.themes.ValoTheme;
import org.vaadin.addons.countryflag.CountryFlag;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;

@Title("CountryFlag Add-on Demo")
@SuppressWarnings("serial")
public class DemoUI extends UI
{

    @WebServlet(value = "/*", asyncSupported = true)
    @VaadinServletConfiguration(productionMode = false, ui = DemoUI.class)
    public static class Servlet extends VaadinServlet {
    }

    @Override
    protected void init(VaadinRequest request) {
        final HorizontalLayout layout = new HorizontalLayout();
        layout.setStyleName("demoContentLayout");
        layout.setMargin(true);
        layout.setSpacing(true);
        layout.addComponents(h1("Ice hockey: 1:1"), new CountryFlag("fi"), h1("vs"), new CountryFlag("se"));
        setContent(layout);
    }

    private static Label h1(String text) {
        final Label label = new Label(text);
        label.addStyleName(ValoTheme.LABEL_H1);
        return label;
    }
}
