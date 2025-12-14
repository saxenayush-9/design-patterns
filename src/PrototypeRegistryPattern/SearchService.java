package PrototypeRegistryPattern;

public class SearchService {
    String type;
    String url;
    String query;
    int pages;

    SearchService() {
    }

    SearchService(SearchService s) {
        this.type = s.type;
        this.url = s.url;
    }

    public SearchService clone() {
        return new SearchService(this);
    }
}
