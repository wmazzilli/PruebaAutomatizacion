package co.com.red5g.patronscreenplay.models.builders;

import co.com.red5g.patronscreenplay.models.UrlFinsonet;
import javafx.util.Builder;

public class UrlFinsonetBuilder implements Builder<UrlFinsonet> {

    private String url;

    public UrlFinsonetBuilder() {
        this.url = "";
    }

    @Override
    public UrlFinsonet build() {
        return new UrlFinsonet(this);
    }

    public String getUrl() {
        return url;
    }

    public static UrlFinsonetBuilder con() {
        return new UrlFinsonetBuilder();
    }

    public UrlFinsonetBuilder conUrl(String url){
        this.url = url;
        return this;
    }

    public UrlFinsonet conLaUrl(){
        conUrl("http://10.10.1.200/");
        return build();
    }


}
