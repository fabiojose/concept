package com.github.fabiojose.concept.bean;

import java.io.Serializable;

import com.github.fabiojose.concept.Visitable;

/**
 * Concept Bean
 * @author fabiojose (fabiojose@gmail.com)
 *
 * @param <T>
 */
public interface ConceptBean<T> extends Serializable, Comparable<T>, Visitable<T>, Cloneable {

}
