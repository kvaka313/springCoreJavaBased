package com.infopulse.beans;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class ExternalBean {
    private int b;

    public ExternalBean(int b){
        this.b = b;
    }
}
