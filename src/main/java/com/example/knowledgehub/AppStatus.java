package com.example.knowledgehub;

public class AppStatus {
    private String status;
    private String uptime;
    private String database;

    public AppStatus(String status, String uptime, String database) {
        this.status = status;
        this.uptime = uptime;
        this.database = database;
    }

    public String getStatus() {return status;}
    public String getUptime() {return uptime;}
    public String getDatabase() {return database;}
}
