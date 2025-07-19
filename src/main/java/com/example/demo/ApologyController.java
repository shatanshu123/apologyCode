package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ApologyController {

    @GetMapping("/api/sorry")
    public Map<String, String> saySorry() {
        String heart =
                "       ******       ******\n" +
                "     **********   **********\n" +
                "   ************* *************\n" +
                "  *****************************\n" +
                "   ***************************\n" +
                "    ***********************\n" +
                "      *******************\n" +
                "        ***************\n" +
                "          ***********\n" +
                "            *******\n" +
                "              ***\n" +
                "               *\n";

        String message = """
                💔 Dear Friend 💔

                I am truly sorry from the bottom of my heart.

                ❝ Sometimes words aren’t enough... ❞

                But I hope this small gesture reaches you.

                🌟 Please come back... you are missed more than words can say.

                🕊️ — With sincerity and hope,
                      Always waiting...

                ✨✨✨ SORRY... PLEASE BE BACK ✨✨✨
                """;

        Map<String, String> response = new HashMap<>();
        response.put("heart", heart);
        response.put("message", message);
        return response;
    }
}
