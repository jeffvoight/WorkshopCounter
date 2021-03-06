package com.coveros.voight.workshops.counter.listeners;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.log4testng.Logger;

public class SuiteListener implements ISuiteListener {
    Logger log = Logger.getLogger(SuiteListener.class);


    /**
     * This method is invoked before the SuiteRunner starts.
     *
     * @param suite
     */
    @Override
    public void onStart(ISuite suite) {
        log.info(suite.getName() + " starting.");
    }

    /**
     * This method is invoked after the SuiteRunner has run all
     * the test suites.
     *
     * @param suite
     */
    @Override
    public void onFinish(ISuite suite) {
        log.info(suite.getName() + " finished.");
    }
}
