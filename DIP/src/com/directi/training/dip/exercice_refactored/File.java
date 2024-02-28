package com.directi.training.dip.exercice_refactored;

import java.io.*;

public class File implements DataReader, DataWriter{
    private String path;
    File(String path){
        this.path=path;
    }
    @Override
    public String readData() throws IOException {

        try (BufferedReader reader = new BufferedReader(
                new FileReader(this.path))) {
            StringBuilder data = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                data.append(line);
            }
            return data.toString();
        }
    }

    @Override
    public int writeData(String inputString) throws IOException {
        BufferedWriter writer = null;

        try {
            writer = new BufferedWriter(
                    new FileWriter(this.path));
            writer.append(inputString);
        } finally {
            if (writer != null) {
                writer.close();
            }

        }
        return 0;
    }
}
