package test.cacheloader.impl;

import org.infinispan.commons.configuration.BuiltBy;
import org.infinispan.commons.configuration.ConfigurationFor;
import org.infinispan.commons.configuration.attributes.Attribute;
import org.infinispan.commons.configuration.attributes.AttributeDefinition;
import org.infinispan.commons.configuration.attributes.AttributeSet;
import org.infinispan.commons.persistence.Store;
import org.infinispan.configuration.cache.AbstractStoreConfiguration;
import org.infinispan.configuration.cache.AsyncStoreConfiguration;
import org.infinispan.configuration.cache.SingletonStoreConfiguration;

@BuiltBy(CustomStoreConfigurationBuilder.class)
@ConfigurationFor(CustomCacheLoader.class)
public class CustomStoreConfiguration extends AbstractStoreConfiguration {

    static final AttributeDefinition<String> NAME = AttributeDefinition.builder("name", null, String.class).immutable().build();
    static final AttributeDefinition<Integer> AGE = AttributeDefinition.builder("age", 0, Integer.class).immutable().build();

    private final Attribute<String> name;
    private final Attribute<Integer> age;

    public static AttributeSet attributeDefinitionSet() {
        return new AttributeSet(CustomStoreConfiguration.class, AbstractStoreConfiguration.attributeDefinitionSet(), NAME, AGE);
    }

    public CustomStoreConfiguration(AttributeSet attributes, AsyncStoreConfiguration async, SingletonStoreConfiguration singletonStore) {
        super(attributes, async, singletonStore);
        name = attributes.attribute(NAME);
        age = attributes.attribute(AGE);
    }

    public String name() {
        return name.get();
    }

    public Integer age() {
        return age.get();
    }
}
