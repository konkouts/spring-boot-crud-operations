package com.example.crud.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
public class User {

    @Id
    private String id;
    private String username;
    private String repoUri;

    public User() {
        super();
    }

    public User(String id, String username, String repoUri) {
        super();
        this.id = id;
        this.username = username;
        this.repoUri = repoUri;
    }

    public String getUserId() {
        return id;
    }

    public void setUserId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getrepoUri() {
        return repoUri;
    }

    public void setrepoUri(String repoUri) {
        this.repoUri = repoUri;
    }
}
