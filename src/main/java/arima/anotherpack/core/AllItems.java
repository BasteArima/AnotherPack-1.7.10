package arima.anotherpack.core;

import arima.anotherpack.items.EnderBag;
import arima.anotherpack.items.Items;
import arima.anotherpack.items.ProchnItem;
import arima.anotherpack.items.weapons.Scythes;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

public class AllItems {

	public static Item Bat;
	public static Item Hand;
	public static Item Akvamarin;
	public static Item Amethyst;
	public static Item Granat;
	public static Item Malahit;
	public static Item Tanzanit;
	public static Item Topaz;
	public static Item Map;
	public static Item Book1;
	public static Item Book2;
	public static Item Book3;
	public static Item Book4;
	public static Item Circuit1;
	public static Item Circuit2;
	public static Item Circuit3;
	public static Item Demonic_ruby;
	public static Item Dark_mox;
	public static Item Dark_spirit;
	public static Item Materia;
	public static Item Sun_materia;
	public static Item Vis_materia;
	public static Item Fire_materia;
	public static Item Live_materia;
	public static Item Sky_materia;
	public static Item Dark_materia;
	public static Item Outline;
	public static Item Realm_quantum;
	public static Item Cpu1;
	public static Item Cpu2;
	public static Item Dark_eye;
	public static Item Demonic_eye;
	public static Item Ender_eye;
	public static Item Mana_crystal1;
	public static Item Mana_crystal2;
	public static Item Ring;
	public static Item Quant_core;
	public static Item Ender_box, EnderBag;
	public static Item Loot_box_1;
	public static Item Loot_box_2;
	public static Item Loot_box_3;
	public static Item Loot_box_4;
	public static Item Flux_ingot;
	public static Item Iridium_ingot;
	public static Item Quant_most;
	public static Item Nitroglicerin;
	public static Item Sostav;
	public static Item Powder1;
	public static Item Powder2;
	public static Item Powder3;
	public static Item Powder4;
	public static Item Powder5;
	public static Item Powder6;
	public static Item Powder7;
	public static Item Powder8;
	public static Item Powder9;
	public static Item Powder10;
	public static Item Powder11;
	public static Item Powder12;
	public static Item Powder13;
	public static Item Powder14;
	public static Item Vis_dust;
	public static Item Fire_dust;
	public static Item Sky_dust;
	public static Item Live_dust;
	public static Item Dark_dust;
	public static Item amuletbox, mechbox, runebox, swordbox;
	public static Item FotosolQuater, StandFotoelement, TaumCellEmpty, AdvFotoelement, CarbonBase, CarbonPlate,
			FotoGlass, RedstonePlate, IridiumCable;
	public static Item promElement2, promElement3, promElement4, promElement5, promElement6, promElement7, promElement8,
			quantReactor, itemPartSilver, itemPartElectrumFlux, itemPartEnderium, itemPartElectrumFlux2,
			itemPartEnderium2, itemPartIridium2, itemPartIridium3;
	public static Item itemOnealtPanel, itemQuantaltPlate, itemSubatomCollector, itemUltraPlate, ruchka, lezvie,
			stameska, pila, nojovka_po_metalu, PrivateInfo, PrivateWand;
	public static Item Scythe_1, bullet_shell, bullet;
	public static final ToolMaterial ScytheMat = EnumHelper.addToolMaterial("Scythe", 3, 500, 3.0F, 50.0F, 14);

	public static void registerItems() {

		EnderBag = new EnderBag("EnderBag", "arima:enderBag", 1);
		amuletbox = new Items("amuletbox", "arima:lootbox/amuletbox", 1);
		mechbox = new Items("mechbox", "arima:lootbox/mechbox", 1);
		runebox = new Items("runebox", "arima:lootbox/runebox", 1);
		swordbox = new Items("swordbox", "arima:lootbox/swordbox", 1);
		Bat = new Items("Bat", "arima:bat", 64);
		Hand = new Items("Hand", "arima:hand", 64);
		Granat = new Items("Granat", "arima:granat", 64);
		Tanzanit = new Items("Tanzanit", "arima:tanzanit", 64);
		Topaz = new Items("Topaz", "arima:topaz", 64);
		Malahit = new Items("Malahit", "arima:malahit", 64);
		Akvamarin = new Items("Akvamarin", "arima:akvamarin", 64);
		Amethyst = new Items("Amethyst", "arima:amethyst", 64);
		Map = new Items("Map", "arima:map", 64);
		Book1 = new Items("Book1", "arima:book1", 64);
		Book2 = new Items("Book2", "arima:book2", 64);
		Book3 = new Items("Book3", "arima:book3", 64);
		Book4 = new Items("Book4", "arima:book4", 64);
		Circuit1 = new Items("Circuit1", "arima:circuit1", 64);
		Circuit2 = new Items("Circuit2", "arima:circuit2", 64);
		Circuit3 = new Items("Circuit3", "arima:circuit3", 64);
		Demonic_ruby = new Items("Demonic_ruby", "arima:demonic_ruby", 64);
		Dark_mox = new Items("Dark_mox", "arima:dark_mox", 64);
		Dark_spirit = new Items("Dark_spirit", "arima:dark_spirit", 64);
		Materia = new Items("Materia", "arima:materia", 64);
		Sun_materia = new Items("Sun_materia", "arima:sun_materia", 64);
		Vis_materia = new Items("Vis_materia", "arima:vis_materia", 64);
		Fire_materia = new Items("Fire_materia", "arima:fire_materia", 64);
		Live_materia = new Items("Live_materia", "arima:live_materia", 64);
		Sky_materia = new Items("Sky_materia", "arima:sky_materia", 64);
		Dark_materia = new Items("Dark_materia", "arima:dark_materia", 64);
		Outline = new Items("Outline", "arima:outline", 64);
		Realm_quantum = new Items("Realm_quantum", "arima:realm_quantum", 64);
		Cpu1 = new Items("Cpu1", "arima:cpu1", 64);
		Cpu2 = new Items("Cpu2", "arima:cpu2", 64);
		Dark_eye = new Items("Dark_eye", "arima:dark_eye", 64);
		Demonic_eye = new Items("Demonic_eye", "arima:demonic_eye", 64);
		Ender_eye = new Items("Ender_eye", "arima:ender_eye", 64);
		Mana_crystal1 = new Items("Mana_crystal1", "arima:mana_crystal1", 64);
		Mana_crystal2 = new Items("Mana_crystal2", "arima:mana_crystal2", 64);
		Ring = new Items("Ring", "arima:ring", 64);
		Ender_box = new Items("Ender_box", "arima:ender_box", 64);
		Quant_core = new Items("Quant_core", "arima:quant_core", 64);
		Loot_box_1 = new Items("Loot_box_1", "arima:loot_box_1", 64);
		Loot_box_2 = new Items("Loot_box_2", "arima:loot_box_2", 64);
		Loot_box_3 = new Items("Loot_box_3", "arima:loot_box_3", 64);
		Loot_box_4 = new Items("Loot_box_4", "arima:loot_box_4", 64);
		Flux_ingot = new Items("Flux_ingot", "arima:flux_ingot", 64);
		Iridium_ingot = new Items("Iridium_ingot", "arima:iridium_ingot", 64);
		Quant_most = new Items("Quant_most", "arima:quant_most", 64);
		Nitroglicerin = new Items("Nitroglicerin", "arima:nitroglicerin", 64);
		Sostav = new Items("Sostav", "arima:sostav", 64);
		Powder1 = new Items("Powder1", "arima:powder1", 64);
		Powder2 = new Items("Powder2", "arima:powder2", 64);
		Powder3 = new Items("Powder3", "arima:powder3", 64);
		Powder4 = new Items("Powder4", "arima:powder4", 64);
		Powder5 = new Items("Powder5", "arima:powder5", 64);
		Powder6 = new Items("Powder6", "arima:powder6", 64);
		Powder7 = new Items("Powder7", "arima:powder7", 64);
		Powder8 = new Items("Powder8", "arima:powder8", 64);
		Powder9 = new Items("Powder9", "arima:powder9", 64);
		Powder10 = new Items("Powder10", "arima:powder10", 64);
		Powder11 = new Items("Powder11", "arima:powder11", 64);
		Powder12 = new Items("Powder12", "arima:powder12", 64);
		Powder13 = new Items("Powder13", "arima:powder13", 64);
		Powder14 = new Items("Powder14", "arima:powder14", 64);
		Vis_dust = new Items("Vis_dust", "arima:dust_blaze_1", 64);
		Fire_dust = new Items("Fire_dust", "arima:dust_blaze_2", 64);
		Sky_dust = new Items("Sky_dust", "arima:dust_blaze_3", 64);
		Live_dust = new Items("Live_dust", "arima:dust_blaze_4", 64);
		Dark_dust = new Items("Dark_dust", "arima:dust_blaze_5", 64);
		FotosolQuater = new Items("FotosolQuater", "arima:itemFotosolQuater", 64);
		AdvFotoelement = new Items("AdvFotoelement", "arima:itemAdvFotoelement", 64);
		CarbonBase = new Items("CarbonBase", "arima:itemCarbonBase", 64);
		CarbonPlate = new Items("CarbonPlate", "arima:itemCarbonPlate", 64);
		FotoGlass = new Items("FotoGlass", "arima:itemFotoGlass", 64);
		RedstonePlate = new Items("RedstonePlate", "arima:itemRedstonePlate", 64);
		IridiumCable = new Items("IridiumCable", "arima:itemIridiumCable", 64);
		itemOnealtPanel = new Items("itemOnealtPanel", "arima:n6/itemOnealtPanel", 64);
		itemQuantaltPlate = new Items("itemQuantaltPlate", "arima:n6/itemQuantaltPlate", 64);
		itemSubatomCollector = new Items("itemSubatomCollector", "arima:n6/itemSubatomCollector", 64);
		itemUltraPlate = new Items("itemUltraPlate", "arima:n6/itemUltraPlate", 64);
		promElement2 = new Items("promElement2", "arima:photoElements/promElement2", 64);
		promElement3 = new Items("promElement3", "arima:photoElements/promElement3", 64);
		promElement4 = new Items("promElement4", "arima:photoElements/promElement4", 64);
		promElement5 = new Items("promElement5", "arima:photoElements/promElement5", 64);
		promElement6 = new Items("promElement6", "arima:photoElements/promElement6", 64);
		promElement7 = new Items("promElement7", "arima:photoElements/promElement7", 64);
		promElement8 = new Items("promElement8", "arima:photoElements/promElement8", 64);
		quantReactor = new Items("quantReactor", "arima:photoElements/quantReactor", 64);
		itemPartSilver = new Items("itemPartSilver", "arima:itemPartSilver", 64);
		itemPartEnderium = new Items("itemPartEnderium", "arima:itemPartEnderium", 64);
		itemPartElectrumFlux = new Items("itemPartElectrumFlux", "arima:itemPartElectrumFlux", 64);
		itemPartEnderium2 = new Items("itemPartEnderium2", "arima:itemPartEnderium2", 64);
		itemPartElectrumFlux2 = new Items("itemPartElectrumFlux2", "arima:itemPartElectrumFlux2", 64);
		itemPartIridium2 = new Items("itemPartIridium2", "arima:itemPartIridium2", 64);
		itemPartIridium3 = new Items("itemPartIridium3", "arima:itemPartIridium3", 64);
		ruchka = new Items("ruchka", "arima:n6/ruchka", 64);
		lezvie = new Items("lezvie", "arima:n6/lezvie", 64);
		stameska = new ProchnItem("stameska", "arima:n6/stameska");
		nojovka_po_metalu = new ProchnItem("nojovka_po_metalu", "arima:n6/nojovka_po_metalu");
		pila = new ProchnItem("pila", "arima:n6/pila");
		TaumCellEmpty = new Items("TaumCellEmpty", "arima:itemTaumCellEmpty", 64);
		StandFotoelement = new Items("StandFotoelement", "arima:itemStandFotoelement", 64);
		PrivateInfo = new Items("PrivateInfo", "arima:PrivateInfo", 1).setCreativeTab(CreativeTabs.tabTools);
		PrivateWand = new Items("PrivateWand", "arima:PrivateWand", 1).setCreativeTab(CreativeTabs.tabTools);
		Scythe_1 = new Scythes(ScytheMat, "arima:weapons/Scythes/scythe_1", "Scythe_1");
		bullet_shell = new Items("bullet_shell", "arima:weapons/Scythes/bullet_shell", 64).setCreativeTab(CreativeTabs.tabCombat);
		bullet = new Items("bullet", "arima:weapons/Scythes/item.bullet", 64).setCreativeTab(CreativeTabs.tabCombat);
	}

}
