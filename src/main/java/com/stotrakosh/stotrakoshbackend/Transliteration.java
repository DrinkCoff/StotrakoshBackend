package com.stotrakosh.stotrakoshbackend;
import app.jackychu.api.simplegoogletranslate.Language;
import app.jackychu.api.simplegoogletranslate.SimpleGoogleTranslate;

import java.io.IOException;

/*
 9: Bengali (bn)
33: Gujarati (gu)
38: Hindi (hi)
48: Kannada (kn)
65: Marathi (mr)
74: Punjabi (ma)
92: Tamil (ta)
93: Telugu (te)
 */

public class Transliteration {

    Transliteration()
    {

    }

    public String Transliterate(String textToTransliterate, Language from, Language to) throws IOException, InterruptedException {
        SimpleGoogleTranslate translate = new SimpleGoogleTranslate();
        String result = translate.doTranslate(from, to, textToTransliterate);
        return result;
    }
    
    public Language StringToLanguage(String language){
        switch (language) {
            case "bn":
                return Language.bn;
            case "gu":
                return Language.gu;
            case "hi":
                return Language.hi;
            case "kn":
                return Language.kn;
            case "mr":
                return Language.mr;
            case "ma":
                return Language.ma;
            case "ta":
                return Language.ta;
            case "te":
                return Language.te;
            default:
                return Language.hi;
        }
    }
}
