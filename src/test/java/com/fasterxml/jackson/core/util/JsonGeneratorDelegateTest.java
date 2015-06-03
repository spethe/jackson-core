package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.*;
import junit.framework.TestCase;
import org.junit.Before;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class JsonGeneratorDelegateTest extends TestCase {
    JsonGenerator jsong;
    JsonGeneratorDelegate jsonGeneratorDelegate;
    FormatSchema foschema;
    @Before
    public void setUp(){
        jsong = mock(JsonGenerator.class);
        jsonGeneratorDelegate = new JsonGeneratorDelegate(jsong);
        foschema = mock(FormatSchema.class);
    }
    public void testGetCurrentValue() throws Exception {
        //when
        jsonGeneratorDelegate.getCurrentValue();
        //then
        verify(jsong).getCurrentValue();
    }

    public void testSetCurrentValue() throws Exception {
        jsonGeneratorDelegate.setCurrentValue(null);
        //then
        verify(jsong).setCurrentValue(null);
    }

    public void testGetCodec() throws Exception {
            jsonGeneratorDelegate.getCodec();
        //then
        verify(jsong).getCodec();
    }

    public void testSetCodec() throws Exception {
        ObjectCodec codec =  mock(ObjectCodec.class);
        jsonGeneratorDelegate.setCodec(codec);
        //then
        verify(jsong).setCodec(codec);
    }

    public void testSetSchema() throws Exception {

        jsonGeneratorDelegate.setSchema(foschema);
        //then
        verify(jsong).setSchema(foschema);
    }

    public void testGetSchema() throws Exception {

        jsonGeneratorDelegate.getSchema();
        //then
        verify(jsong).getSchema();
    }

    public void testVersion() throws Exception {
        jsonGeneratorDelegate.version();
        //then
        verify(jsong).version();
    }

    public void testCanUseSchema() throws Exception {
        jsonGeneratorDelegate.canUseSchema(foschema);
        //then
        verify(jsong).canUseSchema(foschema);
    }

    public void testEnable() throws Exception {
        JsonGenerator.Feature feat = JsonGenerator.Feature.AUTO_CLOSE_TARGET;
        jsonGeneratorDelegate.enable(feat);
        //then
        verify(jsong).enable(feat);
    }

    public void testDisable() throws Exception {
        JsonGenerator.Feature feat = JsonGenerator.Feature.AUTO_CLOSE_TARGET;
        jsonGeneratorDelegate.disable(feat);
        //then
        verify(jsong).disable(feat);
    }

    public void testIsEnabled() throws Exception {
        JsonGenerator.Feature feat = JsonGenerator.Feature.AUTO_CLOSE_TARGET;
        jsonGeneratorDelegate.isEnabled(feat);
        //then
        verify(jsong).isEnabled(feat);
    }

    public void testGetFeatureMask() throws Exception {
        jsonGeneratorDelegate.getFeatureMask();
        //then
        verify(jsong).getFeatureMask();
    }

    public void testSetFeatureMask() throws Exception {
        jsonGeneratorDelegate.setFeatureMask(1);
        //then
        verify(jsong).setFeatureMask(1);
    }

    public void testSetPrettyPrinter() throws Exception {
        PrettyPrinter pp = mock(PrettyPrinter.class);
        jsonGeneratorDelegate.setPrettyPrinter(pp);
        //then
        verify(jsong).setPrettyPrinter(pp);
    }
}