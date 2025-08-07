package com.example.knowledgehub;

public class ApiInfo {
    private String name;
    private String version;
    private String description;
    private String author;

    public ApiInfo(String name, String version, String description, String author) {
        this.name = name;
        this.version = version;
        this.description = description;
        this.author = author;
    }

    public String getName() {return name;}
    public String getVersion() {return version;}
    public String getDescription() {return description;}
    public String getAuthor() {return author;}
}
