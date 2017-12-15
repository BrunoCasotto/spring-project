package com.spring.project.springproject.models;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spring.project.springproject.utils.BannerType;
import org.springframework.stereotype.Service;

import java.util.Map;
import static com.spring.project.springproject.utils.BannerType.IMAGE_BANNER;

@Service
public class BannerFactory implements IBannerFactory {
    private IBanner bannerInterface;

    public IBanner getBannerInstance(Map<String, Object> banner) {
        final ObjectMapper mapper = new ObjectMapper();
        final String bannerType = banner.get("type").toString();

        switch (bannerType) {
            case "image":
                bannerInterface = mapper.convertValue(banner, ImageBanner.class);
                break;

            case "list":
                bannerInterface = mapper.convertValue(banner, ListBanner.class);
                break;

            case "html":
                bannerInterface = mapper.convertValue(banner, HtmlBanner.class);
                break;
        }

        return bannerInterface;
    }
}
