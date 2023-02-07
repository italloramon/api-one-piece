package com.ramon.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Column;

@Entity
@Table(name = "characterswiki")
public class CharacterModel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "chapter")
    private Integer chapter;

    @Column(name = "episode")
    private Integer episode;
    
    @Column(name = "year")
    private Integer year;

    @Column(name = "note")
    private String note;

    public CharacterModel(String name, Integer chapter, Integer episode, Integer year, String note) {
        this.name = name;
        this.chapter = chapter;
        this.episode = episode;
        this.year = year;
        this.note = note;
    }

    public CharacterModel() { }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getChapter() {
        return chapter;
    }

    public void setChapter(Integer chapter) {
        this.chapter = chapter;
    }

    public Integer getEpisode() {
        return episode;
    }

    public void setEpisode(Integer episode) {
        this.episode = episode;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((chapter == null) ? 0 : chapter.hashCode());
        result = prime * result + ((episode == null) ? 0 : episode.hashCode());
        result = prime * result + ((year == null) ? 0 : year.hashCode());
        result = prime * result + ((note == null) ? 0 : note.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        CharacterModel other = (CharacterModel) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (chapter == null) {
            if (other.chapter != null)
                return false;
        } else if (!chapter.equals(other.chapter))
            return false;
        if (episode == null) {
            if (other.episode != null)
                return false;
        } else if (!episode.equals(other.episode))
            return false;
        if (year == null) {
            if (other.year != null)
                return false;
        } else if (!year.equals(other.year))
            return false;
        if (note == null) {
            if (other.note != null)
                return false;
        } else if (!note.equals(other.note))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "CharacterModel [id=" + id + ", name=" + name + ", chapter=" + chapter + ", episode=" + episode
                + ", year=" + year + ", note=" + note + "]";
    }

}
