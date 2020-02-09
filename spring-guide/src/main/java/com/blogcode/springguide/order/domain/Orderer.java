package com.blogcode.springguide.order.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.util.Assert;

@Getter
@NoArgsConstructor
public class Orderer {

    private Long id;

    private String name;

    private Orderer(Long id, String name) {
        Assert.notNull(name, "name must not be null");
        this.id = id;
        this.name = name;
    }

    public static Orderer memberOrderer(Long id, String name) {
        Assert.notNull(id, "id must not be null");
        return new Orderer(id, name);
    }

    public static Orderer nonMemberOrderer(String name) {
        return new Orderer(null, name);
    }
}
