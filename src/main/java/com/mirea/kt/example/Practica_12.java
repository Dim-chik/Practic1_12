/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mirea.kt.example;

/**
 *
 * @author ПК
 */
    
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;

/**
 *
 * @author ПК
 */
public class Practica_12 {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Entre filePath:");
        String filePath = null;
        try {
            filePath = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
        Message message = (Message) ois.readObject();
        System.out.println("Message id: " + message.getId());
        System.out.println("Message body: " + message.getBody());
        System.out.println("Message type: " + message.getType());
        System.out.println("Message hasAttachments: " + message.hasAttachments());
        System.out.println("Message timestamp: " + message.getTimestamp());
    } catch (IOException | ClassNotFoundException e) {
        e.printStackTrace();
    }
}
}

