package com.company;

import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.util.LinkedList;

public class Spellbook implements Serializable {


    LinkedList<Magic> magicLinkedList;

    public Spellbook() {
        magicLinkedList = new LinkedList<>();
    }

    public LinkedList<Magic> getMagicLinkedList() {
        return magicLinkedList;
    }

    public void setMagicLinkedList(LinkedList<Magic> magicLinkedList) {
        this.magicLinkedList = magicLinkedList;
    }

    public byte[] listToByteArray() {
        return(this.magicLinkedList.toString().getBytes(StandardCharsets.UTF_8));
    }

    public void wipeList() {
        magicLinkedList.clear();
    }
}
