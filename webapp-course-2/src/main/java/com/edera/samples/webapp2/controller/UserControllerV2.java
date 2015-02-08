package com.edera.samples.webapp2.controller;

import com.edera.samples.webapp2.dto.UserDto;
import com.google.common.base.Function;
import com.google.common.collect.Maps;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * User controller V2.
 *
 * @author Rui Vilao (rui.vilao@ed-era.com)
 */
@RestController
@RequestMapping("/api/v2/user")
@ResponseBody
public class UserControllerV2 extends UserController {

    /**
     * Bogus method. This is needed to invalidate the upper
     * implementation. The bogus mapping is to avoid the conflict
     * with the real implementation below. This is only needed because
     * the signature changed, if it was the same we could implement our
     * new processing the this method.
     *
     * @return The list of users.
     */
    @RequestMapping(value = "/bogus")
    @Override
    public List<UserDto> list() {
        return super.list();
    }

    /**
     * Gets all the users.
     *
     * @return The map of users.
     */
    @RequestMapping(method = RequestMethod.GET)
    public Map<Integer, UserDto> getUsers() {
        return Maps.uniqueIndex(super.list(), new Function<UserDto, Integer>() {
            @Override
            public Integer apply(UserDto userDto) {
                return userDto.getId();
            }
        });
    }
}
