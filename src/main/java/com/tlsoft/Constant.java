package com.tlsoft;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Data
public class Constant {
    @Value("${freemarker.template.path}")
    public String templatePath_;

    public static String templatePath;

    @PostConstruct
    public void Constant() {
        this.templatePath = templatePath_;
    }
}
