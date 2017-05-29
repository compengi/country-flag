package org.vaadin.addons.countryflag;

import com.vaadin.annotations.StyleSheet;
import com.vaadin.ui.CustomComponent;

/**
 * A component which shows the Country Flag for given country. The Country is provided as a ISO 3166-1-alpha-2 code
 * which can be looked up here: <a href="https://www.iso.org/obp/ui/#search/code/">https://www.iso.org/obp/ui/#search/code/</a>
 * <p></p>
 * The flags themselves are taken from <a href="https://github.com/lipis/flag-icon-css">Flag Icon CSS</a> project.
 */
@StyleSheet("vaadin://addons/countryflag/css/flag-icon.css")
public class CountryFlag extends CustomComponent {

    private boolean squared = false;
    /**
     * the lower-case ISO 3166-1-alpha-2 code
     */
    private String country = null;

    /**
     * Creates the component. The component will not initially show any flag.
     */
    public CountryFlag() {
        setWidth("120px");
        setHeight("90px");
        setPrimaryStyleName("flag-icon-background");
        updateStyle();
    }

    /**
     * Creates the component, showing given flag.
     */
    public CountryFlag(String country) {
        this();
        setCountry(country);
    }

    public CountryFlag(String country, boolean isSquared) {
        this();
        setCountry(country);
        setSquared(isSquared);
    }

    public boolean isSquared() {
        return getStyleName().contains("flag-icon-squared");
    }

    public void setSquared(boolean squared) {
        this.squared = squared;
        updateStyle();
    }

    private void updateStyle() {
        setStyleName(country == null ? null : "flag-icon-" + country);
        setStyleName("flag-icon-squared", squared);
    }

    /**
     * Returns the ISO 3166-1-alpha-2 code of the country of the flag currently being shown. You can look up the codes
     * here: <a href="https://www.iso.org/obp/ui/#search/code/">https://www.iso.org/obp/ui/#search/code/</a>
     * @return the lower-case ISO 3166-1-alpha-2 code such as "gb"; may be null if no flag is currently shown.
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the ISO 3166-1-alpha-2 code of the country of the flag currently being shown. You can look up the codes
     * here: <a href="https://www.iso.org/obp/ui/#search/code/">https://www.iso.org/obp/ui/#search/code/</a>
     * @param country the lower-case ISO 3166-1-alpha-2 code such as "gb"; may be null if no flag is currently shown.
     */
    public void setCountry(String country) {
        if (country != null && country.contains(" ")) {
            throw new IllegalArgumentException("Parameter country: invalid value " + country + ": must not contain whitespaces");
        }
        this.country = country == null ? null : country.toLowerCase();
        updateStyle();
    }
}
