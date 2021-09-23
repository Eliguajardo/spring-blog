package models;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;

@EntityScan
@Table(name="post")

public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String title;
    public Post(String title, String description){
        this.title = title;
        this.description = description;

    }
    @Column(nullable = false)
    private String description;

    public Post(long id, String title, String description){
        this.id = id;
        this.title = title;
        this.description = description;
    }
    public Post(){

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
