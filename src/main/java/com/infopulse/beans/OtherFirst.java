package com.infopulse.beans;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component(value = "otherFirst")
public class OtherFirst {

    private Second second;

    public OtherFirst(Second second){
        this.second = second;
    }
}
