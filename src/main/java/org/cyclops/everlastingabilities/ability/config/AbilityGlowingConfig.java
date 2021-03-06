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
public class AbilityGlowingConfig extends AbilityConfig {

    /**
     * The unique instance.
     */
    public static AbilityConfig _instance;

    /**
     * Make a new instance.
     */
    public AbilityGlowingConfig() {
        super(
                true,
                "glowing",
                "Entities in the area start glowing",
                new AbilityTypePotionEffectRadius("glowing", EnumRarity.UNCOMMON, 3, 50, MobEffects.GLOWING)
        );
    }
}
