package com.javapractice.demo.entities;


import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "film")
public class Film implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private UUID id;

    @Column(nullable = false, length = 25)
    private String Nazvanie;

    @Column(nullable = false, length = 25)
    private String Actor;



    public UUID getId() {return id;}

    public void setId(UUID id) {this.id = id;}

    public String getNazvanie () {return Nazvanie;}

    public  void setNazvanie (String nazvanie) {this.Nazvanie = nazvanie;}

    public String getActor () {return Actor;}

    public  void setActor (String Actor) {this.Actor = Actor;}


}
