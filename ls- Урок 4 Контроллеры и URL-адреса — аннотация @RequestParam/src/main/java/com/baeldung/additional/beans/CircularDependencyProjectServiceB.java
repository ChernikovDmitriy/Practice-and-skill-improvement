package com.baeldung.additional.beans;

import org.springframework.stereotype.Service;

@Service
public class CircularDependencyProjectServiceB {

    private CircularDependencyProjectServiceA projectServiceA;

    public CircularDependencyProjectServiceB(CircularDependencyProjectServiceA projectServiceA) {
        this.projectServiceA = projectServiceA;
    }
}
