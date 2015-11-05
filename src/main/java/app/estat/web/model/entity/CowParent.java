package app.estat.web.model.entity;

import app.estat.web.Application;

import javax.persistence.*;

@javax.persistence.Entity
@Table(name = Application.Consts.TABLE_COW_PARENT)
public class CowParent implements app.estat.web.model.entity.Entity {

    @Id
    @GeneratedValue
    @Column(name = Application.Consts.COLUMN_ID)
    private Long id;

    @Column(name = Application.Consts.COLUMN_NAME)
    private String name;

    @Column(name = Application.Consts.COLUMN_NUMBER)
    private String number;

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

}