package co.com.red5g.patronscreenplay.models;

import co.com.red5g.patronscreenplay.models.builders.UrlFinsonetBuilder;

public class UrlFinsonet {

    private String url;

    public UrlFinsonet(UrlFinsonetBuilder urlFinsonetBuilder) {
        this.url = urlFinsonetBuilder.getUrl();
    }

    public String getUrl() {
        return url;
    }
}
