package com.uniyaz.ariza.service.rest;


import com.uniyaz.ariza.dao.ArizaDao;
import com.uniyaz.ariza.domain.Ariza;
import com.uniyaz.ariza.service.converter.ArizaConverter;
import com.uniyaz.ariza.service.dto.ArizaDto;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;
import java.util.List;

@Provider
@Path("/ariza")
public class ArizaRestService {


    //Arizaları listele
    @GET
    @Path("/findAll")
    @Produces(MediaType.APPLICATION_JSON)
    public Response findAll() {
        ArizaDao arizaDao = new ArizaDao();
        List<Ariza> arizaList = arizaDao.findAllAriza();

        ArizaConverter arizaConverter = new ArizaConverter();
        List<ArizaDto> arizaDtoList = arizaConverter.convertToArizaDtoList(arizaList);
        return Response.ok().entity(arizaDtoList).build();
    }

    //Arama filterisini müşteri adıyla yap.
    @POST
    @Path("/findByMusteriAdiPost")
    @Produces(MediaType.APPLICATION_JSON)
    public Response findByIdPost(@FormParam("musteriAdi ") String musteriAdi) {
        ArizaDao arizaDao = new ArizaDao();
        Ariza ariza = arizaDao.findAllByMusteriAdi(musteriAdi);

        ArizaConverter arizaConverter = new ArizaConverter();
        ArizaDto arizaDto = arizaConverter.convertToArizaDto(ariza);
        return Response.ok().entity(arizaDto).build();
    }

    //Ariza kaydet
    @POST
    @Path("/saveAriza")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response saveCategory(ArizaDto arizaDto) {

        ArizaConverter arizaConverter = new ArizaConverter();
        Ariza ariza = arizaConverter.convertToAriza(arizaDto);

        ArizaDao arizaDao = new ArizaDao();
        ariza = arizaDao.saveAriza(ariza);

        arizaDto = arizaConverter.convertToArizaDto(ariza);
        return Response.ok().entity(arizaDto).build();
    }

}