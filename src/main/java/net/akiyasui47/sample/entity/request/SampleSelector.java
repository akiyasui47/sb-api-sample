package net.akiyasui47.sample.entity.request;

import javax.validation.constraints.*;

public class SampleSelector {

    @Min(1)
    @Digits(integer = 10, fraction = 0)
    private Integer id;

    @Size(min = 1, max = 20)
    private String name;

    private Integer status;

    @Min(1)
    private Integer start;

    @Min(0)
    private Integer results;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getStart() {
        return start;
    }

    public void setResults(Integer results) {
        this.results = results;
    }

    public Integer getResults() {
        return results;
    }

}
