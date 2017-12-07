package com.spring.project.springproject.models;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.util.Map;
import static com.spring.project.springproject.utils.BannerType.IMAGE_BANNER;

@Service
public class BannerFactory implements IBannerFactory {
    private IBanner bannerInterface;

    public IBanner getBannerInstance(Map<String, Object> banner) {
        final ObjectMapper mapper = new ObjectMapper();

        //to do a switch case of banners types
        bannerInterface = mapper.convertValue(banner, ImageBanner.class);
        return bannerInterface;
    }
}
