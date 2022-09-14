package com.example.th1_buoi7.Model;

import javax.persistence.*;

@Entity
@Table(name = "tutorials")
public class Tutorial {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "ID")
    private long Id;
    @Column(name = "title")
    private String title;
    @Column(name = "description")
    private String description;
    @Column (name = "published")
    private boolean published;

    public Tutorial(String title, String description, boolean published) {
        long id = 1;
        Id = id;
        this.title = title;
        this.description = description;
        this.published = published;
    }

    public Tutorial() {

    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
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

    public boolean isPublished() {
        return published;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }

    public String toString(){
        return "Tutorial [id=" + Id + ", title=" + title + ", desc=" + description + ", published=" + published + "]";
    }
}
