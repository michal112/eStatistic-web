package app.estat.web.model.mapper;

import app.estat.web.model.entity.BaseEntity;
import app.estat.web.model.request.EntityRequest;
import app.estat.web.model.response.EntityResponse;

public interface EntityMapper<E extends BaseEntity, R1 extends EntityRequest, R2 extends EntityResponse> {

    R2 mapEntityToResponse(E entity);
    E mapRequestToEntity(R1 requestEntity);

}
