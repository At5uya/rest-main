package cz.cipisek.rest.resources;


import cz.cipisek.rest.managers.RestManager;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("rest")
@Produces(MediaType.APPLICATION_JSON)
public class RestResource {


    @Inject
    private RestManager restManager;

    @GET
    public Object getAnimal() {
        return Response.ok(RestManager.getAnimal);
    }


    @DELETE
    public void deleteAnimal() {
        restManager.deleteAnimal();
    }

    @GET
    public void getInAnimal(@PathParam("number") Integer number) {
        restManager.getInAnimal();
    }

    @POST
    public void newAnimal(@FormParam("name") String name, @FormParam("agee") String agee) {
        restManager.newAnimal();
    }
    @PUT
    public void changeAnimal(@PathParam("number") Integer number,@FormParam("name") String name ,@FormParam("vek") String agee){
        restManager.changeAnimal();
    }
}
