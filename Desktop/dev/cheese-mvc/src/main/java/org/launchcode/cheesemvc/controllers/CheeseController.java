package org.launchcode.cheesemvc.controllers;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



@Controller
@RequestMapping(value= "cheese")
public class CheeseController {
     static HashMap<String, String> cheeses = new HashMap<>();
    //static ArrayList<String> cheeses = new ArrayList<>();
    @RequestMapping(value = "")
    // request path: /cheese
    public String index(Model model){
        model.addAttribute("cheeses", cheeses);
        model.addAttribute("title", "My Cheeses");
        return "cheese/index";
    }
    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String displayAddCheeseForm(Model model){
        model.addAttribute("title", "Add Cheese");
        model.addAttribute("nameError", "");
        return "cheese/add";
    }
    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String processAddCheeseForm(Model model,@RequestParam String cheeseName, String cheeseDescript){
        String nameError;
        if(cheeseName.isEmpty()){
            nameError = "Please enter a valid name!";
            model.addAttribute("nameError", nameError);
            model.addAttribute("title", "Add Cheese");
            return "cheese/add";
        }
        if(cheeseName.matches(".*\\d+.*")){  //alien magic for checking isAlpha
            nameError = "No numbers please!";
            model.addAttribute("nameError", nameError);
            model.addAttribute("title", "Add Cheese");
            return "cheese/add";
        }
        cheeses.put(cheeseName, cheeseDescript);
        //redirect to: /cheese
        return "redirect:";
    }
    @RequestMapping(value = "delete", method = RequestMethod.GET)
    public String removeCheese(Model model){
        model.addAttribute("cheeses", cheeses);
        model.addAttribute("title", "Remove Cheeses");
        return "cheese/delete";
    }
    @RequestMapping(value = "delete", method = RequestMethod.POST)
    public String actuallyRemoveCheese(Model model,@RequestParam String theCheese){
        //theCheese = theCheese.toString();
        if (cheeses.containsKey(theCheese)){
            cheeses.remove(theCheese);
            return "redirect:";
        }
        else{
            model.addAttribute("title", "Error, cheese not found");
            return "cheese/index";
        }
    }
 }

 /*    for (String key : cheeses.keySet()){
            if (cheeses.containsKey(theCheese)){
                cheeses.remove(key);
            }
        }                           */