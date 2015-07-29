package controllers;

import play.*;
import play.data.validation.Required;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
        render();
    }

    public static void chat() {
        render();
    }
    
    public static void enterDemo(@Required String user, @Required String demo) {        
        if(validation.hasErrors()) {
            flash.error("Please choose a nick name and the demonstration type…");
            chat();
        }
        
        // Dispatch to the demonstration        
        if(demo.equals("refresh")) {
        	Refresh.chat(user);
        }
     
    }

}