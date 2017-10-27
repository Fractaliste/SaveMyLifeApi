package raphdine.sml.api.service;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import raphdine.sml.api.dto.IdentificationDto;
import raphdine.sml.api.dto.shutdown.ShutdownStatutDto;
import raphdine.sml.api.exception.NotPossibleException;

/**
 *
 * @author Raphiki
 */
//@Path("sml")
public interface ISaveMyLife {

    @Path("test/{test}")
    @GET
    public String test(@PathParam("test") String qui);

    @POST
    @Path("shutdown/{nbHeure}/{nbMinute}")
    public void scheduleShutdown(@PathParam("nbHeure") Integer nbHeure, @PathParam("nbMinute") Integer nbMinute) throws NotPossibleException;

    @GET
    @Path("shutdown/statut")
    @Produces("application/json")
    public ShutdownStatutDto getShutdownStatut();

    @DELETE
    @Path("shutdown/cancel")
    public Boolean cancelShutdown() throws NotPossibleException;

    @GET
    @Path("identification")
    public IdentificationDto getIdentification();
}
