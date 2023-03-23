package com.example.catfactsspringshell;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CatFact {
    private String text;

    private String _id;

    // annotation needed, doesn't work without it
    @JsonProperty("status")
    private Status status;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }


    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return text + _id + status.getVerified();
    }
}
