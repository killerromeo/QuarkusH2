package org.quarkusOneToOne.Entity;

import jakarta.persistence.*;

@Entity
public class Citizen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int age;
    private String gender;

    @OneToOne(mappedBy = "citizen",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private Aadhar aadhar;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Aadhar getAadhar() {
        return aadhar;
    }

    public void setAadhar(Aadhar aadhar) {
        this.aadhar = aadhar;
    }
}
