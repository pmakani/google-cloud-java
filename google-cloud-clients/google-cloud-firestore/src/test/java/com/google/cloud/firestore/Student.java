package com.google.cloud.firestore;

public class Student {
    private Integer id;
    private String name;
    private Double percentage;
    private Boolean status;

    public Student(Integer id, String name, Double percentage, Boolean status) {
        this.id = id;
        this.name = name;
        this.percentage = percentage;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPercentage() {
        return percentage;
    }

    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
