package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.*;
import junit.framework.TestCase;
import org.junit.Before;

import java.io.IOException;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class JsonParserDelegateTest extends TestCase {
    JsonParser jsonp;
    JsonParserDelegate jsonParserDelegate;
    @Before
    public void setUp(){
        jsonp = mock(JsonParser.class);
        jsonParserDelegate = new JsonParserDelegate(jsonp);
    }
    public void testSetCodec(){

        ObjectCodec objCodec = mock(ObjectCodec.class);
        //when
        jsonParserDelegate.setCodec(objCodec);
        //then
        verify(jsonp).setCodec(objCodec);
    }

    public void testGetCodec(){
        //when
        jsonParserDelegate.getCodec();
        //then
        verify(jsonp).getCodec();
    }

    public void testEnable(){
        JsonParser.Feature feat = JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER;
        //when
        jsonParserDelegate.enable(feat);
        //then
        verify(jsonp).enable(feat);
    }

    public void testDisable(){
        JsonParser.Feature feat = JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER;
        //when
        jsonParserDelegate.disable(feat);
        //then
        verify(jsonp).disable(feat);
    }

    public void checkEnable(){
        JsonParser.Feature feat = JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER;
        //when
        jsonParserDelegate.isEnabled(feat);
        //then
        verify(jsonp).isEnabled(feat);
    }

    public void testGetFeatureMask(){
        //when
        jsonParserDelegate.getFeatureMask();
        //then
        verify(jsonp).getFeatureMask();
    }

    public void testSetFeatureMask(){
        //when-
        //then
        assertEquals(jsonParserDelegate,jsonParserDelegate.setFeatureMask(1));
        verify(jsonp).setFeatureMask(1);
    }

    public void testGetSchema(){
        //when-then
        jsonParserDelegate.getSchema();
        verify(jsonp).getSchema();
    }

    public void testVersion(){
        //when-then
        jsonParserDelegate.version();
        verify(jsonp).version();
    }

    public void testInputSource(){
        //when-then
        jsonParserDelegate.getInputSource();
        verify(jsonp).getInputSource();
    }

    public void testSetSchema(){
        FormatSchema format = mock(FormatSchema.class);
        //when-then
        jsonParserDelegate.setSchema(format);
        verify(jsonp).setSchema(format);
    }
    public void testUseSchema(){
        FormatSchema format = mock(FormatSchema.class);
        //when-then
        jsonParserDelegate.canUseSchema(format);
        verify(jsonp).canUseSchema(format);
    }
    public void testCustomCodec(){
        jsonParserDelegate.requiresCustomCodec();
        //then
        verify(jsonp).requiresCustomCodec();
    }
    public void testClose() throws IOException {
        jsonParserDelegate.close();
        //then
        verify(jsonp).close();
    }
    public void testIsClosed(){
        jsonParserDelegate.isClosed();
        //then
        verify(jsonp).isClosed();
    }
    public void testGetCurrentToken(){
        jsonParserDelegate.getCurrentToken();
        //then
        verify(jsonp).getCurrentToken();
    }
    public void testGetCurrentTokenId(){
        jsonParserDelegate.getCurrentTokenId();
        //then
        verify(jsonp).getCurrentTokenId();
    }
    public void testHasCurrentToken(){
        jsonParserDelegate.hasCurrentToken();
        //then
        verify(jsonp).hasCurrentToken();
    }
    public void testHasTokenId(){
        jsonParserDelegate.hasTokenId(1);
        //then
        verify(jsonp).hasTokenId(1);
    }
    public void testHasToken(){

        jsonParserDelegate.hasToken(JsonToken.FIELD_NAME);
        //then
        verify(jsonp).hasToken(JsonToken.FIELD_NAME);
    }
    public void testGetCurrentLocation(){
        jsonParserDelegate.getCurrentLocation();
        //then
        verify(jsonp).getCurrentLocation();
    }
    public void testGetParsingContext(){
        jsonParserDelegate.getParsingContext();
        //then
        verify(jsonp).getParsingContext();
    }

    public void testStartArrayToken(){
        jsonParserDelegate.isExpectedStartArrayToken();
        //then
        verify(jsonp).isExpectedStartArrayToken();
    }

    public void testExpectedStartObject(){
        jsonParserDelegate.isExpectedStartObjectToken();
        //then
        verify(jsonp).isExpectedStartObjectToken();
    }


}