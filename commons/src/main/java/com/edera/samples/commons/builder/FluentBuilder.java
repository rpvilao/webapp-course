package com.edera.samples.commons.builder;

/**
 * Interface to build objects in a
 * fluent fashion.
 *
 * @param <T> The type of object being built.
 * @author Rui Vilao (rui.vilao@ed-era.com)
 */
public interface FluentBuilder<T> {
    /**
     * Builds the object.
     *
     * @return The object.
     */
    T build();
}
