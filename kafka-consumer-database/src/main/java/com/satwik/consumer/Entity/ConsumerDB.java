package com.satwik.consumer.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="Consumer_DB")
@Getter
@Setter
public class ConsumerDB {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    private String recentChange;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRecentChange() {
        return recentChange;
    }

    public void setRecentChange(String recentChange) {
        this.recentChange = recentChange;
    }
}
