package me.merinthium.com;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.FurnaceRecipe;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class Recipe extends JavaPlugin {
	
	
	@SuppressWarnings("deprecation")
	public void onEnable(){
		//Crafting & Smelting
			//saddle
		ShapedRecipe saddle = new ShapedRecipe(new ItemStack(Material.SADDLE));
		saddle.shape("L L","LLL","LIL").setIngredient('L', Material.LEATHER).setIngredient('I', Material.IRON_INGOT);
		
			//IronHorseArmor
		ShapedRecipe IHA = new ShapedRecipe(new ItemStack(Material.IRON_BARDING));
		IHA.shape("WWI","ISI","IWI").setIngredient('I', Material.IRON_INGOT).setIngredient('S', Material.SADDLE).setIngredient('W',Material.WOOL, 15 );
		
			//GoldHorseArmor
		ShapedRecipe GHA = new ShapedRecipe(new ItemStack(Material.GOLD_BARDING));
		GHA.shape("WWG","GSG","GWG").setIngredient('S', Material.SADDLE).setIngredient('G', Material.GOLD_INGOT).setIngredient('W', Material.WOOL,14);
		
			//DiamondHorseArmor
		ShapedRecipe DHA = new ShapedRecipe(new ItemStack(Material.DIAMOND_BARDING));
		DHA.shape("WWD","DSD","DWD").setIngredient('D', Material.DIAMOND).setIngredient('S', Material.SADDLE).setIngredient('W', Material.WOOL, 11);
		
			//Ender_stone
		ShapedRecipe ES = new ShapedRecipe(new ItemStack(Material.ENDER_STONE, 8));
		ES.shape("SSS","SPS","SSS").setIngredient('S', Material.STONE).setIngredient('P', Material.ENDER_PEARL);
		
			//Name_tag
		ShapedRecipe NT = new ShapedRecipe(new ItemStack(Material.NAME_TAG));
		NT.shape("  S"," B ","P  ").setIngredient('B',Material.BOOK_AND_QUILL).setIngredient('P',Material.PAPER).setIngredient('S', Material.STRING);
		
			//Zombie flesh - leather
		ShapedRecipe ZFL = new ShapedRecipe(new ItemStack(Material.LEATHER));
		ZFL.shape("ZZZ","ZZZ","ZZZ").setIngredient('Z', Material.ROTTEN_FLESH);
		
		//Saplings
			//oak
		ShapedRecipe SapO = new ShapedRecipe(new ItemStack(Material.SAPLING, 4));
		SapO.shape("LLL","LSL","LLL").setIngredient('L', Material.LEAVES).setIngredient('S', Material.SEEDS);
		
			//Spruce
		ShapedRecipe SapS = new ShapedRecipe(new ItemStack(Material.SAPLING, 4, (short)1));
		SapS.shape("LLL","LSL","LLL").setIngredient('L', Material.LEAVES, 1).setIngredient('S', Material.SEEDS);
		
			//birch
		ShapedRecipe SapB = new ShapedRecipe(new ItemStack(Material.SAPLING, 4, (short)2));
		SapB.shape("LLL","LSL","LLL").setIngredient('L', Material.LEAVES,2).setIngredient('S', Material.SEEDS);
		
			//Jungle
		ShapedRecipe SapJ = new ShapedRecipe(new ItemStack(Material.SAPLING, 4, (short)3));
		SapJ.shape("LLL","LSL","LLL").setIngredient('L', Material.LEAVES,3).setIngredient('S', Material.SEEDS);
		
			//Acacia
		ShapedRecipe SapA = new ShapedRecipe(new ItemStack(Material.SAPLING, 4, (short)4));
		SapA.shape("LLL","LSL","LLL").setIngredient('L', Material.LEAVES_2).setIngredient('S', Material.SEEDS);
		
			//Dark
		ShapedRecipe SapD = new ShapedRecipe(new ItemStack(Material.SAPLING, 4, (short)5));
		SapD.shape("LLL","LSL","LLL").setIngredient('L', Material.LEAVES_2,1).setIngredient('S', Material.SEEDS);
		
			//Dirt-grass
		ShapelessRecipe DG = new ShapelessRecipe(new ItemStack(Material.GRASS));
		DG.addIngredient(Material.DIRT).addIngredient(Material.SEEDS);
		
		//flowers
			//Dandelion
		ShapelessRecipe Dande = new ShapelessRecipe(new ItemStack(Material.YELLOW_FLOWER));
		Dande.addIngredient(Material.SEEDS).addIngredient(Material.INK_SACK,11);
			//poppy
		ShapelessRecipe Poppy = new ShapelessRecipe(new ItemStack(Material.RED_ROSE));
		Poppy.addIngredient(Material.SEEDS).addIngredient(Material.INK_SACK,1);
			//Blue Orchid
		ShapelessRecipe Orchid = new ShapelessRecipe(new ItemStack(Material.RED_ROSE, 1,(short)1));
		Orchid.addIngredient(Material.SEEDS).addIngredient(Material.INK_SACK,12);
			//Allium
		ShapelessRecipe Allium = new ShapelessRecipe(new ItemStack(Material.RED_ROSE, 1,(short)2));
		Allium.addIngredient(Material.SEEDS).addIngredient(Material.INK_SACK,13);
			//Azure
		ShapelessRecipe Azure = new ShapelessRecipe(new ItemStack(Material.RED_ROSE,1,(short)3));
		Azure.addIngredient(Material.SEEDS).addIngredient(Material.INK_SACK,7);
			//Red tulip
		ShapelessRecipe TulipR = new ShapelessRecipe(new ItemStack(Material.RED_ROSE,1,(short)4));
		TulipR.addIngredient(Material.RED_ROSE, 6).addIngredient(Material.INK_SACK,1);
			//Orange Tulip
		ShapelessRecipe TulipO = new ShapelessRecipe(new ItemStack(Material.RED_ROSE,1,(short)5));
		TulipO.addIngredient(Material.RED_ROSE, 6).addIngredient(Material.INK_SACK,14);
			//White tulip
		ShapelessRecipe TulipW = new ShapelessRecipe(new ItemStack(Material.RED_ROSE,1,(short)6));
		TulipW.addIngredient(Material.SEEDS).addIngredient(Material.INK_SACK,15);
			//Pink Tulip
		ShapelessRecipe TulipP = new ShapelessRecipe(new ItemStack(Material.RED_ROSE,1,(short)7));
		TulipP.addIngredient(Material.RED_ROSE,6).addIngredient(Material.INK_SACK,9);
			// Oxeye daisy
		ShapelessRecipe Oxeye = new ShapelessRecipe(new ItemStack(Material.RED_ROSE, 1,(short) 8));
		Oxeye.addIngredient(Material.SEEDS).addIngredient(Material.INK_SACK,11).addIngredient(Material.INK_SACK, 15);
		
			//SunFlower
		ShapelessRecipe SunF = new ShapelessRecipe(new ItemStack(Material.DOUBLE_PLANT));
		SunF.addIngredient(Material.SEEDS).addIngredient(Material.INK_SACK, 11).addIngredient(Material.INK_SACK, 14);
		
			//Lilac 
		ShapelessRecipe Lilac = new ShapelessRecipe(new ItemStack(Material.DOUBLE_PLANT, 1,(short)1));
		Lilac.addIngredient(Material.SEEDS).addIngredient(Material.INK_SACK, 9).addIngredient(Material.INK_SACK, 13);
		
			//Double Tall Grass
		ShapelessRecipe DTG = new ShapelessRecipe(new ItemStack(Material.DOUBLE_PLANT, 1,(short)2));
		DTG.addIngredient(Material.SEEDS).addIngredient(Material.GRASS, 1);
		
			//Rose Bush
		ShapelessRecipe Rose = new ShapelessRecipe(new ItemStack(Material.DOUBLE_PLANT, 1,(short)4));
		Rose.addIngredient(Material.DOUBLE_PLANT, 2).addIngredient(Material.RED_ROSE);
		
			//Peony
		ShapelessRecipe Peony = new ShapelessRecipe(new ItemStack(Material.DOUBLE_PLANT, 1,(short)5));
		Peony.addIngredient(Material.DOUBLE_PLANT,2).addIngredient(Material.RED_ROSE, 7);
			
			//Apple
//		ShapelessRecipe Apple = new ShapelessRecipe(new ItemStack(Material.APPLE));
//		Apple.addIngredient(Material.LEAVES);
		
			//Glowstone
		ShapelessRecipe GSD = new ShapelessRecipe(new ItemStack(Material.GLOWSTONE_DUST, 4));
		GSD.addIngredient(Material.GLOWSTONE);	
			
			//String
		ShapelessRecipe StrgW = new ShapelessRecipe(new ItemStack(Material.STRING, 4));
		StrgW.addIngredient(Material.WOOL);
				
				//orange
			ShapelessRecipe StrgO = new ShapelessRecipe(new ItemStack(Material.STRING, 4));
			StrgO.addIngredient(Material.WOOL, 1);		
				//Magenta 
			ShapelessRecipe StrgM = new ShapelessRecipe(new ItemStack(Material.STRING, 4));
			StrgM.addIngredient(Material.WOOL, 2);	
				//Light blue
			ShapelessRecipe StrgLB = new ShapelessRecipe(new ItemStack(Material.STRING, 4));
			StrgLB.addIngredient(Material.WOOL, 3);		
				//Yellow
			ShapelessRecipe StrgY = new ShapelessRecipe(new ItemStack(Material.STRING, 4));
			StrgY.addIngredient(Material.WOOL, 4);		
				//lime
			ShapelessRecipe StrgL = new ShapelessRecipe(new ItemStack(Material.STRING, 4));
			StrgL.addIngredient(Material.WOOL, 5);		
				//pink
			ShapelessRecipe StrgP = new ShapelessRecipe(new ItemStack(Material.STRING, 4));
			StrgP.addIngredient(Material.WOOL, 6);		
				//grey
			ShapelessRecipe StrgG = new ShapelessRecipe(new ItemStack(Material.STRING, 4));
			StrgG.addIngredient(Material.WOOL, 7);			
				//light grey
			ShapelessRecipe StrgLG = new ShapelessRecipe(new ItemStack(Material.STRING, 4));
			StrgLG.addIngredient(Material.WOOL, 8);		
				//cyan
			ShapelessRecipe StrgC = new ShapelessRecipe(new ItemStack(Material.STRING, 4));
			StrgC.addIngredient(Material.WOOL, 9);		
				//purple
			ShapelessRecipe StrgPu = new ShapelessRecipe(new ItemStack(Material.STRING, 4));
			StrgPu.addIngredient(Material.WOOL, 10);		
				//blue
			ShapelessRecipe StrgB = new ShapelessRecipe(new ItemStack(Material.STRING, 4));
			StrgB.addIngredient(Material.WOOL, 11);		
				//brown
			ShapelessRecipe StrgBr = new ShapelessRecipe(new ItemStack(Material.STRING, 4));
			StrgBr.addIngredient(Material.WOOL, 12);		
				//green
			ShapelessRecipe StrgGr = new ShapelessRecipe(new ItemStack(Material.STRING, 4));
			StrgGr.addIngredient(Material.WOOL, 13);			
				//red
			ShapelessRecipe StrgR = new ShapelessRecipe(new ItemStack(Material.STRING, 4));
			StrgR.addIngredient(Material.WOOL, 14);
				//black
			ShapelessRecipe StrgBl = new ShapelessRecipe(new ItemStack(Material.STRING, 4));
			StrgBl.addIngredient(Material.WOOL, 15);
			
			//Cobweb
		ShapedRecipe CW = new ShapedRecipe(new ItemStack(Material.WEB, 2));
		CW.shape(" S ","SSS"," S ").setIngredient('S', Material.STRING);
			
			//Melon
		ShapelessRecipe Mel = new ShapelessRecipe(new ItemStack(Material.MELON, 7));
		Mel.addIngredient(Material.MELON_BLOCK);
		
			//JackoLantern
		ShapelessRecipe Jack = new ShapelessRecipe(new ItemStack(Material.PUMPKIN));
		Jack.addIngredient(Material.JACK_O_LANTERN);
			
			//Snow block to snow ball
		ShapelessRecipe SBtSB = new ShapelessRecipe(new ItemStack(Material.SNOW_BALL, 4));
		SBtSB.addIngredient(Material.SNOW_BLOCK);
		
			//Snow balls to snow slab
		ShapedRecipe SBtSL = new ShapedRecipe(new ItemStack(Material.SNOW));
		SBtSL.shape("  ","  ","SSS").setIngredient('S', Material.SNOW_BALL);
		
		//Sapling to stick
		
			//Oak sapling
		ShapelessRecipe OStS = new ShapelessRecipe(new ItemStack(Material.STICK, 2));
		OStS.addIngredient(Material.SAPLING);
		
			//Spruce Sapling
		ShapelessRecipe SStS = new ShapelessRecipe(new ItemStack(Material.STICK, 2));
		SStS.addIngredient(Material.SAPLING,1);
		
			//Birch Sapling
		ShapelessRecipe BStS = new ShapelessRecipe(new ItemStack(Material.STICK, 2));
		BStS.addIngredient(Material.SAPLING,2);
			//Jungle Sapling
		ShapelessRecipe JStS = new ShapelessRecipe(new ItemStack(Material.STICK, 2));
		JStS.addIngredient(Material.SAPLING,3);
		
			//Acacia Sapling
		ShapelessRecipe AStS = new ShapelessRecipe(new ItemStack(Material.STICK, 2));
		AStS.addIngredient(Material.SAPLING,4);
		
			//Dark Sapling
		ShapelessRecipe DStS = new ShapelessRecipe(new ItemStack(Material.STICK, 2));
		DStS.addIngredient(Material.SAPLING,5);
		
			//Polished to normal
			//Polished Granite
		ShapelessRecipe PGtG = new ShapelessRecipe(new ItemStack(Material.STONE, 1,(short)1));
		PGtG.addIngredient(Material.STONE,2);
		
			//Polished Diorite
		ShapelessRecipe PDtD = new ShapelessRecipe(new ItemStack(Material.STONE, 1,(short)3));
		PDtD.addIngredient(Material.STONE,4);
		
			//Polished Andesite
		ShapelessRecipe PAtA = new ShapelessRecipe(new ItemStack(Material.STONE, 1,(short)5));
		PAtA.addIngredient(Material.STONE,6);
		
		
		//Furnace Recipes 
		
			//Bucket to iron
		FurnaceRecipe Bucket = new FurnaceRecipe(new ItemStack(Material.IRON_INGOT, 3),Material.BUCKET);
		Bucket.setInput(Material.BUCKET);
		
			//Flint
		FurnaceRecipe FL = new FurnaceRecipe(new ItemStack(Material.FLINT), Material.GRAVEL);
		FL.setInput(Material.GRAVEL);
		
			//Granite to Diorite
		FurnaceRecipe GtD = new FurnaceRecipe(new ItemStack(Material.STONE,1,(short)3),Material.STONE,1);
		GtD.setInput(Material.STONE,1);
			//Diorite to andersite
		FurnaceRecipe DtA = new FurnaceRecipe(new ItemStack(Material.STONE,1,(short) 5),Material.STONE,3);
		DtA.setInput(Material.STONE, 3);
			//Andersite to stone
		FurnaceRecipe AtS = new FurnaceRecipe(new ItemStack(Material.STONE),Material.STONE,5);
		AtS.setInput(Material.STONE,5);
		
		getServer().addRecipe(saddle);
		getServer().addRecipe(IHA);
		getServer().addRecipe(GHA);
		getServer().addRecipe(DHA);
		getServer().addRecipe(ES);
		getServer().addRecipe(NT);
		getServer().addRecipe(GSD);
		getServer().addRecipe(ZFL);
//		getServer().addRecipe(Apple);
		getServer().addRecipe(SapO);
		getServer().addRecipe(SapB);
		getServer().addRecipe(SapS);
		getServer().addRecipe(SapJ);
		getServer().addRecipe(SapA);
		getServer().addRecipe(SapD);
		getServer().addRecipe(FL);
		getServer().addRecipe(StrgW);
		getServer().addRecipe(StrgO);
		getServer().addRecipe(StrgM);
		getServer().addRecipe(StrgLB);
		getServer().addRecipe(StrgY);
		getServer().addRecipe(StrgL);
		getServer().addRecipe(StrgP);
		getServer().addRecipe(StrgG);
		getServer().addRecipe(StrgLG);
		getServer().addRecipe(StrgC);
		getServer().addRecipe(StrgPu);
		getServer().addRecipe(StrgB);
		getServer().addRecipe(StrgBr);
		getServer().addRecipe(StrgGr);
		getServer().addRecipe(StrgR);
		getServer().addRecipe(StrgBl);
		getServer().addRecipe(CW);
		getServer().addRecipe(Dande);
		getServer().addRecipe(Poppy);
		getServer().addRecipe(Orchid);
		getServer().addRecipe(Allium);
		getServer().addRecipe(Azure);
		getServer().addRecipe(TulipR);
		getServer().addRecipe(TulipO);
		getServer().addRecipe(TulipW);
		getServer().addRecipe(TulipP);
		getServer().addRecipe(Oxeye);
		getServer().addRecipe(SunF);
		getServer().addRecipe(DTG);
		getServer().addRecipe(Rose);
		getServer().addRecipe(Peony);
		getServer().addRecipe(Lilac);
		getServer().addRecipe(Mel);
		getServer().addRecipe(Jack);
		getServer().addRecipe(DG);
		getServer().addRecipe(Bucket);
		getServer().addRecipe(DtA);
		getServer().addRecipe(GtD);
		getServer().addRecipe(AtS);
		getServer().addRecipe(SBtSB);
		getServer().addRecipe(OStS);
		getServer().addRecipe(SStS);
		getServer().addRecipe(BStS);
		getServer().addRecipe(JStS);
		getServer().addRecipe(AStS);
		getServer().addRecipe(DStS);
		getServer().addRecipe(PGtG);
		getServer().addRecipe(PDtD);
		getServer().addRecipe(PAtA);
		getServer().addRecipe(SBtSL);
		
		getLogger().info("Crafthium has been Enabled");
	}
	
	public void onDisable(){
		Bukkit.getServer().clearRecipes();
		getLogger().info("Crafthium has been Disabled");
	}

}