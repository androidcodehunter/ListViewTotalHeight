package com.example.listviewheigh;

public class CommentsViewData {
	 private String data;
	    private String user;
	    private String name;
	    public CommentsViewData(String data,String user,String name){
	        this.data = data;
	        this.user = user;
	        this.name = name;
	    }
	    public String getData(){
	        return data;
	    }
	    public void setData(String data){
	        this.data = data;
	    }
	    public  String getUser(){
	        return user;
	    }
	    public void setUser(String user){
	        this.user = user;
	    }
	    public String getName(){
	        return name;
	    }
	    public void setName(String name){
	       this.name = name;
	    }
}
