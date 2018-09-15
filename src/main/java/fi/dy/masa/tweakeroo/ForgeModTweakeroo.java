package fi.dy.masa.tweakeroo;

import fi.dy.masa.tweakeroo.config.Configs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(
				modid = Reference.MOD_ID,
				name = Reference.MOD_NAME,
				version = Reference.MOD_VERSION,
				clientSideOnly = true
)
public class ForgeModTweakeroo {
	public static final Logger LOGGER = LogManager.getLogger(Reference.MOD_ID);
	
	@Mod.EventHandler
	public static void preinit(FMLPreInitializationEvent e) {
		//TODO Config stuffs
		Configs.loadFromFile();
		
		
	}
}
