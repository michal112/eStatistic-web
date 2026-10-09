package app.estat.web.service;

import app.estat.web.model.entity.BaseEntity;

import java.util.List;

public interface EntityService<E extends BaseEntity> {

    E save(E entity);
    List<E> getAll();
    E get(Long id);
    E update(Long id, E entity);
    void delete(Long id);
    void deleteAll();

}
