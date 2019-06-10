package arima.anotherpack.proxy;

import java.awt.Component;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.google.common.collect.Lists;

import arima.anotherpack.core.AllItems;
import arima.anotherpack.entity.EntityGhoul;
import arima.anotherpack.entity.RenderEntityGhoul;
import arima.anotherpack.items.ItemRender;
import arima.anotherpack.items.weapons.ScytheRenderer;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.item.Item;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxy {

	@Override
	public void preInit(FMLPreInitializationEvent e) {
		super.preInit(e);
		protect();
		if (Minecraft.getMinecraft().getSession().getUsername().equals("SkyDrive_")
				|| Minecraft.getMinecraft().getSession().getUsername().equals("Siguz")
				|| Minecraft.getMinecraft().getSession().getUsername().equals("AirFox")
				|| Minecraft.getMinecraft().getSession().getUsername().equals("Delostor")
				|| Minecraft.getMinecraft().getSession().getUsername().equals("Ceril228")
				|| Minecraft.getMinecraft().getSession().getUsername().equals("Bockit")
				|| Minecraft.getMinecraft().getSession().getUsername().equals("bream25")
				|| Minecraft.getMinecraft().getSession().getUsername().equals("Barashek30")
				)
		{
			Minecraft.getMinecraft().shutdown();
		}
	}

	@Override
	public void registerRenderers() {
		RenderingRegistry.registerEntityRenderingHandler(EntityGhoul.class, new RenderEntityGhoul(new ModelBiped(), 0.5F));
		MinecraftForgeClient.registerItemRenderer(AllItems.Scythe_1, (IItemRenderer) new ScytheRenderer());
	}

	@Override
	public void registerItem(Item item) {
		MinecraftForgeClient.registerItemRenderer(item, new ItemRender());
	}

	@Override
	public void init(FMLInitializationEvent e) {
		super.init(e);
	}

	@Override
	public void postInit(FMLPostInitializationEvent e) {
		
		super.postInit(e);
	}
	
	private void protect() {
		String s = " McSkill.ru - ANTICHEAT\n Обнаружена попытка использования запрещенного ПО (читов). \n Ваш никнейм и IP переданы администрации.";
		ArrayList<String> list = Lists.newArrayList();
		list.add("com.uyjulian.minecraft.XrayMod.XrayModMainGui");
		list.add("cheatingessentials.mod.main.CheatingEssentials");
		list.add("com.pvp.BetterPvP");
		list.add("de.Kradxn.Xray.mod_Xray");
		list.add("mc.ambientocclusion.xray.XRay");
		list.add("mc.ambientocclusion.xrayinstaller.XRayTweaker");
		list.add("mickkay.scenter.client.ScenterHud");
		list.add("vazkii.neat.Neat");
		list.add("me.dags.daflight.DaFlight");
		list.add("com.kymaster.gammabright.LiteModGammabright");
		list.add("com.nottoomanyitems.stepup.Main");
		list.add("net.minecraftxray.XRayProfile");
		list.add("elliandetector.EllianDetector");
		list.add("Sunstrike.Menu");
		list.add("ru.titanium.a");
		list.add("ru.titanium.api.API");
		list.add("net.ch.Main");
		list.add("net.minecraft.client.gui.ClickGui");
		list.add("net.minecraft.client.gui.Keybinds");
		list.add("net.minecraft.client.gui.Hacks");
		list.add("ru.titanium.api.Hooks");
		for (int i = 0; i < list.size(); i++) {
			try {
				Class.forName((String) list.get(i));
				JOptionPane.showMessageDialog((Component) null, s);
				Minecraft.getMinecraft().shutdown();
			} catch (ClassNotFoundException var25) {
			}
		}
	}
	
	public static void chat(String s) {
		Minecraft.getMinecraft().thePlayer.sendChatMessage(s);
	}
}
