package com.example.schoolapp.Models.Entities;

public class MessageChatGoup {
    String date;
    String message;
    String name;
    String time;
    String nameGroup;

    public MessageChatGoup() {
    }

    public MessageChatGoup(String date, String message, String name, String time, String nameGroup) {
        this.date = date;
        this.message = message;
        this.name = name;
        this.time = time;
        this.nameGroup = nameGroup;
    }


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getNameGroup() {
        return nameGroup;
    }

    public void setNameGroup(String nameGroup) {
        this.nameGroup = nameGroup;
    }
}
