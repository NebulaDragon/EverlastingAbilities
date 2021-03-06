package org.cyclops.everlastingabilities.ability.config;

import net.minecraft.init.MobEffects;
import net.minecraft.item.EnumRarity;
import org.cyclops.everlastingabilities.ability.AbilityTypePotionEffectSelf;
import org.cyclops.everlastingabilities.core.config.extendedconfig.AbilityConfig;

/**
 * Config for an ability.
 * @author rubensworks
 *
 */
public class AbilityInvisibilityConfig extends AbilityConfig {

    /**
     * The unique instance.
     */
    public static AbilityConfig _instance;

    /**
     * Make a new instance.
     */
    public AbilityInvisibilityConfig() {
        super(
                true,
                "invisibility",
                "Become invisible",
                new AbilityTypePotionEffectSelf("invisibility", EnumRarity.UNCOMMON, 1, 20, MobEffects.INVISIBILITY)
        );
    }
}
