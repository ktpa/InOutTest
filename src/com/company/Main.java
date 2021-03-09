package com.company;

import java.io.*;
import java.util.LinkedList;

public class Main {

    /*
        1. Create a linked list of custom class.
        2. Transform the linked list into an array of bytes.
        3. Save the array of bytes to file
        4. Wipe the linked list from memory
        5. Import the array of bytes from the file
        6. Transform it back to a linked list
     */

    public static void main(String[] args) {
        Spellbook spellbook = new Spellbook();
        spellbook.getMagicLinkedList().add(new Magic("Fire"));
        spellbook.getMagicLinkedList().add(new Magic("Frost"));
        spellbook.getMagicLinkedList().add(new Magic("Earth"));
        spellbook.getMagicLinkedList().add(new Magic("Light"));
        spellbook.getMagicLinkedList().add(new Magic("Dark"));

        File file = new File("MagicList.txt");
        try{
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream out = new ObjectOutputStream(fos);
            out.writeObject(spellbook);
            out.close();
            fos.close();
        } catch (Exception e) {

        }
        System.out.println(spellbook.magicLinkedList.toString());
        spellbook.wipeList();
        spellbook = null;

        try{
            System.out.println(spellbook);
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream in = new ObjectInputStream(fis);
            spellbook = (Spellbook) in.readObject();

            in.close();
            fis.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(spellbook.magicLinkedList.toString());

    }



}
