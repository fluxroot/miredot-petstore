package com.qmino.miredot.petstore.service;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/test")
public interface MireDotWarningsTestService {

    /**
     * This method has no @summary tag.
     *
     * @return Nothing meaningful.
     * @author Jeroen
     */
    @GET
    @Path("/missing/summary")
    @Produces(MediaType.TEXT_PLAIN)
    public String missingSummary();

    /**
     * This method has no @author tag
     *
     * @return Nothing meaningful.
     *
     */
    @GET
    @Path("/missing/author")
    @Produces(MediaType.TEXT_PLAIN)
    public String missingAuthor();

    /**
     * @return Nothing meaningful.
     *
     * @author Jeroen
     */
    @GET
    @Path("/missing/interface")
    @Produces(MediaType.TEXT_PLAIN)
    public String missingInterface();

    /**
     * This method has missing @param and @return tags
     *
     *
     * @author Jeroen
     */
    @GET
    @Path("/missing/parameter/{id}")
    @Produces(MediaType.TEXT_PLAIN)
    public String missingParameterDoc(@PathParam("id") String id, @QueryParam("name") String name);

    /**
     * This method has no @throws tag
     *
     * @return Nothing meaningful.
     *
     * @author Jeroen
     */
    @GET
    @Path("/missing/throws")
    @Produces(MediaType.TEXT_PLAIN)
    public String missingThrows() throws IllegalArgumentException;

    /**
     * This method has no @Produces annotation
     *
     * @return Nothing meaningful.
     *
     * @author Jeroen
     */
    @GET
    @Path("/missing/produces")
    public String missingProduces();

    /**
     * This method has no @Consumes annotation
     *
     * @param name Any name will do
     *
     * @author Jeroen
     */
    @POST
    @Path("/missing/consumes")
    public void missingConsumes(String name);

}
