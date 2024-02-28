package com.directi.training.dip.exercice_refactored;



import java.io.IOException;

public class EncodingModuleClient {
    public static void main(String[] args) throws IOException
    {

         String protocol="http";
         String host="myfirstappwith.appspot.com";
         String file="/index.html";
        DataWriter database = new MyDatabase();
        DataWriter outputFile = new File("DIP/src/com/directi/training/dip/exercise/afterEncryption.txt");
        DataReader inputFile= new File("DIP/src/com/directi/training/dip/exercise/beforeEncryption.txt");
        DataReader networkReader= new NetworkReader(protocol, host,file);
        EncodingModule encodingWithFiles = new EncodingModule(inputFile,outputFile);
        EncodingModule encodingBasedOnNetworkAndDatabase = new EncodingModule(networkReader,database);

        encodingWithFiles.encode();
        encodingBasedOnNetworkAndDatabase.encode();
    }
}
