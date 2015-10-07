package com.spinn3r.jsoup_regression;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Assert;

/**
 *
 */
public class TestRegressions {

    @org.junit.Test
    public void test1() throws Exception {

        String html = "<p>this is <b>mixed</b> content and here <i>is</i> more.</p>";
        Document document = Jsoup.parse( html );

        Assert.assertEquals( html, document.body().html() );

    }

}
