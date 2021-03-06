package org.cyclops.everlastingabilities.ability.config;

import net.minecraft.init.MobEffects;
import net.minecraft.item.EnumRarity;
import org.cyclops.everlastingabilities.ability.AbilityTypePotionEffectRadius;
import org.cyclops.everlastingabilities.ability.AbilityTypePotionEffectSelf;
import org.cyclops.everlastingabilities.core.config.extendedconfig.AbilityConfig;

/**
 * Config for an ability.
 * @author rubensworks
 *
 */
public class AbilityUnluckConfig extends AbilityConfig {

    /**
     * The unique instance.
     */
    public static AbilityConfig _instance;

    /**
     * Make a new instance.
     */
    public AbilityUnluckConfig() {
        super(
                true,
                "unluck",
                "Entities in the area have a lower chance on good loot",
                new AbilityTypePotionEffectRadius("unluck", EnumRarity.RARE, 3, 50, MobEffects.UNLUCK)
        );
    }
}
