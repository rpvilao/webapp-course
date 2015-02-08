package com.edera.samples.webapp2.controller;

import com.edera.samples.webapp2.dto.UserDto;
import com.google.common.base.Predicate;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * User controller.
 *
 * @author Rui Vilao (rui.vilao@ed-era.com)
 */
@RestController
@RequestMapping("/api/v1/user")
@ResponseBody
public class UserController {

    /**
     * Lists all the users.
     *
     * @return The list of users.
     */
    @RequestMapping(method = RequestMethod.GET)
    public List<UserDto> list() {
        return ImmutableList.of(
                UserDto.builder().withId(1).withName("john").withGender("male").withAge(26).build(),
                UserDto.builder().withId(2).withName("jenny").withGender("female").withAge(18).build()
        );
    }

    /**
     * Gets a specific user given the ID.
     *
     * @param id The id of the user.
     * @return The user.
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public UserDto get(final @PathVariable("id") int id) {
        return FluentIterable
                .from(list())
                .firstMatch(new Predicate<UserDto>() {
                    @Override
                    public boolean apply(UserDto userDto) {
                        return userDto.getId().equals(id);
                    }
                }).orNull();
    }
}
