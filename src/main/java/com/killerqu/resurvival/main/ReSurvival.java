package com.killerqu.resurvival.main;

import com.killerqu.resurvival.init.ItemRegister;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReSurvival implements ModInitializer {
    public static String MODID = "resurvival";
    public static Logger LOGGER = LoggerFactory.getLogger(MODID);

    @Override
    public void onInitialize() {
        ItemRegister.registerAll(LOGGER);
    }
}
