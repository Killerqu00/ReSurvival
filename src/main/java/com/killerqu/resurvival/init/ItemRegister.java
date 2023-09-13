package com.killerqu.resurvival.init;

import com.killerqu.resurvival.main.ReSurvival;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FlintAndSteelItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;

public class ItemRegister {
    public static final Item FIRESTARTER_KIT = register("firestarter_kit", new FlintAndSteelItem(new FabricItemSettings().maxDamage(4)));
    public static Item register(String name, Item item) {
        Registry.register(Registries.ITEM, new Identifier(ReSurvival.MODID, name), item);
        return item;
    }
    public static void registerAll(Logger logger) {
        logger.info("Items registered!");
    }
}
