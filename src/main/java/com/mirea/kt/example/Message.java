/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mirea.kt.example;

import java.io.Serializable;

/**
 *
 * @author ПК
 */
public class Message implements Serializable {
private static final long serialVersionUID = -3380157693869190848L;
private final int id;
private final String body;
private final String type;
private final boolean hasAttachments;
private final long timestamp;

public Message(int id, String body, String type, boolean hasAttachments, long timestamp) {
    this.id = id;
    this.body = body;
    this.type = type;
    this.hasAttachments = hasAttachments;
    this.timestamp = timestamp;
}

public int getId() {
    return id;
}

public String getBody() {
    return body;
}

public String getType() {
    return type;
}

public boolean hasAttachments() {
    return hasAttachments;
}

public long getTimestamp() {
    return timestamp;
}
}