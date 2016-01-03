package me.merinthium.com;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.FurnaceRecipe;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
public class Recipe extends JavaPlugin implements Listener 
{	
@SuppressWarnings("unused")
private static Plugin plugin;
 
	@SuppressWarnings("deprecation")
	public void onEnable()
	{
		 getServer().getPluginManager().registerEvents(this, this); 
		 registerConfig();
			//Crafting & Smelting
			//saddle
		if(this.getConfig().getBoolean("Recipes.Saddle"))
		{
			ShapedRecipe saddle = new ShapedRecipe(new ItemStack(Material.SADDLE));
			saddle.shape("L L","LLL","LIL").setIngredient('L', Material.LEATHER).setIngredient('I', Material.IRON_INGOT);
			getServer().addRecipe(saddle);
		}
		
		if(this.getConfig().getBoolean("Recipes.Horse_armor.All"))
		{
			if(this.getConfig().getBoolean("Recipes.Horse_armor.Iron_horse_armor"))
			{
				//IronHorseArmor
				ShapedRecipe IHA = new ShapedRecipe(new ItemStack(Material.IRON_BARDING));
				IHA.shape("WWI","ISI","IWI").setIngredient('I', Material.IRON_INGOT).setIngredient('S', Material.SADDLE).setIngredient('W',Material.WOOL, 15 );
				getServer().addRecipe(IHA);
			}
			//GoldHorseArmor
			if(this.getConfig().getBoolean("Recipes.Horse_armor.Gold_horse_armor"))
			{
				
				ShapedRecipe GHA = new ShapedRecipe(new ItemStack(Material.GOLD_BARDING));
				GHA.shape("WWG","GSG","GWG").setIngredient('S', Material.SADDLE).setIngredient('G', Material.GOLD_INGOT).setIngredient('W', Material.WOOL,14);
				getServer().addRecipe(GHA);
			
			}
			//DiamondHorseArmor
			if(this.getConfig().getBoolean("Recipes.Horse_armor.Diamond_horse_armor"))
			{
				
				ShapedRecipe DHA = new ShapedRecipe(new ItemStack(Material.DIAMOND_BARDING));
				DHA.shape("WWD","DSD","DWD").setIngredient('D', Material.DIAMOND).setIngredient('S', Material.SADDLE).setIngredient('W', Material.WOOL,11);
				getServer().addRecipe(DHA);
			}
		}
		
		//Ender_stone
		if(this.getConfig().getBoolean("Recipes.Ender_stone"))
		{
			ShapedRecipe ES = new ShapedRecipe(new ItemStack(Material.ENDER_STONE, 8));
			ES.shape("SSS","SPS","SSS").setIngredient('S', Material.STONE).setIngredient('P', Material.ENDER_PEARL); 
			getServer().addRecipe(ES);
		}
		
		if(this.getConfig().getBoolean("Recipes.Name_tag"))
		{
			//Name_tag
			ShapedRecipe NT = new ShapedRecipe(new ItemStack(Material.NAME_TAG));
			NT.shape("PS ","SB ","  S").setIngredient('B',Material.SLIME_BALL).setIngredient('P',Material.PAPER).setIngredient('S', Material.STRING);
			getServer().addRecipe(NT);
		}
		
		if(this.getConfig().getBoolean("Recipes.Leather"))
		{
			//Zombie flesh - leather
			ShapedRecipe ZFL = new ShapedRecipe(new ItemStack(Material.LEATHER));
			ZFL.shape("ZZZ","ZZZ","ZZZ").setIngredient('Z', Material.ROTTEN_FLESH);
			getServer().addRecipe(ZFL);
		}
		//Saplings
		if(this.getConfig().getBoolean("Recipes.Saplings.All"))
		{
			if(this.getConfig().getBoolean("Recipes.Saplings.Oak"))
			{
				//oak
				ShapedRecipe SapO = new ShapedRecipe(new ItemStack(Material.SAPLING, 4));
				SapO.shape("LLL","LSL","LLL").setIngredient('L', Material.LEAVES).setIngredient('S', Material.SEEDS);
				getServer().addRecipe(SapO);
			}
			
		
			if(this.getConfig().getBoolean("Recipes.Saplings.Spruce"))
			{
				//Spruce
				ShapedRecipe SapS = new ShapedRecipe(new ItemStack(Material.SAPLING, 4, (short)1));
				SapS.shape("LLL","LSL","LLL").setIngredient('L', Material.LEAVES, 1).setIngredient('S', Material.SEEDS);
				getServer().addRecipe(SapS);
			}
		
			if(this.getConfig().getBoolean("Recipes.Saplings.Birch"))
			{
				//birch
				ShapedRecipe SapB = new ShapedRecipe(new ItemStack(Material.SAPLING, 4, (short)2));
				SapB.shape("LLL","LSL","LLL").setIngredient('L', Material.LEAVES,2).setIngredient('S', Material.SEEDS);
				getServer().addRecipe(SapB);
				
			}
			if(this.getConfig().getBoolean("Recipes.Saplings.Jungle"))
			{
				//Jungle
				ShapedRecipe SapJ = new ShapedRecipe(new ItemStack(Material.SAPLING, 4, (short)3));
				SapJ.shape("LLL","LSL","LLL").setIngredient('L', Material.LEAVES,3).setIngredient('S', Material.SEEDS);
				getServer().addRecipe(SapJ);
			}
			if(this.getConfig().getBoolean("Recipes.Saplings.Acacia"))
			{
			//Acacia
			ShapedRecipe SapA = new ShapedRecipe(new ItemStack(Material.SAPLING, 4, (short)4));
			SapA.shape("LLL","LSL","LLL").setIngredient('L', Material.LEAVES_2).setIngredient('S', Material.SEEDS);
			getServer().addRecipe(SapA);
			}
			if(this.getConfig().getBoolean("Recipes.Saplings.Dark_oak"))
			{
			//Dark
			ShapedRecipe SapD = new ShapedRecipe(new ItemStack(Material.SAPLING, 4, (short)5));
			SapD.shape("LLL","LSL","LLL").setIngredient('L', Material.LEAVES_2,1).setIngredient('S', Material.SEEDS);
			getServer().addRecipe(SapD);
			}
	
		}
			
		//Dirt-grass
		if(this.getConfig().getBoolean("Recipes.Grass_block"))
		{
			ShapelessRecipe DG = new ShapelessRecipe(new ItemStack(Material.GRASS));
			DG.addIngredient(Material.DIRT).addIngredient(Material.SEEDS);
			getServer().addRecipe(DG);
		}	
		
		//flowers
		if(this.getConfig().getBoolean("Recipes.Flowers.All"))
		{
			//Dandelion
			if(this.getConfig().getBoolean("Recipes.Flowers.Dandelion"))
			{
				ShapelessRecipe Dande = new ShapelessRecipe(new ItemStack(Material.YELLOW_FLOWER));
				Dande.addIngredient(Material.SEEDS).addIngredient(Material.INK_SACK,11);
				getServer().addRecipe(Dande);
			}						
			
			//poppy
			if(this.getConfig().getBoolean("Recipes.Flowers.Poppy"))
			{
				ShapelessRecipe Poppy = new ShapelessRecipe(new ItemStack(Material.RED_ROSE));
				Poppy.addIngredient(Material.SEEDS).addIngredient(Material.INK_SACK,1);
				getServer().addRecipe(Poppy);
			}
			
			//Blue Orchid		
			if(this.getConfig().getBoolean("Recipes.Flowers.Poppy"))
			{
				ShapelessRecipe Orchid = new ShapelessRecipe(new ItemStack(Material.RED_ROSE, 1,(short)1));
				Orchid.addIngredient(Material.SEEDS).addIngredient(Material.INK_SACK,12);
				getServer().addRecipe(Orchid);
			}
			
			//Allium
			if(this.getConfig().getBoolean("Recipes.Flowers.Allium"))
			{
				ShapelessRecipe Allium = new ShapelessRecipe(new ItemStack(Material.RED_ROSE, 1,(short)2));
				Allium.addIngredient(Material.SEEDS).addIngredient(Material.INK_SACK,13);
				getServer().addRecipe(Allium);
			}
			
			//Azure		
			if(this.getConfig().getBoolean("Recipes.Flowers.Azure"))
			{
				ShapelessRecipe Azure = new ShapelessRecipe(new ItemStack(Material.RED_ROSE,1,(short)3));
				Azure.addIngredient(Material.SEEDS).addIngredient(Material.INK_SACK,7);
				getServer().addRecipe(Azure);
			}
			
			//Red tulip		
			if(this.getConfig().getBoolean("Recipes.Flowers.Red_Tulip"))
			{
				ShapelessRecipe TulipR = new ShapelessRecipe(new ItemStack(Material.RED_ROSE,1,(short)4));
				TulipR.addIngredient(Material.RED_ROSE, 6).addIngredient(Material.INK_SACK,1);
				getServer().addRecipe(TulipR);
			}
			
			//Orange Tulip	
			if(this.getConfig().getBoolean("Recipes.Flowers.Orange_Tulip"))
			{
				ShapelessRecipe TulipO = new ShapelessRecipe(new ItemStack(Material.RED_ROSE,1,(short)5));
				TulipO.addIngredient(Material.RED_ROSE, 6).addIngredient(Material.INK_SACK,14);
				getServer().addRecipe(TulipO);
			}
			
			//White tulip		
			if(this.getConfig().getBoolean("Recipes.Flowers.White_Tulip"))
			{
				ShapelessRecipe TulipW = new ShapelessRecipe(new ItemStack(Material.RED_ROSE,1,(short)6));
				TulipW.addIngredient(Material.SEEDS).addIngredient(Material.INK_SACK,15);
				getServer().addRecipe(TulipW);
			}
			//Pink Tulip
			if(this.getConfig().getBoolean("Recipes.Flowers.Pink_Tulip"))
			{
				ShapelessRecipe TulipP = new ShapelessRecipe(new ItemStack(Material.RED_ROSE,1,(short)7));
				TulipP.addIngredient(Material.RED_ROSE,6).addIngredient(Material.INK_SACK,9);
				getServer().addRecipe(TulipP);
			}
			
			// Oxeye daisy	
			if(this.getConfig().getBoolean("Recipes.Flowers.Oxeye_daisy"))
			{
				ShapelessRecipe Oxeye = new ShapelessRecipe(new ItemStack(Material.RED_ROSE, 1,(short) 8));
				Oxeye.addIngredient(Material.SEEDS).addIngredient(Material.INK_SACK,11).addIngredient(Material.INK_SACK, 15);
				getServer().addRecipe(Oxeye);
			}
		
			//SunFlower
			if(this.getConfig().getBoolean("Recipes.Flowers.SunFlower"))
			{
				ShapelessRecipe SunF = new ShapelessRecipe(new ItemStack(Material.DOUBLE_PLANT));
				SunF.addIngredient(Material.SEEDS).addIngredient(Material.INK_SACK, 11).addIngredient(Material.INK_SACK, 14);
				getServer().addRecipe(SunF);
			}
		
			//Lilac 	
			if(this.getConfig().getBoolean("Recipes.Flowers.Lilac"))
			{
				ShapelessRecipe Lilac = new ShapelessRecipe(new ItemStack(Material.DOUBLE_PLANT, 1,(short)1));
				Lilac.addIngredient(Material.SEEDS).addIngredient(Material.INK_SACK, 9).addIngredient(Material.INK_SACK, 13);
				getServer().addRecipe(Lilac);
			}
		
			//Double Tall Grass
			if(this.getConfig().getBoolean("Recipes.Flowers.Double_tall_grass"))
			{
				ShapelessRecipe DTG = new ShapelessRecipe(new ItemStack(Material.DOUBLE_PLANT, 1,(short)2));
				DTG.addIngredient(Material.SEEDS).addIngredient(Material.GRASS, 1);
				getServer().addRecipe(DTG);
			}
		
			//Rose Bush	
			if(this.getConfig().getBoolean("Recipes.Flowers.Rose_bush"))
			{
				ShapelessRecipe Rose = new ShapelessRecipe(new ItemStack(Material.DOUBLE_PLANT, 1,(short)4));
				Rose.addIngredient(Material.DOUBLE_PLANT, 2).addIngredient(Material.RED_ROSE);
				getServer().addRecipe(Rose);
			}
		
			//Peony
			if(this.getConfig().getBoolean("Recipes.Flowers.Peony"))
			{
				ShapelessRecipe Peony = new ShapelessRecipe(new ItemStack(Material.DOUBLE_PLANT, 1,(short)5));
				Peony.addIngredient(Material.DOUBLE_PLANT,2).addIngredient(Material.RED_ROSE, 7);
				getServer().addRecipe(Peony);
			}
		}
			//Glowstone	
		if(this.getConfig().getBoolean("Recipes.Glow_stone"))
		{
			ShapelessRecipe GSD = new ShapelessRecipe(new ItemStack(Material.GLOWSTONE_DUST, 4));
			GSD.addIngredient(Material.GLOWSTONE);	
			getServer().addRecipe(GSD);
		}
		//String
		if(this.getConfig().getBoolean("Recipes.String"))
		{
			ShapelessRecipe StrgW = new ShapelessRecipe(new ItemStack(Material.STRING, 4));
			StrgW.addIngredient(Material.WOOL);
			getServer().addRecipe(StrgW);
				//orange
				ShapelessRecipe StrgO = new ShapelessRecipe(new ItemStack(Material.STRING, 4));
				StrgO.addIngredient(Material.WOOL, 1);		
				getServer().addRecipe(StrgO);
					//Magenta 
				ShapelessRecipe StrgM = new ShapelessRecipe(new ItemStack(Material.STRING, 4));
				StrgM.addIngredient(Material.WOOL, 2);	
				getServer().addRecipe(StrgM);
						//Light blue
				ShapelessRecipe StrgLB = new ShapelessRecipe(new ItemStack(Material.STRING, 4));
				StrgLB.addIngredient(Material.WOOL, 3);		
				getServer().addRecipe(StrgLB);
					//Yellow
				ShapelessRecipe StrgY = new ShapelessRecipe(new ItemStack(Material.STRING, 4));
				StrgY.addIngredient(Material.WOOL, 4);		
				getServer().addRecipe(StrgY);
					//lime
				ShapelessRecipe StrgL = new ShapelessRecipe(new ItemStack(Material.STRING, 4));
				StrgL.addIngredient(Material.WOOL, 5);		
				getServer().addRecipe(StrgL);
						//pink
				ShapelessRecipe StrgP = new ShapelessRecipe(new ItemStack(Material.STRING, 4));
				StrgP.addIngredient(Material.WOOL, 6);		
				getServer().addRecipe(StrgP);
					//grey
				ShapelessRecipe StrgG = new ShapelessRecipe(new ItemStack(Material.STRING, 4));
				StrgG.addIngredient(Material.WOOL, 7);			
				getServer().addRecipe(StrgG);
					//light grey
				ShapelessRecipe StrgLG = new ShapelessRecipe(new ItemStack(Material.STRING, 4));
				StrgLG.addIngredient(Material.WOOL, 8);	
				getServer().addRecipe(StrgLG);
					//cyan
				ShapelessRecipe StrgC = new ShapelessRecipe(new ItemStack(Material.STRING, 4));
				StrgC.addIngredient(Material.WOOL, 9);	
				getServer().addRecipe(StrgC);
					//purple
				ShapelessRecipe StrgPu = new ShapelessRecipe(new ItemStack(Material.STRING, 4));
				StrgPu.addIngredient(Material.WOOL, 10);
				getServer().addRecipe(StrgPu);
					//blue
				ShapelessRecipe StrgB = new ShapelessRecipe(new ItemStack(Material.STRING, 4));
				StrgB.addIngredient(Material.WOOL, 11);		
				getServer().addRecipe(StrgB);
					//brown
				ShapelessRecipe StrgBr = new ShapelessRecipe(new ItemStack(Material.STRING, 4));
				StrgBr.addIngredient(Material.WOOL, 12);	
				getServer().addRecipe(StrgBr);
					//green
				ShapelessRecipe StrgGr = new ShapelessRecipe(new ItemStack(Material.STRING, 4));
				StrgGr.addIngredient(Material.WOOL, 13);	
				getServer().addRecipe(StrgGr);
						//red
				ShapelessRecipe StrgR = new ShapelessRecipe(new ItemStack(Material.STRING, 4));
				StrgR.addIngredient(Material.WOOL, 14);
				getServer().addRecipe(StrgR);
					//black
				ShapelessRecipe StrgBl = new ShapelessRecipe(new ItemStack(Material.STRING, 4));
				StrgBl.addIngredient(Material.WOOL, 15);			
				getServer().addRecipe(StrgBl);
		}
			//Cobweb
		if(this.getConfig().getBoolean("Recipes.Cobweb"))
		{
			ShapedRecipe CW = new ShapedRecipe(new ItemStack(Material.WEB, 2));
			CW.shape(" S ","SSS"," S ").setIngredient('S', Material.STRING);
			getServer().addRecipe(CW);
		}		
			//Melon	
		if(this.getConfig().getBoolean("Recipes.Melon_slices"))
		{
			ShapelessRecipe Mel = new ShapelessRecipe(new ItemStack(Material.MELON, 7));
			Mel.addIngredient(Material.MELON_BLOCK);
			getServer().addRecipe(Mel);
		}
			//JackoLantern	
		if(this.getConfig().getBoolean("Recipes.Pumpkin"))
		{
			ShapelessRecipe Jack = new ShapelessRecipe(new ItemStack(Material.PUMPKIN));
			Jack.addIngredient(Material.JACK_O_LANTERN);
			getServer().addRecipe(Jack);
		}
		//Sapling to stick
		if(this.getConfig().getBoolean("Recipes.Sticks.All"))
		{
			//Oak sapling
			if(this.getConfig().getBoolean("Recipes.Sticks.Oak"))
			{
				ShapelessRecipe OStS = new ShapelessRecipe(new ItemStack(Material.STICK, 2));
				OStS.addIngredient(Material.SAPLING);
				getServer().addRecipe(OStS);
			}		
			//Spruce Sapling	
			if(this.getConfig().getBoolean("Recipes.Sticks.Spruce"))
			{
				ShapelessRecipe SStS = new ShapelessRecipe(new ItemStack(Material.STICK, 2));
				SStS.addIngredient(Material.SAPLING,1);
				getServer().addRecipe(SStS);
			}
			//Birch Sapling		
			if(this.getConfig().getBoolean("Recipes.Sticks.Birch"))
			{
				ShapelessRecipe BStS = new ShapelessRecipe(new ItemStack(Material.STICK, 2));
				BStS.addIngredient(Material.SAPLING,2);
				getServer().addRecipe(BStS);
			}
			//Jungle Sapling
			if(this.getConfig().getBoolean("Recipes.Sticks.Jungle"))
			{
				ShapelessRecipe JStS = new ShapelessRecipe(new ItemStack(Material.STICK, 2));
				JStS.addIngredient(Material.SAPLING,3);
				getServer().addRecipe(JStS);
			}
			//Acacia Sapling			
			if(this.getConfig().getBoolean("Recipes.Sticks.Acaica"))
			{
				ShapelessRecipe AStS = new ShapelessRecipe(new ItemStack(Material.STICK, 2));
				AStS.addIngredient(Material.SAPLING,4);
				getServer().addRecipe(AStS);
			}
			//Dark Sapling			
			if(this.getConfig().getBoolean("Recipe.Sticks.Dark_oak"))
			{
				ShapelessRecipe DStS = new ShapelessRecipe(new ItemStack(Material.STICK, 2));
				DStS.addIngredient(Material.SAPLING,5);
				getServer().addRecipe(DStS);
			}
		}
		
		//podzol
		if(this.getConfig().getBoolean("Recipes.Podzol"))
		{		
			//oak leaves + dirt
		ShapedRecipe PodO = new ShapedRecipe(new ItemStack(Material.DIRT,1,(short)2));
		PodO.shape("LLL","LDL","LLL").setIngredient('L', Material.LEAVES).setIngredient('D', Material.DIRT);
		getServer().addRecipe(PodO);
		
			//spruce+dirt
		ShapedRecipe PodS = new ShapedRecipe(new ItemStack(Material.DIRT,1,(short)2));
		PodS.shape("LLL","LDL","LLL").setIngredient('L', Material.LEAVES,1).setIngredient('D', Material.DIRT);
		getServer().addRecipe(PodS);
			//Birch+dirt
		ShapedRecipe PodB = new ShapedRecipe(new ItemStack(Material.DIRT,1,(short)2));
		PodB.shape("LLL","LDL","LLL").setIngredient('L', Material.LEAVES,2).setIngredient('D', Material.DIRT);
		getServer().addRecipe(PodB);
			//jungle+dirt
		ShapedRecipe PodJ = new ShapedRecipe(new ItemStack(Material.DIRT,1,(short)2));
		PodJ.shape("LLL","LDL","LLL").setIngredient('L', Material.LEAVES,3).setIngredient('D', Material.DIRT);
		getServer().addRecipe(PodJ);
			//acaica+dirt
		ShapedRecipe PodA = new ShapedRecipe(new ItemStack(Material.DIRT,1,(short)2));
		PodA.shape("LLL","LDL","LLL").setIngredient('L', Material.LEAVES_2).setIngredient('D', Material.DIRT);
		getServer().addRecipe(PodA);
			//Dark+Dirt
		ShapedRecipe PodDa = new ShapedRecipe(new ItemStack(Material.DIRT,1,(short)2));
		PodDa.shape("LLL","LDL","LLL").setIngredient('L', Material.LEAVES_2,1).setIngredient('D', Material.DIRT);
		getServer().addRecipe(PodDa);		
		}
		//Polished to normal
		if(getConfig().getBoolean("Recipes.Polished_to_Normal.All"))
		{
			//Polished Granite
			if(getConfig().getBoolean("Recipes.Polished_to_Normal.Granite"))
			{
				ShapelessRecipe PGtG = new ShapelessRecipe(new ItemStack(Material.STONE, 1,(short)1));
				PGtG.addIngredient(Material.STONE,2);
				getServer().addRecipe(PGtG);
			}
				//Polished Diorite
			if(getConfig().getBoolean("Recipes.Polished_to_Normal.Diorite"))
			{
				ShapelessRecipe PDtD = new ShapelessRecipe(new ItemStack(Material.STONE, 1,(short)3));
				PDtD.addIngredient(Material.STONE,4);
				getServer().addRecipe(PDtD);
			}
				//Polished Andesite
			if(getConfig().getBoolean("Recipes.Polished_to_Normal.Andesite"))
			{
				ShapelessRecipe PAtA = new ShapelessRecipe(new ItemStack(Material.STONE, 1,(short)5));
				PAtA.addIngredient(Material.STONE,6);
				getServer().addRecipe(PAtA);
			}
		}
				
			//Soul sand
		if(this.getConfig().getBoolean("Recipes.Soul_Sand"))
		{
			ShapedRecipe SoulS = new ShapedRecipe(new ItemStack(Material.SOUL_SAND,4));
			SoulS.shape("SSS","SNS","SSS").setIngredient('S', Material.SAND).setIngredient('N', Material.NETHER_STALK);
			getServer().addRecipe(SoulS);
		}
			//Mycel		
		if(this.getConfig().getBoolean("Recipes.Mycelium"))
		{
			ShapelessRecipe Mycel = new ShapelessRecipe(new ItemStack(Material.MYCEL));
			Mycel.addIngredient(Material.BROWN_MUSHROOM).addIngredient(Material.RED_MUSHROOM).addIngredient(Material.GRASS);
			getServer().addRecipe(Mycel);
		}
		//Sticks to planks
		
		if(this.getConfig().getBoolean("Recipes.Sticks_To_Planks"))
		{
			//Bottom Right Grid
			ShapedRecipe StickstPlanksBR = new ShapedRecipe(new ItemStack(Material.WOOD,4));
			StickstPlanksBR.shape("   "," SS"," SS").setIngredient('S', Material.STICK);
			getServer().addRecipe(StickstPlanksBR);
				//Bottom Left Grid
			ShapedRecipe StickstPlanksBL = new ShapedRecipe(new ItemStack(Material.WOOD,4));
			StickstPlanksBL.shape("   ","SS ","SS ").setIngredient('S', Material.STICK);
			getServer().addRecipe(StickstPlanksBL);
				//Top Right Grid
			ShapedRecipe StickstPlanksTR = new ShapedRecipe(new ItemStack(Material.WOOD,4));
			StickstPlanksTR.shape(" SS"," SS","   ").setIngredient('S', Material.STICK);
			getServer().addRecipe(StickstPlanksTR);
				//Top Left Grid
			ShapedRecipe StickstPlanksTL = new ShapedRecipe(new ItemStack(Material.WOOD,4));
			StickstPlanksTL.shape("SS ","SS ","   ").setIngredient('S', Material.STICK);
			getServer().addRecipe(StickstPlanksTL);
		}
		
		//Slabs to blocks			
		
		if(this.getConfig().getBoolean("Recipes.Slabs_To_Blocks.All"))
		{
			//Oak
			if(this.getConfig().getBoolean("Recipes.Slabs_To_Blocks.Oak"))
			{
			//Oak slabs to Planks (Bottom) 
			ShapedRecipe OStPb = new ShapedRecipe(new ItemStack(Material.WOOD,3));
			OStPb.shape("   ","SSS","SSS").setIngredient('S', Material.WOOD_STEP);
			getServer().addRecipe(OStPb);
			//Oak slabs to Planks (Top)
			ShapedRecipe OStPt = new ShapedRecipe(new ItemStack(Material.WOOD,3));
			OStPt.shape("SSS","SSS","   ").setIngredient('S', Material.WOOD_STEP);
			getServer().addRecipe(OStPt);
			}
			//Spruce
			if(this.getConfig().getBoolean("Recipes.Slabs_To_Blocks.Spruce"))
			{
				//Spruce slabs to planks(Bottom)
				ShapedRecipe SStPb = new ShapedRecipe(new ItemStack(Material.WOOD,3,(short)1));
				SStPb.shape("   ","SSS","SSS").setIngredient('S',Material.WOOD_STEP,1);
				getServer().addRecipe(SStPb);
				//Spruce slabs to planks (top)
				ShapedRecipe SStPt = new ShapedRecipe(new ItemStack(Material.WOOD,3,(short)1));
				SStPt.shape("SSS","SSS","   ").setIngredient('S',Material.WOOD_STEP,1);
				getServer().addRecipe(SStPt);
			}
			//Birch
			if(this.getConfig().getBoolean("Recipes.Slabs_To_Blocks.Birch"))
			{
				//Birch Slabs to Planks (bottom)
				ShapedRecipe BStPb = new ShapedRecipe(new ItemStack(Material.WOOD,3,(short)2));
				BStPb.shape("   ","SSS","SSS").setIngredient('S',Material.WOOD_STEP,2);
				getServer().addRecipe(BStPb);
				//Birch Slabs to Planks (Top)
				ShapedRecipe BStPt = new ShapedRecipe(new ItemStack(Material.WOOD,3,(short)2));
				BStPt.shape("SSS","SSS","   ").setIngredient('S',Material.WOOD_STEP,2);
				getServer().addRecipe(BStPt);			
			}
			//Jungle
			if(this.getConfig().getBoolean("Recipes.Slabs_To_Blocks.Jungle"))
			{
				//Jungle slabs to planks (Bottom)
				ShapedRecipe JStPb = new ShapedRecipe(new ItemStack(Material.WOOD,3,(short)3));
				JStPb.shape("   ","SSS","SSS").setIngredient('S', Material.WOOD_STEP,3);
				getServer().addRecipe(JStPb);
				//Jungle slabs to planks (Top)
				ShapedRecipe JStPt = new ShapedRecipe(new ItemStack(Material.WOOD,3,(short)3));
				JStPt.shape("SSS","SSS","   ").setIngredient('S', Material.WOOD_STEP,3);
				getServer().addRecipe(JStPt);
			}
			//Acacia
			if(this.getConfig().getBoolean("Recipes.Slabs_To_Blocks.Acacia"))
			{
				//Acacia Slabs to planks (Bottom)
				ShapedRecipe AStPb = new ShapedRecipe(new ItemStack(Material.WOOD,3,(short)4));
				AStPb.shape("   ","SSS","SSS").setIngredient('S', Material.WOOD_STEP,4);	
				getServer().addRecipe(AStPb);
				//Acacia slabs to planks (Top)
				ShapedRecipe AStPt = new ShapedRecipe(new ItemStack(Material.WOOD,3,(short)4));
				AStPt.shape("SSS","SSS","   ").setIngredient('S', Material.WOOD_STEP,4);
				getServer().addRecipe(AStPt);
	
			}
			//Dark_oak
			if(this.getConfig().getBoolean("Recipes.Slabs_To_Blocks.Dark_Oak"))
			{
				//Dark Slabs to planks (Bottom)
				ShapedRecipe DStPb = new ShapedRecipe(new ItemStack(Material.WOOD,3,(short)5));
				DStPb.shape("   ","SSS","SSS").setIngredient('S', Material.WOOD_STEP,5);
				getServer().addRecipe(DStPb);
				//Dark Slabs to planks (top)
				ShapedRecipe DStPt = new ShapedRecipe(new ItemStack(Material.WOOD,3,(short)5));
				DStPt.shape("SSS","SSS","   ").setIngredient('S', Material.WOOD_STEP,5);
				getServer().addRecipe(DStPt);		
			}
	
		}
		//stone & brick slabs to blocks
		if(getConfig().getBoolean("Recipes.Stone&Brick_Slabs_To_Blocks.All"))
		{
			//stone slab to block
			if(getConfig().getBoolean("Recipes.Stone&Brick_Slabs_To_Blocks.Stone"))
			{
				//stone slab to block (Bottom)
				ShapedRecipe SStBb = new ShapedRecipe(new ItemStack(Material.STONE,3));
				SStBb.shape("   ","SSS","SSS").setIngredient('S', Material.STEP);
				getServer().addRecipe(SStBb);
						//stone slab to block (Top)
				ShapedRecipe SStBt = new ShapedRecipe(new ItemStack(Material.STONE,3));
				SStBt.shape("SSS","SSS","   ").setIngredient('S', Material.STEP);
				getServer().addRecipe(SStBt);
			}
			//SandStone Slab to block 	
			if(getConfig().getBoolean("Recipes.Stone&Brick_Slabs_To_Blocks.Sand_Stone"))
			{
				//SandStone Slab to block (Bottom)	
				ShapedRecipe SSStBb = new ShapedRecipe(new ItemStack(Material.SANDSTONE,3));
				SSStBb.shape("   ","SSS","SSS").setIngredient('S', Material.STEP,1);
				getServer().addRecipe(SSStBb);
					//SandStone Slab to Block (Top)
				ShapedRecipe SSStBt = new ShapedRecipe(new ItemStack(Material.SANDSTONE,3));
				SSStBt.shape("SSS","SSS","   ").setIngredient('S', Material.STEP,1);
				getServer().addRecipe(SSStBt);
			}
			
			//Cobble Slab to block
			if(getConfig().getBoolean("Recipes.Stone&Brick_Slabs_To_Blocks.Cobble_Stone"))
			{
				//Cobble slab to block (Bottom)
				ShapedRecipe CStBb = new ShapedRecipe(new ItemStack(Material.COBBLESTONE,3));
				CStBb.shape("   ","SSS","SSS").setIngredient('S', Material.STEP,3);
				getServer().addRecipe(CStBb);
					//Cobble Slab to Block (Top)
				ShapedRecipe CStBt = new ShapedRecipe(new ItemStack(Material.COBBLESTONE,3));
				CStBt.shape("SSS","SSS","   ").setIngredient('S', Material.STEP,3);
				getServer().addRecipe(CStBt);
			}
			//brick slab to block
			if(getConfig().getBoolean("Recipes.Stone&Brick_Slabs_To_Blocks.Brick"))
			{
				//Brick slab to block (Bottom)
				ShapedRecipe BStBb = new ShapedRecipe(new ItemStack(Material.BRICK,3));
				BStBb.shape("   ","SSS","SSS").setIngredient('S', Material.STEP,4);
				getServer().addRecipe(BStBb);
					//Brick slab to block (Top)
				ShapedRecipe BStBt = new ShapedRecipe(new ItemStack(Material.BRICK,3));
				BStBt.shape("SSS","SSS","   ").setIngredient('S', Material.STEP,4);
				getServer().addRecipe(BStBt);
			}
			//Stone brick slab to block
			if(getConfig().getBoolean("Recipes.Stone&Brick_Slabs_To_Blocks.Stone_Brick"))
			{
				//Stone brick slab to block (Bottom)
				ShapedRecipe SBStBb = new ShapedRecipe(new ItemStack(Material.SMOOTH_BRICK,3));
				SBStBb.shape("   ","SSS","SSS").setIngredient('S', Material.STEP,5);
				getServer().addRecipe(SBStBb);
					//Stone brick slab to block (Top)
				ShapedRecipe SBStBt = new ShapedRecipe(new ItemStack(Material.SMOOTH_BRICK,3));
				SBStBt.shape("SSS","SSS","   ").setIngredient('S', Material.STEP,5);
				getServer().addRecipe(SBStBt);
			}
			//nether brick slab to block
			if(getConfig().getBoolean("Recipes.Stone&Brick_Slabs_To_Blocks.Nether_Brick"))
			{
				//Nether Slab to block (Bottom)
				ShapedRecipe NStBb = new ShapedRecipe(new ItemStack(Material.NETHER_BRICK,3));
				NStBb.shape("   ","SSS","SSS").setIngredient('S', Material.STEP,6);
				getServer().addRecipe(NStBb);
					//Nether SLab to Block (Top)
				ShapedRecipe NStBt = new ShapedRecipe(new ItemStack(Material.NETHER_BRICK,3));
				NStBt.shape("SSS","SSS","   ").setIngredient('S', Material.STEP,6);
				getServer().addRecipe(NStBt);
			}
			//quartz slab to block
			if(getConfig().getBoolean("Recipes.Stone&Brick_Slabs_To_Blocks.Quartz"))
			{
				//Quartz to block (Bottom)
				ShapedRecipe QStBb = new ShapedRecipe(new ItemStack(Material.QUARTZ_BLOCK,3));
				QStBb.shape("   ","SSS","SSS").setIngredient('S', Material.STEP,7);
				getServer().addRecipe(QStBb);
					//Quartz to block (Top)
				ShapedRecipe QStBt = new ShapedRecipe(new ItemStack(Material.QUARTZ_BLOCK,3));
				QStBt.shape("SSS","SSS","   ").setIngredient('S', Material.STEP,7);
				getServer().addRecipe(QStBt);
			}
			//Red sandstone brick
			if(getConfig().getBoolean("Recipes.Stone&Brick_Slabs_To_Blocks.Red_SandStone"))
			{
				//Red Sandstone to block (Bottom)
				ShapedRecipe RSStBb = new ShapedRecipe(new ItemStack(Material.RED_SANDSTONE,3));
				RSStBb.shape("   ","SSS","SSS").setIngredient('S', Material.STONE_SLAB2);
				getServer().addRecipe(RSStBb);
					//Red sandstone to block (Top)
				ShapedRecipe RSStBt = new ShapedRecipe(new ItemStack(Material.RED_SANDSTONE,3));
				RSStBt.shape("SSS","SSS","   ").setIngredient('S', Material.STONE_SLAB2);
				getServer().addRecipe(RSStBt);
			}
			
		}
		//skulls and heads
		if(getConfig().getBoolean("Recipes.Skulls.All"))
		{
			//Skely skull
			if(getConfig().getBoolean("Recipes.Skulls.Skeleton"))
			{
				ShapedRecipe SKs = new ShapedRecipe(new ItemStack(Material.SKULL_ITEM));
				SKs.shape("BBB","BBB","BBB").setIngredient('B', Material.BONE);
				getServer().addRecipe(SKs);
			}
			//Zombie skull
			if(getConfig().getBoolean("Recipes.Skulls.Zombie"))
			{
				ShapedRecipe ZSk = new ShapedRecipe(new ItemStack(Material.SKULL_ITEM, 1, (short)2));
				ZSk.shape(" Z ","ZSZ"," Z ").setIngredient('S', Material.SKULL_ITEM).setIngredient('Z',Material.ROTTEN_FLESH);
				getServer().addRecipe(ZSk);
			}
			//Creeper skull
			if(getConfig().getBoolean("Recipes.Skulls.Creeper"))
			{
				ShapedRecipe CSk = new ShapedRecipe(new ItemStack(Material.SKULL_ITEM, 1, (short) 4));
				CSk.shape(" C ","CSC"," C ").setIngredient('S', Material.SKULL_ITEM).setIngredient('C',Material.SULPHUR);
				getServer().addRecipe(CSk);
			}
		}
		//Gun powder
		if(getConfig().getBoolean("Recipes.Gun_Powder"))
		{
			ShapedRecipe Gnp = new ShapedRecipe(new ItemStack(Material.SULPHUR,5));
			Gnp.shape("CQC","QCQ","CQC").setIngredient('C', Material.COAL,1).setIngredient('Q',Material.QUARTZ);
			getServer().addRecipe(Gnp);
		}
		//Dragon egg
		if(this.getConfig().getBoolean("Recipes.Dragon_egg"))
		{
			ShapedRecipe DE = new ShapedRecipe(new ItemStack(Material.DRAGON_EGG));
			DE.shape(" O ","OEO","OOO").setIngredient('O', Material.OBSIDIAN).setIngredient('E', Material.EGG);
			getServer().addRecipe(DE);
		}
	
		//Furnace Recipes 
		//Bucket to iron
		if(getConfig().getBoolean("Furnace_Recipes.Iron_from_bucket"))
		{
			FurnaceRecipe Bucket = new FurnaceRecipe(new ItemStack(Material.IRON_INGOT, 3),Material.BUCKET);
			Bucket.setInput(Material.BUCKET);
			getServer().addRecipe(Bucket);
		}
		
			//Flint
		if(getConfig().getBoolean("Furnace_Recipes.Flint"))
		{
		FurnaceRecipe FL = new FurnaceRecipe(new ItemStack(Material.FLINT), Material.GRAVEL);
		FL.setInput(Material.GRAVEL);
		getServer().addRecipe(FL);
		}
		
			//Andersite to stone
		if(getConfig().getBoolean("Furnace_Recipes.Andersite_To_Stone"))
		{
		FurnaceRecipe AtS = new FurnaceRecipe(new ItemStack(Material.STONE),Material.STONE,5);
		AtS.setInput(Material.STONE,5);
		getServer().addRecipe(AtS);
		}
	
		
		getLogger().info("Crafthium has been Enabled");
		
		
	}
		

@EventHandler //Items with command actions
	public void onPlayerRightClick(PlayerInteractEvent event) 
 {
	    	  Player player = event.getPlayer(); 
	    if(getConfig().getBoolean("Craft_Book"))
	    {
	    	
	    ItemStack CraftBook = new ItemStack(Material.ENCHANTED_BOOK); 
	    ItemMeta im = CraftBook.getItemMeta(); 
	    im.setDisplayName (ChatColor.RED + "" + ChatColor.BOLD + "Crafting Book"); 
	    List<String> lore = new ArrayList<String>(); 
	    lore.add(ChatColor.DARK_PURPLE + "A book embued with ender crafting magic");
	    lore.add(ChatColor.AQUA + "Right click to use");
	    im.setLore(lore); 
	    CraftBook.setItemMeta(im); 
	    ShapedRecipe CB = new ShapedRecipe(CraftBook); 
	    CB.shape("LEE","LCB","LEE").setIngredient('E', Material.EYE_OF_ENDER).setIngredient('C', Material.WORKBENCH).setIngredient('B', Material.BOOK).setIngredient('L', Material.LAPIS_BLOCK);
	    Bukkit.getServer().addRecipe(CB);  
	
		 if (player.getItemInHand().equals(CraftBook))
		 {
	    		player.openWorkbench(null, true);
		 } 
	    }
 }

	public void onDisable()
	{
		Bukkit.getServer().clearRecipes();
		getLogger().info("Crafthium has been Disabled");
		plugin = null;
	}
	
	private void registerConfig()
	{
		 if(!new File(this.getDataFolder(), "config.yml").exists())
		 {
			 this.saveDefaultConfig();
			 getConfig().options().copyHeader(true);
		 }else
		 {
	     getConfig().options().copyDefaults(true);
		 getConfig().options().copyHeader(true);
		 saveConfig();
		 }
	}
}