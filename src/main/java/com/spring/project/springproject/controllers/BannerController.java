package com.spring.project.springproject.controllers;

import com.spring.project.springproject.dao.HtmlBannerDao;
import com.spring.project.springproject.dao.IBannerDao;
import com.spring.project.springproject.dao.ListBannerDao;
import com.spring.project.springproject.models.Banner;
import com.spring.project.springproject.models.IBanner;
import com.spring.project.springproject.models.ImageBanner;
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

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class BannerController {
    private IBannerDao imageBannerDaoInterface;
    private IBannerDao htmlBannerDaoInterface;
    private IBannerDao listBannerDaoInterface;
    private IBanner bannerInterface;

    @Autowired
    public void instanceDependency(ImageBannerDao imageBannerDao, HtmlBannerDao htmlBannerDao,
                                   ListBannerDao listBannerDao) {
        this.imageBannerDaoInterface = imageBannerDao;
        this.htmlBannerDaoInterface = htmlBannerDao;
        this.listBannerDaoInterface = listBannerDao;
    }

    @RequestMapping(value = "banner/imageBanner", method=POST)
    public ResponseEntity<?> insertImageBanner(@RequestParam(value="id", required=true) final String id,
                                  @RequestParam(value="websiteId", required=true) final String websiteId,
                                  @RequestParam(value="type", required=true) final String type,
                                  @RequestParam(value="platform", required=true) final String platform,
                                  @RequestParam(value="campaign", required=false) final String campaign,
                                  @RequestParam(value="imageUrl", required=true) final String imageUrl  ,
                                  @RequestParam(value="imageLink", required=true) final String imageLink,
                                  @RequestBody ObjectNode request,
                                  BindingResult bindingResult) {

        final BannerValidator validator = new BannerValidator();
        validator.validate(request, bindingResult);

        bannerInterface = new ImageBanner(id,websiteId,type,platform,imageUrl,imageLink);
        return ResponseEntity.ok(imageBannerDaoInterface.insert(bannerInterface));
    }
}
