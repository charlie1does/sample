package com.ingenious3.sample.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ingenious3.sample.dto.IntegerResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import com.ingenious3.sample.api.IntegerService;
import com.ingenious3.sample.api.StringService;
import com.ingenious3.sample.dto.StringResponse;

/**
 * Controller handles the service responses.
 */
@Controller
@RequestMapping("/")
public final class ServiceController implements HandlerExceptionResolver {

    private final Logger LOG = LoggerFactory.getLogger(ServiceController.class);

    @Autowired
    @Qualifier("serviceInteger")
    private IntegerService integerService;

    @Autowired
    @Qualifier("serviceString")
    private StringService stringService;

    @RequestMapping(method = RequestMethod.GET, value = "/serviceInteger")
    public @ResponseBody IntegerResponse getServiceInteger(ModelMap modelMap, @RequestParam(value = "argument") Integer argument) {
        return IntegerResponse.of(integerService.function(argument), IntegerService.class);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/serviceString", produces = {MediaType.APPLICATION_JSON_UTF8_VALUE}, headers = "Accept=application/json")
    @ResponseBody public StringResponse getServiceString(@RequestParam(value = "argument") String argument) {
        return StringResponse.of(stringService.function(argument), StringService.class);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/serviceError")
    public String getServiceString(){
        throw new UnsupportedOperationException("Unsupported operation exception");
    }

    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        ModelMap modelMap = new ModelMap();
        modelMap.addAttribute("exception", e.getMessage());
        LOG.error(e.getMessage());
        return new ModelAndView("error", modelMap);
    }
}
