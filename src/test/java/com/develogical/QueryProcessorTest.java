package com.develogical;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class QueryProcessorTest {

    QueryProcessor queryProcessor = new QueryProcessor();

    @Test
    public void returnsEmptyStringIfCannotProcessQuery() throws Exception {
        assertThat(queryProcessor.process("test"), is(""));
    }

    @Test
    public void knowsAboutShakespeare() throws Exception {
        assertThat(queryProcessor.process("Shakespeare"), containsString("playwright"));
    }

    @Test
    public void isNotCaseSensitive() throws Exception {
        assertThat(queryProcessor.process("shakespeare"), containsString("playwright"));
    }

    @Test
    public void knowsAboutHello() throws Exception {
        assertThat(queryProcessor.process("Hello"), containsString("app"));
    }

    @Test
    public void knowsTeamName() throws Exception {
        assertThat(queryProcessor.process("what is your name"), containsString("hello"));
    }

    @Test
    public void knowsLargest() throws Exception {
        assertThat(queryProcessor.process("Which of the following numbers is the largest: 5 6"), containsString("6"));
    }

    @Test
    public void knowsPlus() throws Exception {
        assertThat(queryProcessor.process("What is 5 plus 6"), containsString("11"));
    }

    @Test
    public void knowsMultiply() throws Exception {
        assertThat(queryProcessor.process("What is 5 multiplied by 6"), containsString("30"));
    }

}
