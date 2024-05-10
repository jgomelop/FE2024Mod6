package com.codefactory.seat.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.List;

@JsonIgnoreProperties({"hibernateLazyInitializer",
        "handler"})
@Entity
public class SeatClass {
    @Id
    private Long id;
    @Enumerated(EnumType.STRING)
    private Type type;

    @JsonIgnore
    @OneToMany(cascade=CascadeType.ALL, mappedBy="seatClass")
    private List<Seat> seats;

    public SeatClass() {
    }

    public SeatClass(Long id, Type type) {
        this.id = id;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "SeatClass{" +
                "id=" + id +
                ", type=" + type +
                ", seats=" + seats +
                '}';
    }

    public enum Type {
        TOURIST, FIRST_CLASS, EXECUTIVE
    }
}
