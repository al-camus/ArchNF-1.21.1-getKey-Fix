package qa.luffy.getkeyhotfix.mixin;

import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Implements;
import org.spongepowered.asm.mixin.Interface;
import org.spongepowered.asm.mixin.Intrinsic;

import net.neoforged.neoforge.common.extensions.IHolderExtension;
import net.minecraft.resources.ResourceKey;
import qa.luffy.getkeyhotfix.api.IKeyProvider;

@Pseudo
@Mixin(value = IHolderExtension.class, remap = false)
@Implements(@Interface(
        iface = IKeyProvider.class,
        prefix = "kp$"
))
public interface HolderKeyProviderMixin<T> extends IHolderExtension<T> {
    @Intrinsic
    default ResourceKey<T> kp$getKey() {
        return IHolderExtension.super.getKey();
    }
}
