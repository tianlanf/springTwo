package com.thoughtworks.yafei;

import org.junit.Test;

import static com.thoughtworks.yafei.SweetLover.POSITIVE_RESPONSE;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SweetLoverTest {
    @Test
    public void shouldReturnPositiveResponseGivenPeach() throws Exception {
        SweetLover someOne = new SweetLover();
        someOne.setFruit(new Peach());
        assertThat(someOne.eat(), is(POSITIVE_RESPONSE));
    }
}
