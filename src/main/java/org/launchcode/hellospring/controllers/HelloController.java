package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("hello")
public class HelloController {

    // Handles request at path /hello

//    @GetMapping("hello")
//    @ResponseBody
//    public String hello() {
//        return "Hello, Spring!";
//    }


//    // lives at /hello/goodbye
//    @GetMapping("goodbye")
//    public String goodbye() {
//        return "Goodbye, Spring!";
//    }
//
//    // Create a handler request of the form /hello?name=LaunchCode

    @RequestMapping(method = {RequestMethod.POST})
    public String helloWithQueryParam(@RequestParam String name, @RequestParam String language) {
      return message(name, language);
    }
    public static String message(String name, String language) {

        if (language.equals("english")) {
            return "Hello, " + name + "!";
        }
        else if (language.equals("french")) {
            return "Bonjour, " + name + "!";
        }
        else if (language.equals("spanish")) {
            return "Hola, " + name + "!";
        }
        else if (language.equals("german")) {
            return "Hallo, " + name + "!";
        }
        else if (language.equals("japanese")) {
            return "Kon'nichiwa, " + name + "!";
        }
        return "Hello, world!";
    }
    // Handles requests of the for /hello/LaunchCode
//    @GetMapping("{name}")
//    public String helloWithPathParam(@PathVariable String name) {
//        return "Hello, " + name + "!";
//    }

    // lives at /hello/form
    @GetMapping("form")
    public String helloForm() {
        return "<html>" +
                "<body>" +
                "<form action = '/hello' method = 'post'>" + //submit a request to /hello
                "<input type = 'text' id = 'name' name = 'name'>" +
                "<select id = 'language' name = 'language'>" +
                "<option value = 'english'>English</option>" +
                "<option value = 'french'>French</option>" +
                "<option value = 'spanish'>Spanish</option>" +
                "<option value = 'german'>German</option>" +
                "<option value = 'japanese'>Japanese</option>" +
                "</select>" +
                "<input type = 'submit' value = 'Greet me!'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }


}
