package com.currency.pojo;

public class PlatformPojo {

    private String id;
    private String name;
    private String symbol;
    private String slug;
    private String token_address;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getToken_address() {
        return token_address;
    }

    public void setToken_address(String token_address) {
        this.token_address = token_address;
    }

    @Override
    public String toString() {
        return "PlatformPojo{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", symbol='" + symbol + '\'' +
                ", slug='" + slug + '\'' +
                ", token_address='" + token_address + '\'' +
                '}';
    }
}
