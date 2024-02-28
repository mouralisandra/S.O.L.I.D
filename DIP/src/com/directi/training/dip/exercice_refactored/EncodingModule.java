package com.directi.training.dip.exercice_refactored;

import java.io.IOException;
import java.util.Base64;

public class EncodingModule {
    private final DataReader dataReader;
    private final DataWriter dataWriter;
    public EncodingModule(DataReader dataReader, DataWriter dataWriter) {
        this.dataReader = dataReader;
        this.dataWriter = dataWriter;
    }

    public void encode() throws IOException {
        String inputData = dataReader.readData();
        String encodedData = Base64.getEncoder().encodeToString(inputData.getBytes());
        dataWriter.writeData(encodedData);
    }
}
