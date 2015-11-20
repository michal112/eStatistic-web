package app.estat.web.service;

import app.estat.web.model.entity.Bull;
import app.estat.web.model.repository.BullRepository;

import org.springframework.stereotype.Service;

@Service
public class BullServiceImpl extends AbstractEntityServiceImpl<BullRepository, Bull>
        implements BullService {}