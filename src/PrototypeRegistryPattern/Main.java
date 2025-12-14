package PrototypeRegistryPattern;

public class Main {
    public static void main(String[] args) {

        SearchServiceRegistry.register("images");
        SearchServiceRegistry.register("videos");

        SearchService searchImages = SearchServiceRegistry.fetch("images");
        searchImages.pages = 12;
        searchImages.query = "beautuful cats";


        SearchService searchVideos = SearchServiceRegistry.fetch("videos");
        searchVideos.pages = 9;
        searchVideos.query = "beautuful dogs";

    }
}
