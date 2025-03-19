package com.example.redcross;
//Package name

//Makes it known that it's a spring controller
import org.springframework.stereotype.Controller;
//Allows me to add data to HTML page
import org.springframework.ui.Model;
//Requests for root URl
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
//Declares class
public class LoginController {
    //Executed when the use accesses the homepage /
    @GetMapping("/login")
    //Allows passing data to HTML template
    public String ShowingLogin(Model model) {
        model.addAttribute("navbar", "<nav><ul><li><a href='/'>Home</a></li><li><a href='/about'>About Us</a></li><li><a href='/volunteer'>Volunteer Opportunities</a></li><li><a href='/donate'>Donate Blood</a></li><li><a href='/contact'>Contact Info</a></li><li><a href='/login'>Login</a></li></ul></nav>");
        //This will make Spring boot look for an about html file
        return "login";
    }

    @PostMapping("/login")
    //This is what process the login form submission
    public String login(Model model) {
        return "redirect:/dashboard";
        //If we're able to log in it'll redirect you to dashboard
    }
}