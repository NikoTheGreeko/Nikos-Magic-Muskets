package net.niko.magicmuskets;

import net.fabricmc.api.ModInitializer;

import net.niko.magicmuskets.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MagicMuskets implements ModInitializer {
	public static final String MOD_ID ="magicmuskets";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		LOGGER.info("Hello Fabric world!");
	}
}