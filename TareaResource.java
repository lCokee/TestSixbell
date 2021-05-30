/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Web_Service;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import org.json.*;

/**
 * REST Web Service
 *
 * @author Coke-PC
 */
@Path("tarea")
public class TareaResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of TareaResource
     */
    public TareaResource() {
    }

    /**
     * Retrieves representation of an instance of Web_Service.TareaResource
     *
     * @return an instance of java.lang.Integer
     */
    @GET
    @Path("json")
    @Produces("application/json")
    public String getJson() {
        String a = calculadora1();
        return a;
    }

    /**
     * PUT method for updating or creating an instance of TareaResource
     *
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @POST
    @Path("ejercicio")
    @Produces("application/json")
    @Consumes("application/json")
    public JSONArray calculadora() {
        JSONArray Arreglojson = new JSONArray();
        int num = 18;
        for (int i = 0; num != 1; i++) {

            if (num % 2 == 0) {

                num = num / 2;
                Arreglojson.put(num);

            } else {
                num = (num * 3) + 1;
                Arreglojson.put(num);
            }

        }
        return Arreglojson;
    }

    @POST
    @Path("ejercicio1")
    @Produces("application/json")
    @Consumes("application/json")
    public String calculadora1() {
        int num = 18;
       JSONArray Arreglojson = new JSONArray();
        for (int i = 0; num != 1; i++) {

            if (num % 2 == 0) {

                num = num / 2;
                Arreglojson.put(num);

            } else {
                num = (num * 3) + 1;
                Arreglojson.put(num);
            }

        }
        return Arreglojson.toString();
    }
}
