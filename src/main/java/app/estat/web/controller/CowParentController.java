package app.estat.web.controller;

import app.estat.web.model.response.Response;

public interface CowParentController extends EntityController<CowParentRequest> {

    Response getCowParentChildren(Long cowParentId);

}
