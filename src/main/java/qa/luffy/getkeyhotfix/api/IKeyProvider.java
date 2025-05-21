package qa.luffy.getkeyhotfix.api;

import net.minecraft.resources.ResourceKey;

/**
 * Marker interface to unify getKey() on both Architectury and NeoForge holders.
 */
public interface IKeyProvider<T> {
    ResourceKey<T> getKey();
}