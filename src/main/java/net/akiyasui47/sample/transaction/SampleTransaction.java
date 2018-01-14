package net.akiyasui47.sample.transaction;

import net.akiyasui47.sample.entity.request.SampleSelector;
import net.akiyasui47.sample.entity.response.SampleResponse;
import net.akiyasui47.sample.entity.response.SampleResultSet;
import net.akiyasui47.sample.entity.response.SampleResultSetError;
import net.akiyasui47.sample.entity.response.SampleResultSetErrorDetail;
import net.akiyasui47.sample.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * SampleTransaction
 *
 * @author akiyasui47
 */
@Component
public class SampleTransaction {

    /**
     * service layer application.
     */
    private final SampleService service;

    /**
     * Constructor
     *
     * @param service
     */
    @Autowired
    public SampleTransaction (SampleService service) {
        this.service = service;
    }

    /**
     * get
     *
     * @return
     */
    // @Transactional(readOnly = true)
    public SampleResultSet get (SampleSelector selector) {
        // Validation
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();
        Set<ConstraintViolation<SampleSelector>> violations = validator.validate(selector);
        if (violations.size() > 0) {
            SampleResultSet resultSet = new SampleResultSet();
            SampleResultSetError error = new SampleResultSetError();
            List<SampleResultSetErrorDetail> details = new ArrayList<SampleResultSetErrorDetail>();
            for (ConstraintViolation<SampleSelector> violation : violations) {
                SampleResultSetErrorDetail detail = new SampleResultSetErrorDetail();
                detail.setKey(violation.getPropertyPath().toString());
                detail.setValue(violation.getMessage());
                details.add(detail);
            }
            error.setCode("400");
            error.setMessage("Bad Request.");
            error.setDetails(details);
            resultSet.setError(error);
            resultSet.setStatus(400);
            return resultSet;
        }
        // set default value: start
        if (selector.getStart() == null) {
            selector.setStart(1);
        }
        // set default value: results
        if (selector.getResults() == null) {
            selector.setResults(10);
        }
        // results
        List<SampleResponse> results;
        // get total
        Integer total = service.getTotal(selector);
        if (total.equals(0) || total < selector.getStart()) {
            results = new ArrayList<SampleResponse>();
        } else {
            results = service.get(selector);
        }
        // get results
        SampleResultSet resultSet = new SampleResultSet();
        resultSet.setStatus(200);
        resultSet.setTotal(total);
        resultSet.setStart(selector.getStart());
        resultSet.setCount(results.size());
        return resultSet;
    }
}
