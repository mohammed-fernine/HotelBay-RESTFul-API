package com.hotelbay;

import org.springframework.stereotype.Component;
import org.springframework.test.web.servlet.ResultActions;

@Component
public class SharedData {
    // This variable is now shared across your entire testing project!
    public ResultActions action;
}