package net.akiyasui47.sample.entity.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * SampleResultSetError
 *
 * @author akiyasui47
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SampleResultSetError {

    @JsonProperty("Code")
    private String code;

    @JsonProperty("Message")
    private String message;

    @JsonProperty("Details")
    private List<SampleResultSetErrorDetail> details;

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return this.code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

    public void setDetails(List<SampleResultSetErrorDetail> details) {
        this.details = details;
    }

    public List<SampleResultSetErrorDetail> getDetails() {
        return this.details;
    }
}
