package com.spring.project.springproject.validators;

import com.spring.project.springproject.models.Banner;
import com.spring.project.springproject.models.ImageBanner;
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

    /**
     * Basic validation and delegate especifics validations banner
     * @param obj
     * @param e
     */
    public void validate(Object obj, Errors e) {
        ValidationUtils.rejectIfEmpty(e, "imageUrl", "imageUrl.empty");
    }
}
