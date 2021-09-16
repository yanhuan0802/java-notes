package com.yanhuan.modernjavainaction.cap09.process;

/**
 *
 * @author : yan
 * -----------------------------------------------------
 */
public class HeaderTextProcessing extends ProcessingObject<String> {

    @Override
    protected String handleWork(String text) {
        return "From Raoul, Mario and Alan: " + text;
    }
}
