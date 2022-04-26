package models.lombok;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class GenerateDataLombok {
    private String error;
    private String token;
    @JsonProperty("Result")
    private String result;
    @JsonProperty("Success")
    private String success;
    private Integer total;
}

