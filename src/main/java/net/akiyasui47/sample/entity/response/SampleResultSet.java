package net.akiyasui47.sample.entity.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SampleResultSet {

    @JsonProperty("Status")
    private Integer status;

    @JsonProperty("Total")
    private Integer total;

    @JsonProperty("Start")
    private Integer start;

    @JsonProperty("Count")
    private Integer count;

    @JsonProperty("Results")
    private List<SampleResponse> results;

    @JsonProperty("Error")
    private SampleResultSetError error;

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getTotal() {
        return this.total;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getStart() {
        return this.start;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getCount() {
        return this.count;
    }

    public void setResults(List<SampleResponse> results) {
        this.results = results;
    }

    public List<SampleResponse> getResults() {
        return this.results;
    }

    public void setError(SampleResultSetError error) {
        this.error = error;
    }

    public SampleResultSetError getError() {
        return this.error;
    }

}
