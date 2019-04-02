package test.cacheloader.impl;

import static test.cacheloader.impl.CustomStoreConfiguration.AGE;
import static test.cacheloader.impl.CustomStoreConfiguration.NAME;

import org.infinispan.configuration.cache.AbstractStoreConfigurationBuilder;
import org.infinispan.configuration.cache.PersistenceConfigurationBuilder;

public class CustomStoreConfigurationBuilder extends AbstractStoreConfigurationBuilder<CustomStoreConfiguration, CustomStoreConfigurationBuilder>{

    public CustomStoreConfigurationBuilder(
          PersistenceConfigurationBuilder builder) {
        super(builder, CustomStoreConfiguration.attributeDefinitionSet());
    }

    public CustomStoreConfigurationBuilder name(String name) {
        attributes.attribute(NAME).set(name);
        return this;
    }

    public CustomStoreConfigurationBuilder age(int age) {
        attributes.attribute(AGE).set(age);
        return this;
    }

    @Override
    public CustomStoreConfiguration create() {
        return new CustomStoreConfiguration(attributes.protect(), async.create(), singletonStore.create());
    }

    @Override
    public CustomStoreConfigurationBuilder self() {
        return this;
    }
}
