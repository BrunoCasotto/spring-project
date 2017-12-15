package com.spring.project.springproject.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spring.project.springproject.dao.HtmlBannerDao;
import com.spring.project.springproject.dao.IBannerDao;
import com.spring.project.springproject.dao.ListBannerDao;
import com.spring.project.springproject.models.*;
import com.spring.project.springproject.dao.ImageBannerDao;
import com.spring.project.springproject.utils.BannerType;
import com.spring.project.springproject.validators.BannerValidator;
import jdk.nashorn.internal.ir.ObjectNode;
import org.springframework.http.HttpRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class BannerController {
    private IBannerDao imageBannerDaoInterface;
    private IBannerDao htmlBannerDaoInterface;
    private IBannerDao listBannerDaoInterface;
    private IBanner bannerInterface;
    private IBannerFactory bannerFactoryInterface;

    @Autowired
    public void instanceDependency(ImageBannerDao imageBannerDao, HtmlBannerDao htmlBannerDao,
                                   ListBannerDao listBannerDao, BannerFactory bannerFactory) {
        this.imageBannerDaoInterface = imageBannerDao;
        this.htmlBannerDaoInterface = htmlBannerDao;
        this.listBannerDaoInterface = listBannerDao;
        this.bannerFactoryInterface = bannerFactory;
    }

    @RequestMapping(value = "banner/imageBanner", method=POST)
    public ResponseEntity<?> insertImageBanner(@RequestBody Map<String, Object> request,
                                  BindingResult bindingResult) {

        bannerInterface = bannerFactoryInterface.getBannerInstance(request);

        final BannerValidator validator = new BannerValidator();
        validator.validate(bannerInterface, bindingResult);

        return ResponseEntity.ok(imageBannerDaoInterface.insert(bannerInterface));
    }

}
