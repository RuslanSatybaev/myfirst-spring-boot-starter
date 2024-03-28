package com.freedom.service;

import com.freedom.config.StarterProperties;

import java.time.LocalDate;

public class CopyrightGenService {

    private final StarterProperties props;

    public CopyrightGenService(StarterProperties props) {
        this.props = props;
    }

    public String generateCopyright() {
        return String.format("(c) %s, %s", LocalDate.now().getYear(), props.getAuthor());
    }
}
