package app.estat.web.controller;

import app.estat.web.model.entity.Bull;
import app.estat.web.model.request.BullRequest;
import app.estat.web.model.response.BullResponse;
import app.estat.web.service.BullService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/rest/bulls")
public class BullControllerImpl extends AbstractEntityControllerImpl<Bull, BullRequest, BullResponse>
        implements BullController {

    @Autowired
    public void setEntityService(BullService bullService) {
        super.setEntityService(bullService);
    }

}