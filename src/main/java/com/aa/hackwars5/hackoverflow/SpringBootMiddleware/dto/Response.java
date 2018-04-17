package com.aa.hackwars5.hackoverflow.SpringBootMiddleware.dto;

public class Response {
    private String speech;
    private String displayText;

    public Response(String speech, String displayText, String source) {
        this.speech = speech;
        this.displayText = displayText;
        this.source = source;
    }

    private String source;



    public String getSpeech() {
        return speech;
    }

    public void setSpeech(String speech) {
        this.speech = speech;
    }

    public String getDisplayText() {
        return displayText;
    }

    public void setDisplayText(String displayText) {
        this.displayText = displayText;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }



}
