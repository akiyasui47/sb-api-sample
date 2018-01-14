package net.akiyasui47.sample.resource;

import net.akiyasui47.sample.entity.request.SampleSelector;
import net.akiyasui47.sample.entity.response.SampleResultSet;
import net.akiyasui47.sample.transaction.SampleTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * FrontController
 *
 * @author akiyasui47
 */
@RestController
public class FrontController {

    /**
     * transaction layer application.
     */
    private final SampleTransaction transaction;

    /**
     * Constructor
     *
     * @param transaction
     */
    @Autowired
    public FrontController (SampleTransaction transaction) {
        this.transaction = transaction;
    }

    /**
     * getStatus
     *
     * @return
     */
    @RequestMapping(value = "/status", method = RequestMethod.GET)
    public String getStatus () {
        return "OK";
    }

    /**
     * get
     *
     * @return
     */
    @RequestMapping(value = "/SampleService/V1/get", method = RequestMethod.GET)
    public ResponseEntity<SampleResultSet> get (@ModelAttribute SampleSelector selector) {
        SampleResultSet resultSet = transaction.get(selector);
        return new ResponseEntity<SampleResultSet>(resultSet, HttpStatus.valueOf(resultSet.getStatus()));
    }

}
