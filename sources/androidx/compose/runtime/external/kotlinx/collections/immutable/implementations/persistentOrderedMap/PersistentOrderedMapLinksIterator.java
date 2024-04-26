package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u0003B)\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\b¢\u0006\u0002\u0010\tJ\t\u0010\u0014\u001a\u00020\u0015H\u0002J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0002R \u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\bX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapLinksIterator;", "K", "V", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/LinkedValue;", "nextKey", "", "hashMap", "", "(Ljava/lang/Object;Ljava/util/Map;)V", "index", "", "getIndex$runtime_release", "()I", "setIndex$runtime_release", "(I)V", "getNextKey$runtime_release", "()Ljava/lang/Object;", "setNextKey$runtime_release", "(Ljava/lang/Object;)V", "hasNext", "", "next", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: PersistentOrderedMapContentIterators.kt */
public class PersistentOrderedMapLinksIterator<K, V> implements Iterator<LinkedValue<V>>, KMappedMarker {
    private final Map<K, LinkedValue<V>> hashMap;
    private int index;
    private Object nextKey;

    public final int getIndex$runtime_release() {
        return this.index;
    }

    public final Object getNextKey$runtime_release() {
        return this.nextKey;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setIndex$runtime_release(int i) {
        this.index = i;
    }

    public final void setNextKey$runtime_release(Object obj) {
        this.nextKey = obj;
    }

    public PersistentOrderedMapLinksIterator(Object obj, Map<K, LinkedValue<V>> map) {
        Intrinsics.checkNotNullParameter(map, "hashMap");
        this.nextKey = obj;
        this.hashMap = map;
    }

    public boolean hasNext() {
        return this.index < this.hashMap.size();
    }

    public LinkedValue<V> next() {
        if (hasNext()) {
            LinkedValue<V> linkedValue = this.hashMap.get(this.nextKey);
            if (linkedValue != null) {
                LinkedValue<V> linkedValue2 = linkedValue;
                this.index++;
                this.nextKey = linkedValue2.getNext();
                return linkedValue2;
            }
            throw new ConcurrentModificationException("Hash code of a key (" + this.nextKey + ") has changed after it was added to the persistent map.");
        }
        throw new NoSuchElementException();
    }
}
