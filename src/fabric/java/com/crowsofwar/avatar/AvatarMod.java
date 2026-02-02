package com.crowsofwar.avatar;

import com.crowsofwar.avatar.entity.ModEntities;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AvatarMod implements ModInitializer {
	public static final String MOD_ID = "avatarmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModEntities.register();
		LOGGER.info("Avatar Mod Fabric (assets + entities/mobs) initialized");
	}
}
