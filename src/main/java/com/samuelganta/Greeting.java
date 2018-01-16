package com.samuelganta;

//The Greeting object in the following code contains 
//fields such as id and content that correspond to the
//form fields in the greeting view, and will 
//be used to capture the information from the form.
public class Greeting {
	
	private long id;
    private String content;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


}
