package com.baeldung.additional.beans;

import org.springframework.stereotype.Service;

@Service
public class CircularDependencyProjectServiceA {

    private CircularDependencyProjectServiceB projectServiceB;

    public CircularDependencyProjectServiceA(CircularDependencyProjectServiceB projectServiceB) {
        this.projectServiceB = projectServiceB;
    }
}
