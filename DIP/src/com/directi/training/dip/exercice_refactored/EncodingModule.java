package com.directi.training.dip.exercice_refactored;

import java.io.IOException;

public class EncodingModule
{
    public void encode(Source... sources) throws IOException
    {
       for(Source source : sources){
            source.encode();
       }
    }
}

