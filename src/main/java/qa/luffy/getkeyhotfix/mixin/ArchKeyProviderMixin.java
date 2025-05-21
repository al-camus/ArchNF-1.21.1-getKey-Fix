package qa.luffy.getkeyhotfix.mixin;

import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Implements;
import org.spongepowered.asm.mixin.Interface;

import dev.architectury.impl.RegistrySupplierImpl;
import dev.architectury.registry.registries.DeferredSupplier;
import net.minecraft.resources.ResourceKey;
import qa.luffy.getkeyhotfix.api.IKeyProvider;

@Pseudo
@Mixin(RegistrySupplierImpl.class)
@Implements(@Interface(
        iface = IKeyProvider.class,
        prefix = "kp$"
))
public abstract class ArchKeyProviderMixin<T> implements DeferredSupplier<T> {
    public ResourceKey<T> kp$getKey() {
        return DeferredSupplier.super.getKey();
    }
}
