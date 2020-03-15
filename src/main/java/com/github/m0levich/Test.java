package com.github.m0levich;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileNotFoundException;

public class Test
{
    private static final Logger LOG = LoggerFactory.getLogger(Test.class);
    public static void main( String[] args ) throws FileNotFoundException {

        LOG.info("Info");
        LOG.warn("Warn");
        LOG.error("Error");
        LOG.trace("Trace");

    }
}
