package net.akiyasui47.sample.service;

import net.akiyasui47.sample.dao.SampleDao;
import net.akiyasui47.sample.entity.request.SampleSelector;
import net.akiyasui47.sample.entity.response.SampleResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Sample Service
 *
 * @author akiyasui47
 */
@Component
public class SampleService {

    /**
     * dao
     */
    private final SampleDao dao;

    /**
     * Constructor
     *
     * @param dao
     */
    @Autowired
    public SampleService (SampleDao dao) {
        this.dao = dao;
    }

    /**
     * getTotal
     *
     * @param selector
     * @return
     */
    public Integer getTotal (SampleSelector selector) {
        return dao.getTotal(selector);
    }

    /**
     * get
     *
     * @param selector
     * @return
     */
    public List<SampleResponse> get (SampleSelector selector) {
        return dao.get(selector);
    }
}
