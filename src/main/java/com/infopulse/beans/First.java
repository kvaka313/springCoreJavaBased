package com.infopulse.beans;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Component(value = "firstBean")
public class First {

    private Second second;

    private ExternalBean externalBean;

    public First(@Qualifier("second") Second second, @Qualifier("externalBean")ExternalBean externalBean){
        this.second = second;
        this.externalBean = externalBean;
    }
}
