package com.leeheefull.designpattern.adapter.example;

/**
 * Target
 */
public class MKV implements MediaPackage {

    @Override
    public void playFile(String filename) {
        System.out.println("Playing MKV File " + filename);
    }

}
