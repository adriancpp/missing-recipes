package io.github.adriancpp.missingrecipes;

import java.util.HashMap;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public class MissingRecipes extends JavaPlugin
{
	private void AEW_AddCraftingRecipe( Material material, Integer amount, 
			String nspace, String[] lista,
			HashMap<Character, Material> ingredients )
	{
		ItemStack item = new ItemStack(material, amount);
        ItemMeta meta = item.getItemMeta();
        item.setItemMeta(meta);
	    NamespacedKey key = new NamespacedKey(this, nspace);
	    ShapedRecipe recipe = new ShapedRecipe(key, item);
	    recipe.shape(lista);
	    ingredients.forEach((k, v) -> {
	    	recipe.setIngredient(k, v);
        });
        getServer().addRecipe(recipe);
	}
	
	@Override
	public void onLoad() {

	}
	
	@Override
    public void onEnable() 
	{
		AEW_AddCraftingRecipe(Material.COBWEB, 1, "AEW_COBWEB", new String[]{"SSS", "SSS", "SSS"}, 
				new HashMap<Character, Material>() {{ put('S', Material.STRING); }} );
		
		AEW_AddCraftingRecipe(Material.EMERALD_ORE, 1, "AEW_EMERALD_ORE", new String[]{" E ", "ESE", " E "}, 
				new HashMap<Character, Material>() {{ put('E', Material.EMERALD); put('S', Material.STONE); }} );
		
		AEW_AddCraftingRecipe(Material.OBSIDIAN, 1, "AEW_OBSIDIAN", new String[]{"W", "L"}, 
				new HashMap<Character, Material>() {{ put('W', Material.WATER_BUCKET); put('L', Material.LAVA_BUCKET); }} );
		
		AEW_AddCraftingRecipe(Material.STRING, 4, "AEW_STRING", new String[]{" S", "W "}, 
				new HashMap<Character, Material>() {{ put('S', Material.SHEARS); put('W', Material.WHITE_WOOL); }} );
		
		AEW_AddCraftingRecipe(Material.SPAWNER, 1, "AEW_SPAWNER", new String[]{"DED", "ESE", "DED"}, 
				new HashMap<Character, Material>() {{ put('D', Material.DIAMOND_BLOCK); put('E', Material.EMERALD_BLOCK); put('S', Material.NETHER_STAR); }} );
		
		AEW_AddCraftingRecipe(Material.TRIDENT, 1, "AEW_TRIDENT", new String[]{"GGG", "DDD", " D "}, 
				new HashMap<Character, Material>() {{ put('G', Material.GHAST_TEAR); put('D', Material.DIAMOND); }} );
		
		AEW_AddCraftingRecipe(Material.ELYTRA, 1, "AEW_ELYTRA", new String[]{"WIW", "WSW", "W W"}, 
				new HashMap<Character, Material>() {{ put('W', Material.PHANTOM_MEMBRANE); put('I', Material.NETHERITE_INGOT); 
				put('S', Material.NETHER_STAR);}} );
		
		
		
		
		AEW_AddCraftingRecipe(Material.BLUE_ICE, 1, "AEW_BLUE_ICE", new String[]{"E E", " I ", "E E"}, 
				new HashMap<Character, Material>() {{ put('E', Material.ENDER_PEARL); put('I', Material.ICE); }} );
		
		AEW_AddCraftingRecipe(Material.CRYING_OBSIDIAN, 1, "AEW_CRYING_OBSIDIAN", new String[]{"RLR", "LOL", "RLR"}, 
				new HashMap<Character, Material>() {{ put('O', Material.OBSIDIAN); put('L', Material.LAPIS_LAZULI); put('R', Material.REDSTONE); }} );
		
		AEW_AddCraftingRecipe(Material.IRON_BLOCK, 1, "AEW_IRON_BLOCK", new String[]{" GR", "BXU", " S "}, 
				new HashMap<Character, Material>() {{ put('G', Material.GLOWSTONE_DUST); put('R', Material.REDSTONE); put('B', Material.BLAZE_ROD); 
													  put('X', Material.IRON_INGOT); put('U', Material.GUNPOWDER); put('S', Material.STONE);}} );
		
		AEW_AddCraftingRecipe(Material.GOLD_BLOCK, 1, "AEW_GOLD_BLOCK", new String[]{" GR", "BXU", " S "}, 
				new HashMap<Character, Material>() {{ put('G', Material.GLOWSTONE_DUST); put('R', Material.REDSTONE); put('B', Material.BLAZE_ROD); 
													  put('X', Material.GOLD_INGOT); put('U', Material.GUNPOWDER); put('S', Material.STONE);}} );
		
		AEW_AddCraftingRecipe(Material.QUARTZ, 2, "AEW_QUARTZ", new String[]{"Q"}, 
				new HashMap<Character, Material>() {{ put('Q', Material.QUARTZ_BLOCK); }} );
		
		AEW_AddCraftingRecipe(Material.GLOWSTONE_DUST, 2, "AEW_GLOWSTONE_DUST", new String[]{"G"}, 
				new HashMap<Character, Material>() {{ put('G', Material.GLOWSTONE); }} );
		
		AEW_AddCraftingRecipe(Material.OAK_PLANKS, 1, "AEW_OAK_PLANKS", new String[]{"SSS", "SSS", "SSS"}, 
				new HashMap<Character, Material>() {{ put('S', Material.STICK); }} );
		
		
		
	}
    
    @Override
    public void onDisable() {

    }
}
