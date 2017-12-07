package com.spring.project.springproject.models;

import java.util.Map;

public interface IBannerFactory {
    public abstract IBanner getBannerInstance(Map<String, Object> banner);
}
