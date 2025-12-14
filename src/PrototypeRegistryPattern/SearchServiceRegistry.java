package PrototypeRegistryPattern;

import java.util.HashMap;

public abstract class SearchServiceRegistry {
    public static HashMap<String, SearchService> hmap = new HashMap<>();

    public static void register(String searchType) {
        SearchService ss = new SearchService();
        ss.type = searchType;
        ss.url = "https://search.com/";
        hmap.put(searchType, ss);
    }

    public static SearchService fetch(String searchType) {
        SearchService ss = hmap.get(searchType);
        return ss.clone();
    }
}
