package arima.anotherpack.core;

import arima.anotherpack.entity.EntityGhoul;
import arima.anotherpack.proxy.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.item.Item;

@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.VERSION)

public class Main {

	@Instance("AnotherPack2")
	public static Main instance;

	@SidedProxy(clientSide = "arima.anotherpack.proxy.ClientProxy", serverSide = "arima.anotherpack.proxy.CommonProxy")
	public static CommonProxy proxy;

	public static final String MODID = "AnotherPack2";
	public static final String VERSION = "1.511.22";
	public static final String MODNAME = "Arima - AnotherPack 2";

	public static final CreativeTabs tabAP2WoodBlocks = new CreativeTabs("tabAP2WoodBlocks") {
		public Item getTabIconItem() {
			return Item.getItemFromBlock(AllBlocks.Wood);
		}
	};
	public static final CreativeTabs tabAP2StoneBlocks = new CreativeTabs("tabAP2StoneBlocks") {
		public Item getTabIconItem() {
			return Item.getItemFromBlock(AllBlocks.Stone);
		}
	};
	public static final CreativeTabs tabAP2DesignBlocks = new CreativeTabs("tabAP2DesignBlocks") {
		public Item getTabIconItem() {
			return Item.getItemFromBlock(AllBlocks.BlocksGlass2);
		}
	};
	public static final CreativeTabs tabAPIronBlocks = new CreativeTabs("tabAPIronBlocks") {
		public Item getTabIconItem() {
			return Item.getItemFromBlock(AllBlocks.Iron);
		}
	};
	public static final CreativeTabs tabAP2Items = new CreativeTabs("tabAP2Items") {
		public Item getTabIconItem() {
			return AllItems.Book4;
		}
	};

	public static final CreativeTabs tabAP2Lamps = new CreativeTabs("tabAP2Lamps") {
		public Item getTabIconItem() {
			return Item.getItemFromBlock(AllBlocks.Lamp);
		}
	};

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.preInit(event);
    }

	@EventHandler
	public void preLoad(FMLPreInitializationEvent event) {
		log("=== \u0417\u0430\u0433\u0440\u0443\u0437\u043a\u0430 AnotherPack ===");
		AllBlocks.registerBlocks();
		log("=== \u0411\u043b\u043e\u043a\u0438 загружены ===");
		AllItems.registerItems();
		log("=== \u041f\u0440\u0435\u0434\u043c\u0435\u0442\u044b \u0437\u0430\u0433\u0440\u0443\u0436\u0435\u043d\u044b ===");
		proxy.init(null);
		proxy.registerRenderers();
		registerEntity(EntityGhoul.class, "Ghoul", 0x00FFFF, 0x00008B);
		EntityRegistry.addSpawn(EntityGhoul.class, 100, 4, 4, EnumCreatureType.monster);
		log("=== AnotherPack \u0437\u0430\u0433\u0440\u0443\u0436\u0435\u043d ===");
	}

	@EventHandler
	public static void registerEntity(Class entityClass, String name, int primaryColor, int secondaryColor) {
		int entityID = EntityRegistry.findGlobalUniqueEntityId();
		long seed = name.hashCode();

		EntityRegistry.registerGlobalEntityID(entityClass, name, entityID);
		EntityRegistry.registerModEntity(entityClass, name, entityID, instance, 64, 1, true);
		EntityList.entityEggs.put(Integer.valueOf(entityID),
				new EntityList.EntityEggInfo(entityID, primaryColor, secondaryColor));
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
	}
	public void log(Object arg0) {
		System.out.println("AnotherPack: " + arg0);
	}
}
