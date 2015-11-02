package app.estat.model.mapper;

import app.estat.model.request.CowRequest;
import app.estat.model.response.CowResponse;
import app.estat.model.entity.Cow;
import app.estat.model.entity.Insemination;
import app.estat.model.entity.Lactation;

import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class CowMapper implements EntityMapper<Cow, CowRequest, CowResponse> {

    @Override
    public CowResponse mapEntityToResponse(Cow cow) {
        CowResponse cowResponse = new CowResponse();

        cowResponse.setName(cow.getName());
        cowResponse.setNumber(cow.getNumber());
        cowResponse.setBook(cow.getBook());
        cowResponse.setBirth(cow.getBirth());

        cowResponse.setId(getEntityResponseId(cow));

        if (cow.getParent() != null) {
            cowResponse.setParentName(cow.getParent().getName());
            cowResponse.setParentNumber(cow.getParent().getNumber());
        } else {
            cowResponse.setParentName(null);
            cowResponse.setParentNumber(null);
        }

        List<Lactation> lactations = cow.getLactations();
        if (lactations != null && !lactations.isEmpty()) {
            Lactation lastLactation = getLastObjectFromCollection(lactations);
            cowResponse.setLastLactationDate(lastLactation.getDate());
            cowResponse.setLactationCount(lactations.size());
        } else {
            cowResponse.setLastLactationDate(null);
            cowResponse.setLactationCount(null);
        }

        List<Insemination> inseminations = cow.getInseminations();
        if (inseminations != null && !inseminations.isEmpty()) {
            Insemination lastInsemination = getLastObjectFromCollection(inseminations);
            cowResponse.setLastInseminationBullName(lastInsemination.getBull().getName());
            cowResponse.setLastInseminationBullNumber(lastInsemination.getBull().getNumber());
            cowResponse.setLastInseminationDate(lastInsemination.getDate());
        } else {
            cowResponse.setLastInseminationBullName(null);
            cowResponse.setLastInseminationBullNumber(null);
            cowResponse.setLastInseminationDate(null);
        }

        return cowResponse;
    }

    @Override
    public Cow mapRequestToEntity(CowRequest cowRequest) {
        Cow cow = new Cow();

        cow.setName(cowRequest.getName());
        cow.setNumber(cowRequest.getNumber());
        cow.setBook(cowRequest.getBook());
        cow.setBirth(cowRequest.getBirth());

        return cow;
    }

    private <T extends Comparable> T getLastObjectFromCollection(List<T> list) {
        Collections.sort(list);
        return list.get(0);
    }

}
