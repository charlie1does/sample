package com.ingenious3.sample.controller;

import com.ingenious3.sample.api.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Controller handling the service.
 *
 * User: Charlie
 * Date: 16. 1. 2015
 */
@Controller
@RequestMapping("/")
public final class ServiceController implements HandlerExceptionResolver {

    private final Logger LOG = LoggerFactory.getLogger(ServiceController.class);

    @Autowired
    @Qualifier("serviceInteger")
    private Service serviceInteger;

    @Autowired
    @Qualifier("serviceString")
    private Service serviceString;

    @RequestMapping(method = RequestMethod.GET, value = "/serviceInteger")
    public String getServiceInteger(ModelMap modelMap, HttpServletRequest request, @RequestParam(value = "argument") Integer argument){
        LOG.info("serviceInteger service started!");
        modelMap.addAttribute("value", serviceInteger.function(argument));
        modelMap.addAttribute("service", "integer");
        return "service";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/serviceString")
    public String getServiceString(ModelMap modelMap, HttpServletRequest request, @RequestParam(value = "argument") String argument){
        LOG.info("serviceInteger service started!");
        modelMap.addAttribute("value", serviceString.function(argument));
        modelMap.addAttribute("service", "string");
        return "service";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/serviceError")
    public String getServiceString(ModelMap modelMap, HttpServletRequest request){
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
