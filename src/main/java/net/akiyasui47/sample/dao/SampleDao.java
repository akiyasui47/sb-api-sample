package net.akiyasui47.sample.dao;

import net.akiyasui47.sample.entity.request.SampleSelector;
import net.akiyasui47.sample.entity.response.SampleResponse;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * SampleDao
 *
 * @author akiyasui47
 */
@Component
public class SampleDao {


    //private final JdbcTemplate jdbcTemplate;


    /**
     * getTotal
     *
     * @param selector
     * @return
     */
    public Integer getTotal (SampleSelector selector) {
        return 0;
    }

    /**
     * get
     *
     * @param selector
     * @return
     */
    public List<SampleResponse> get (SampleSelector selector) {
        return new ArrayList<SampleResponse>();
    }

}
