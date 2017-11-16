package com.spring.project.springproject.controllers;

import com.spring.project.springproject.dao.IBannerDao;
import com.spring.project.springproject.models.ImageBanner;
import com.spring.project.springproject.dao.ImageBannerDao;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class BannerController {
    private IBannerDao bannerInterface;

    @RequestMapping(value = "banner/imageBanner", method=POST)
    public ResponseEntity<?> insertImageBanner(@RequestParam(value="id", required=true) final String id,
                                  @RequestParam(value="websiteId", required=true) final String websiteId,
                                  @RequestParam(value="type", required=true) final String type,
                                  @RequestParam(value="platform", required=true) final String platform,
                                  @RequestParam(value="campaign", required=true) final String campaign,
                                  @RequestParam(value="imageUrl", required=true) final String imageUrl  ,
                                  @RequestParam(value="imageLink", required=true) final String imageLink) {
        final ImageBanner imageBanner;
        imageBanner = new ImageBanner(id,websiteId,type,platform,imageUrl,imageLink);
        bannerInterface = new ImageBannerDao();
        return  ResponseEntity.ok(bannerInterface.insert(imageBanner));
    }
}
