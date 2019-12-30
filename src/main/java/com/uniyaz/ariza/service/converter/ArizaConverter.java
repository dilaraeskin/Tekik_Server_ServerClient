package com.uniyaz.ariza.service.converter;
import com.uniyaz.ariza.domain.Ariza;
import com.uniyaz.ariza.service.dto.ArizaDto;

import javax.swing.text.html.ListView;
import java.util.ArrayList;
import java.util.List;

public class ArizaConverter {


    public Ariza convertToAriza(ArizaDto arizaDto) {

        Ariza ariza = new Ariza();
        ariza.setId(arizaDto.getId());
        ariza.setMusteriIsim(arizaDto.getMusteriIsim());
        ariza.setEnumArizaDurum(arizaDto.getEnumArizaDurum());

        return ariza;

    }

    public List<ArizaDto>convertToArizaDtoList(List<Ariza> arizaList){

        List<ArizaDto> arizaDtoList=new ArrayList<>();
        for(Ariza ariza: arizaList){
            ArizaDto arizaDto=convertToArizaDto(ariza);
            arizaDtoList.add(arizaDto);
        }
        return arizaDtoList;
    }

    public ArizaDto convertToArizaDto(Ariza ariza) {

        ArizaDto arizaDto = new ArizaDto();
        arizaDto.setId(ariza.getId());
        arizaDto.setMusteriIsim(ariza.getMusteriIsim());
        arizaDto.setEnumArizaDurum(ariza.getEnumArizaDurum());

        return arizaDto;
    }
}
