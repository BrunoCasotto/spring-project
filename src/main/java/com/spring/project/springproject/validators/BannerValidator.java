package com.spring.project.springproject.validators;

import com.spring.project.springproject.models.Banner;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class BannerValidator implements Validator {

    /**
     * This Validator validates Customer instances, and any subclasses of Customer too
     */
    public boolean supports(Class banner) {
        return Banner.class.isAssignableFrom(banner);
    }

    public void validate(Object obj, Errors e) {
        ValidationUtils.rejectIfEmpty(e, "id", "id.empty");
        ValidationUtils.rejectIfEmpty(e, "websiteId", "websiteId.empty");
    }
}
