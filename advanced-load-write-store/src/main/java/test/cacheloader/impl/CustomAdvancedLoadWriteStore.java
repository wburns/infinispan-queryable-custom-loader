package test.cacheloader.impl; 

import java.util.concurrent.Executor;

import org.infinispan.commons.configuration.ConfiguredBy;
import org.infinispan.commons.persistence.Store;
import org.infinispan.filter.KeyFilter;
import org.infinispan.marshall.core.MarshalledEntry;
import org.infinispan.persistence.spi.AdvancedLoadWriteStore;
import org.infinispan.persistence.spi.InitializationContext;
import org.kohsuke.MetaInfServices;

@Store
@MetaInfServices
@ConfiguredBy(CustomStoreConfiguration.class)
public class CustomAdvancedLoadWriteStore<K,V> implements
        AdvancedLoadWriteStore<K, V> {

    @Override
    public boolean contains(Object arg0) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void init(InitializationContext arg0) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public MarshalledEntry<K, V> load(Object arg0) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void start() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void stop() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public boolean delete(Object arg0) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void write(MarshalledEntry<? extends K, ? extends V> arg0) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void process(
            KeyFilter<? super K> arg0,
            org.infinispan.persistence.spi.AdvancedCacheLoader.CacheLoaderTask<K, V> arg1,
            Executor arg2, boolean arg3, boolean arg4) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void purge(
            Executor arg0,
            org.infinispan.persistence.spi.AdvancedCacheWriter.PurgeListener<? super K> arg1) {
        // TODO Auto-generated method stub
        
    }

    
}
