package cz.malicek.rest.managers;


import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.core.Response;
import java.io.Serializable;
import java.util.HashMap;


@ApplicationScoped
public class RestManager implements Serializable {


    public static Object getAnimal;
    static HashMap<Integer, HashMap<String, String>> animal = new HashMap<>();
    static Integer number = 0;
    static String agee;
    static String namee;


    public void getInAnimal() {
        if (number != null && animal.get(number) != null) {
            Response.ok(animal.get(number)).build();
        } else {
            Response.ok("animal doesnt exist").build();
        }
    }

    public void deleteAnimal() {
        if (number != null) {
            animal.remove(number);
        }
    }

    public void newAnimal() {

        if (namee != null && agee != null) {
            HashMap<String, String> newAnimal = new HashMap<>();
            newAnimal.put("namee", namee);
            newAnimal.put("agee", agee);
            animal.put(number, newAnimal);
            number++;
            Response.ok(animal).build();
        } else {
            Response.ok("Enter the name and age of the animal").build();
        }
    }

    public void changeAnimal(){
        if(animal.get(number) != null && number != null && namee != null && agee != null){
            HashMap<String,String> newAnimal = new HashMap<>();
            newAnimal.put("namee", namee);
            newAnimal.put("agee", agee);
            animal.put(number, newAnimal);
        }
        Response.ok(animal).build();
    }
}
























