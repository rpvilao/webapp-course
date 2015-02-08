package com.edera.samples.webapp1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * User controller.
 *
 * @author Rui Vilao (rui.vilao@ed-era.com)
 */
@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    /**
     * Lists all the users.
     *
     * @return A string representation of the users.
     */
    @RequestMapping(method = RequestMethod.GET)
    public String list() {
        return "john, doe";
    }
}
