package com.killerqu.resurvival.init;

import com.killerqu.resurvival.main.ReSurvival;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;

public class ItemRegister {
    public static void register(String name, Item item) {
        Registry.register(Registries.ITEM, new Identifier(ReSurvival.MODID, name), item);
    }
    public static void registerAll(Logger logger) {
        logger.info("Items registered!");
    }
}
