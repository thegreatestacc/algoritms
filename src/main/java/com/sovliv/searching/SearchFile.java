package com.sovliv.searching;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Vladimir Solovyov
 * @project Algorithms
 * @date on 23/05/2022
 */

public class SearchFile {
    public static void main(String[] args) {
        var start = System.currentTimeMillis();
        List<File> files = new ArrayList<>();
        searchPhoto(new File("D:\\"), files);
        for (File file : files) {
            System.out.println(file.getAbsolutePath());
        }
        System.out.println("number of images is - " + files.size());
        var finish = System.currentTimeMillis();
        System.out.println("time for search - " + (finish - start));
    }

    public static void searchPhoto(File rootFile, List<File> files) {
        if (rootFile.isDirectory()) {
            var directoryFiles = rootFile.listFiles();
            if (directoryFiles != null) {
                for (File file : directoryFiles) {
                    if (file.isDirectory()) {
                        searchPhoto(file, files);
                    } else {
                        if (file.getName().toLowerCase().endsWith(".jpg")) {
                            files.add(file);
                        }
                    }
                }
            }
        }
    }
}
