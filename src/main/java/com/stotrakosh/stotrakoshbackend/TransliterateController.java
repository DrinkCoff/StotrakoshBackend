package com.stotrakosh.stotrakoshbackend;

import app.jackychu.api.simplegoogletranslate.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@Controller // This means that this class is a Controller
@RequestMapping(path="/api/transliterate")//, method = {RequestMethod.GET, RequestMethod.POST}) // This means URL's start with /demo (after Application path)
@CrossOrigin(origins = {"http://localhost:4200/", "http://localhost:8080/"}, methods = {RequestMethod.GET, RequestMethod.POST})
public class TransliterateController {
    @Autowired // This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data
    private StotrakoshRepository stotrakoshRepository;
    private Transliteration transliteration = new Transliteration();

    @GetMapping(path="/job")
    public @ResponseBody String tranliterate(@RequestParam("text") String text, @RequestParam("to") String to) throws IOException, InterruptedException {
        String transliteratedText;
        Language languageFrom = Language.en;
        Language languageTo = transliteration.StringToLanguage(to);
        transliteratedText = transliteration.Transliterate(text, languageFrom, languageTo);
        return transliteratedText;
    }
}
