package com.coveros.voight.workshops.counter.listeners;


import com.google.inject.Injector;
import org.testng.*;
import org.testng.annotations.Test;
import org.testng.internal.annotations.IAnnotationFinder;
import org.testng.xml.XmlSuite;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SuiteListenerTest {
    SuiteListener listener = new SuiteListener();

    @Test
    public void testOnStart() {
        listener.onStart(new ISuite() {
            @Override
            public String getName() {
                return null;
            }

            @Override
            public Map<String, ISuiteResult> getResults() {
                return null;
            }

            @Override
            public IObjectFactory getObjectFactory() {
                return null;
            }

            @Override
            public IObjectFactory2 getObjectFactory2() {
                return null;
            }

            @Override
            public String getOutputDirectory() {
                return null;
            }

            @Override
            public String getParallel() {
                return null;
            }

            @Override
            public String getParentModule() {
                return null;
            }

            @Override
            public String getGuiceStage() {
                return null;
            }

            @Override
            public String getParameter(String s) {
                return null;
            }

            @Override
            public Map<String, Collection<ITestNGMethod>> getMethodsByGroups() {
                return null;
            }

            @Override
            public List<IInvokedMethod> getAllInvokedMethods() {
                return null;
            }

            @Override
            public Collection<ITestNGMethod> getExcludedMethods() {
                return null;
            }

            @Override
            public void run() {

            }

            @Override
            public String getHost() {
                return null;
            }

            @Override
            public SuiteRunState getSuiteState() {
                return null;
            }

            @Override
            public IAnnotationFinder getAnnotationFinder() {
                return null;
            }

            @Override
            public XmlSuite getXmlSuite() {
                return null;
            }

            @Override
            public void addListener(ITestNGListener iTestNGListener) {

            }

            @Override
            public Injector getParentInjector() {
                return null;
            }

            @Override
            public void setParentInjector(Injector injector) {

            }

            @Override
            public List<ITestNGMethod> getAllMethods() {
                return null;
            }

            @Override
            public Object getAttribute(String s) {
                return null;
            }

            @Override
            public void setAttribute(String s, Object o) {

            }

            @Override
            public Set<String> getAttributeNames() {
                return null;
            }

            @Override
            public Object removeAttribute(String s) {
                return null;
            }
        });
    }


    @Test
    public void testOnFinish() {
        listener.onFinish(new ISuite() {
            @Override
            public String getName() {
                return null;
            }

            @Override
            public Map<String, ISuiteResult> getResults() {
                return null;
            }

            @Override
            public IObjectFactory getObjectFactory() {
                return null;
            }

            @Override
            public IObjectFactory2 getObjectFactory2() {
                return null;
            }

            @Override
            public String getOutputDirectory() {
                return null;
            }

            @Override
            public String getParallel() {
                return null;
            }

            @Override
            public String getParentModule() {
                return null;
            }

            @Override
            public String getGuiceStage() {
                return null;
            }

            @Override
            public String getParameter(String s) {
                return null;
            }

            @Override
            public Map<String, Collection<ITestNGMethod>> getMethodsByGroups() {
                return null;
            }

            @Override
            public List<IInvokedMethod> getAllInvokedMethods() {
                return null;
            }

            @Override
            public Collection<ITestNGMethod> getExcludedMethods() {
                return null;
            }

            @Override
            public void run() {

            }

            @Override
            public String getHost() {
                return null;
            }

            @Override
            public SuiteRunState getSuiteState() {
                return null;
            }

            @Override
            public IAnnotationFinder getAnnotationFinder() {
                return null;
            }

            @Override
            public XmlSuite getXmlSuite() {
                return null;
            }

            @Override
            public void addListener(ITestNGListener iTestNGListener) {

            }

            @Override
            public Injector getParentInjector() {
                return null;
            }

            @Override
            public void setParentInjector(Injector injector) {

            }

            @Override
            public List<ITestNGMethod> getAllMethods() {
                return null;
            }

            @Override
            public Object getAttribute(String s) {
                return null;
            }

            @Override
            public void setAttribute(String s, Object o) {

            }

            @Override
            public Set<String> getAttributeNames() {
                return null;
            }

            @Override
            public Object removeAttribute(String s) {
                return null;
            }
        });
    }
}
