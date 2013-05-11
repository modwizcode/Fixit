package com.gmail.wrsaith.Fixit;

import java.util.ArrayList;
import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.PrepareItemCraftEvent;
import org.bukkit.inventory.*;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.plugin.java.JavaPlugin;

public class Fixit extends JavaPlugin implements Listener
{
  private static final Logger log = Logger.getLogger("Minecraft");
  public final ArrayList<Player> Fixitusers = new ArrayList();


  @Override
  public void onEnable()
  {
    getServer().getPluginManager().registerEvents(this, this);
    ItemStack resultdiamond_spade = new ItemStack(Material.DIAMOND_SPADE, 1);
    ShapelessRecipe rdspade = new ShapelessRecipe(resultdiamond_spade);
    rdspade.addIngredient(1, Material.DIAMOND);
    rdspade.addIngredient(1, Material.DIAMOND_SPADE, -1);
    getServer().addRecipe(rdspade);

    ItemStack resultdiamond_sword = new ItemStack(Material.DIAMOND_SWORD, 1);
    ShapelessRecipe rdsword = new ShapelessRecipe(resultdiamond_sword);
    rdsword.addIngredient(1, Material.DIAMOND);
    rdsword.addIngredient(1, Material.DIAMOND_SWORD, -1);
    getServer().addRecipe(rdsword);

    ItemStack resultdiamond_pickaxe = new ItemStack(Material.DIAMOND_PICKAXE, 1);
    ShapelessRecipe rdpickaxe = new ShapelessRecipe(resultdiamond_pickaxe);
    rdpickaxe.addIngredient(1, Material.DIAMOND);
    rdpickaxe.addIngredient(1, Material.DIAMOND_PICKAXE, -1);
    getServer().addRecipe(rdpickaxe);

    ItemStack resultdiamond_axe = new ItemStack(Material.DIAMOND_AXE, 1);
    ShapelessRecipe rdaxe = new ShapelessRecipe(resultdiamond_axe);
    rdaxe.addIngredient(1, Material.DIAMOND);
    rdaxe.addIngredient(1, Material.DIAMOND_AXE, -1);
    getServer().addRecipe(rdaxe);

    ItemStack resultdiamond_hoe = new ItemStack(Material.DIAMOND_HOE, 1);
    ShapelessRecipe rdhoe = new ShapelessRecipe(resultdiamond_hoe);
    rdhoe.addIngredient(1, Material.DIAMOND);
    rdhoe.addIngredient(1, Material.DIAMOND_HOE, -1);
    getServer().addRecipe(rdhoe);

    ItemStack resultdiamond_helmet = new ItemStack(Material.DIAMOND_HELMET, 1);
    ShapelessRecipe rdhelmet = new ShapelessRecipe(resultdiamond_helmet);
    rdhelmet.addIngredient(1, Material.DIAMOND);
    rdhelmet.addIngredient(1, Material.DIAMOND_HELMET, -1);
    getServer().addRecipe(rdhelmet);

    ItemStack resultdiamond_chestplate = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
    ShapelessRecipe rdchestplate = new ShapelessRecipe(resultdiamond_chestplate);
    rdchestplate.addIngredient(2, Material.DIAMOND);
    rdchestplate.addIngredient(1, Material.DIAMOND_CHESTPLATE, -1);
    getServer().addRecipe(rdchestplate);

    ItemStack resultdiamond_leggings = new ItemStack(Material.DIAMOND_LEGGINGS, 1);
    ShapelessRecipe rdleggings = new ShapelessRecipe(resultdiamond_leggings);
    rdleggings.addIngredient(2, Material.DIAMOND);
    rdleggings.addIngredient(1, Material.DIAMOND_LEGGINGS, -1);
    getServer().addRecipe(rdleggings);

    ItemStack resultdiamond_boots = new ItemStack(Material.DIAMOND_BOOTS, 1);
    ShapelessRecipe rdboots = new ShapelessRecipe(resultdiamond_boots);
    rdboots.addIngredient(1, Material.DIAMOND);
    rdboots.addIngredient(1, Material.DIAMOND_BOOTS, -1);
    getServer().addRecipe(rdboots);

    ItemStack resultgold_spade = new ItemStack(Material.GOLD_SPADE, 1);
    ShapelessRecipe rgspade = new ShapelessRecipe(resultgold_spade);
    rgspade.addIngredient(1, Material.GOLD_INGOT);
    rgspade.addIngredient(1, Material.GOLD_SPADE, -1);
    getServer().addRecipe(rgspade);

    ItemStack resultgold_sword = new ItemStack(Material.GOLD_SWORD, 1);
    ShapelessRecipe rgsword = new ShapelessRecipe(resultgold_sword);
    rgsword.addIngredient(1, Material.GOLD_INGOT);
    rgsword.addIngredient(1, Material.GOLD_SWORD, -1);
    getServer().addRecipe(rgsword);

    ItemStack resultgold_pickaxe = new ItemStack(Material.GOLD_PICKAXE, 1);
    ShapelessRecipe rgpickaxe = new ShapelessRecipe(resultgold_pickaxe);
    rgpickaxe.addIngredient(1, Material.GOLD_INGOT);
    rgpickaxe.addIngredient(1, Material.GOLD_PICKAXE, -1);
    getServer().addRecipe(rgpickaxe);

    ItemStack resultgold_axe = new ItemStack(Material.GOLD_AXE, 1);
    ShapelessRecipe rgaxe = new ShapelessRecipe(resultgold_axe);
    rgaxe.addIngredient(1, Material.GOLD_INGOT);
    rgaxe.addIngredient(1, Material.GOLD_AXE, -1);
    getServer().addRecipe(rgaxe);

    ItemStack resultgold_hoe = new ItemStack(Material.GOLD_HOE, 1);
    ShapelessRecipe rghoe = new ShapelessRecipe(resultgold_hoe);
    rghoe.addIngredient(1, Material.GOLD_INGOT);
    rghoe.addIngredient(1, Material.GOLD_HOE, -1);
    getServer().addRecipe(rghoe);

    ItemStack resultgold_helmet = new ItemStack(Material.GOLD_HELMET, 1);
    ShapelessRecipe rghelmet = new ShapelessRecipe(resultgold_helmet);
    rghelmet.addIngredient(1, Material.GOLD_INGOT);
    rghelmet.addIngredient(1, Material.GOLD_HELMET, -1);
    getServer().addRecipe(rghelmet);

    ItemStack resultgold_chestplate = new ItemStack(Material.GOLD_CHESTPLATE, 1);
    ShapelessRecipe rgchestplate = new ShapelessRecipe(resultgold_chestplate);
    rgchestplate.addIngredient(2, Material.GOLD_INGOT);
    rgchestplate.addIngredient(1, Material.GOLD_CHESTPLATE, -1);
    getServer().addRecipe(rgchestplate);

    ItemStack resultgold_leggings = new ItemStack(Material.GOLD_LEGGINGS, 1);
    ShapelessRecipe rgleggings = new ShapelessRecipe(resultgold_leggings);
    rgleggings.addIngredient(2, Material.GOLD_INGOT);
    rgleggings.addIngredient(1, Material.GOLD_LEGGINGS, -1);
    getServer().addRecipe(rgleggings);

    ItemStack resultgold_boots = new ItemStack(Material.GOLD_BOOTS, 1);
    ShapelessRecipe rgboots = new ShapelessRecipe(resultgold_boots);
    rgboots.addIngredient(1, Material.GOLD_INGOT);
    rgboots.addIngredient(1, Material.GOLD_BOOTS, -1);
    getServer().addRecipe(rgboots);

    ItemStack resultiron_spade = new ItemStack(Material.IRON_SPADE, 1);
    ShapelessRecipe rispade = new ShapelessRecipe(resultiron_spade);
    rispade.addIngredient(1, Material.IRON_INGOT);
    rispade.addIngredient(1, Material.IRON_SPADE, -1);
    getServer().addRecipe(rispade);

    ItemStack resultiron_sword = new ItemStack(Material.IRON_SWORD, 1);
    ShapelessRecipe risword = new ShapelessRecipe(resultiron_sword);
    risword.addIngredient(1, Material.IRON_INGOT);
    risword.addIngredient(1, Material.IRON_SWORD, -1);
    getServer().addRecipe(risword);

    ItemStack resultiron_pickaxe = new ItemStack(Material.IRON_PICKAXE, 1);
    ShapelessRecipe ripickaxe = new ShapelessRecipe(resultiron_pickaxe);
    ripickaxe.addIngredient(1, Material.IRON_INGOT);
    ripickaxe.addIngredient(1, Material.IRON_PICKAXE, -1);
    getServer().addRecipe(ripickaxe);

    ItemStack resultiron_axe = new ItemStack(Material.IRON_AXE, 1);
    ShapelessRecipe riaxe = new ShapelessRecipe(resultiron_axe);
    riaxe.addIngredient(1, Material.IRON_INGOT);
    riaxe.addIngredient(1, Material.IRON_AXE, -1);
    getServer().addRecipe(riaxe);

    ItemStack resultiron_hoe = new ItemStack(Material.IRON_HOE, 1);
    ShapelessRecipe rihoe = new ShapelessRecipe(resultiron_hoe);
    rihoe.addIngredient(1, Material.IRON_INGOT);
    rihoe.addIngredient(1, Material.IRON_HOE, -1);
    getServer().addRecipe(rihoe);

    ItemStack resultiron_helmet = new ItemStack(Material.IRON_HELMET, 1);
    ShapelessRecipe rihelmet = new ShapelessRecipe(resultiron_helmet);
    rihelmet.addIngredient(1, Material.IRON_INGOT);
    rihelmet.addIngredient(1, Material.IRON_HELMET, -1);
    getServer().addRecipe(rihelmet);

    ItemStack resultiron_chestplate = new ItemStack(Material.IRON_CHESTPLATE, 1);
    ShapelessRecipe richestplate = new ShapelessRecipe(resultiron_chestplate);
    richestplate.addIngredient(2, Material.IRON_INGOT);
    richestplate.addIngredient(1, Material.IRON_CHESTPLATE, -1);
    getServer().addRecipe(richestplate);

    ItemStack resultiron_leggings = new ItemStack(Material.IRON_LEGGINGS, 1);
    ShapelessRecipe rileggings = new ShapelessRecipe(resultiron_leggings);
    rileggings.addIngredient(2, Material.IRON_INGOT);
    rileggings.addIngredient(1, Material.IRON_LEGGINGS, -1);
    getServer().addRecipe(rileggings);

    ItemStack resultiron_boots = new ItemStack(Material.IRON_BOOTS, 1);
    ShapelessRecipe riboots = new ShapelessRecipe(resultiron_boots);
    riboots.addIngredient(1, Material.IRON_INGOT);
    riboots.addIngredient(1, Material.IRON_BOOTS, -1);
    getServer().addRecipe(riboots);
    
    ItemStack resultchain_helmet = new ItemStack(Material.CHAINMAIL_HELMET, 1);
    ShapelessRecipe rchelmet = new ShapelessRecipe(resultchain_helmet);
    rchelmet.addIngredient(1, Material.IRON_INGOT);
    rchelmet.addIngredient(1, Material.IRON_HELMET, -1);
    getServer().addRecipe(rchelmet);

    ItemStack resultchain_chestplate = new ItemStack(Material.CHAINMAIL_CHESTPLATE, 1);
    ShapelessRecipe rcchestplate = new ShapelessRecipe(resultchain_chestplate);
    rcchestplate.addIngredient(2, Material.IRON_INGOT);
    rcchestplate.addIngredient(1, Material.IRON_CHESTPLATE, -1);
    getServer().addRecipe(rcchestplate);

    ItemStack resultchain_leggings = new ItemStack(Material.CHAINMAIL_LEGGINGS, 1);
    ShapelessRecipe rcleggings = new ShapelessRecipe(resultchain_leggings);
    rcleggings.addIngredient(2, Material.IRON_INGOT);
    rcleggings.addIngredient(1, Material.IRON_LEGGINGS, -1);
    getServer().addRecipe(rcleggings);

    ItemStack resultchain_boots = new ItemStack(Material.CHAINMAIL_BOOTS, 1);
    ShapelessRecipe rcboots = new ShapelessRecipe(resultchain_boots);
    rcboots.addIngredient(1, Material.IRON_INGOT);
    rcboots.addIngredient(1, Material.IRON_BOOTS, -1);
    getServer().addRecipe(rcboots);

    ItemStack resultstone_spade = new ItemStack(Material.STONE_SPADE, 1);
    ShapelessRecipe rsspade = new ShapelessRecipe(resultstone_spade);
    rsspade.addIngredient(1, Material.COBBLESTONE);
    rsspade.addIngredient(1, Material.STONE_SPADE, -1);
    getServer().addRecipe(rsspade);

    ItemStack resultstone_sword = new ItemStack(Material.STONE_SWORD, 1);
    ShapelessRecipe rssword = new ShapelessRecipe(resultstone_sword);
    rssword.addIngredient(1, Material.COBBLESTONE);
    rssword.addIngredient(1, Material.STONE_SWORD, -1);
    getServer().addRecipe(rssword);

    ItemStack resultstone_pickaxe = new ItemStack(Material.STONE_PICKAXE, 1);
    ShapelessRecipe rspickaxe = new ShapelessRecipe(resultstone_pickaxe);
    rspickaxe.addIngredient(1, Material.COBBLESTONE);
    rspickaxe.addIngredient(1, Material.STONE_PICKAXE, -1);
    getServer().addRecipe(rspickaxe);

    ItemStack resultstone_axe = new ItemStack(Material.STONE_AXE, 1);
    ShapelessRecipe rsaxe = new ShapelessRecipe(resultstone_axe);
    rsaxe.addIngredient(1, Material.COBBLESTONE);
    rsaxe.addIngredient(1, Material.STONE_AXE, -1);
    getServer().addRecipe(rsaxe);

    ItemStack resultstone_hoe = new ItemStack(Material.STONE_HOE, 1);
    ShapelessRecipe rshoe = new ShapelessRecipe(resultstone_hoe);
    rshoe.addIngredient(1, Material.COBBLESTONE);
    rshoe.addIngredient(1, Material.STONE_HOE, -1);
    getServer().addRecipe(rshoe);

    ItemStack resultleather_helmet = new ItemStack(Material.LEATHER_HELMET, 1);
    ShapelessRecipe rlhelmet = new ShapelessRecipe(resultleather_helmet);
    rlhelmet.addIngredient(1, Material.LEATHER);
    rlhelmet.addIngredient(1, Material.LEATHER_HELMET, -1);
    getServer().addRecipe(rlhelmet);

    ItemStack resultleather_chestplate = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
    ShapelessRecipe rlchestplate = new ShapelessRecipe(resultleather_chestplate);
    rlchestplate.addIngredient(2, Material.LEATHER);
    rlchestplate.addIngredient(1, Material.LEATHER_CHESTPLATE, -1);
    getServer().addRecipe(rlchestplate);

    ItemStack resultleather_leggings = new ItemStack(Material.LEATHER_LEGGINGS, 1);
    ShapelessRecipe rlleggings = new ShapelessRecipe(resultleather_leggings);
    rlleggings.addIngredient(2, Material.LEATHER);
    rlleggings.addIngredient(1, Material.LEATHER_LEGGINGS, -1);
    getServer().addRecipe(rlleggings);

    ItemStack resultleather_boots = new ItemStack(Material.LEATHER_BOOTS, 1);
    ShapelessRecipe rlboots = new ShapelessRecipe(resultleather_boots);
    rlboots.addIngredient(1, Material.LEATHER);
    rlboots.addIngredient(1, Material.LEATHER_BOOTS, -1);
    getServer().addRecipe(rlboots);

    ItemStack resultwood_spade = new ItemStack(Material.WOOD_SPADE, 1);
    ShapelessRecipe rwspade = new ShapelessRecipe(resultwood_spade);
    rwspade.addIngredient(1, Material.WOOD);
    rwspade.addIngredient(1, Material.WOOD_SPADE, -1);
    getServer().addRecipe(rwspade);

    ItemStack resultwood_sword = new ItemStack(Material.WOOD_SWORD, 1);
    ShapelessRecipe rwsword = new ShapelessRecipe(resultwood_sword);
    rwsword.addIngredient(1, Material.WOOD);
    rwsword.addIngredient(1, Material.WOOD_SWORD, -1);
    getServer().addRecipe(rwsword);

    ItemStack resultwood_pickaxe = new ItemStack(Material.WOOD_PICKAXE, 1);
    ShapelessRecipe rwpickaxe = new ShapelessRecipe(resultwood_pickaxe);
    rwpickaxe.addIngredient(1, Material.WOOD);
    rwpickaxe.addIngredient(1, Material.WOOD_PICKAXE, -1);
    getServer().addRecipe(rwpickaxe);

    ItemStack resultwood_axe = new ItemStack(Material.WOOD_AXE, 1);
    ShapelessRecipe rwaxe = new ShapelessRecipe(resultwood_axe);
    rwaxe.addIngredient(1, Material.WOOD);
    rwaxe.addIngredient(1, Material.WOOD_AXE, -1);
    getServer().addRecipe(rwaxe);

    ItemStack resultwood_hoe = new ItemStack(Material.WOOD_HOE, 1);
    ShapelessRecipe rwhoe = new ShapelessRecipe(resultwood_hoe);
    rwhoe.addIngredient(1, Material.WOOD);
    rwhoe.addIngredient(1, Material.WOOD_HOE, -1);
    getServer().addRecipe(rwhoe);

    ItemStack resultbow = new ItemStack(Material.BOW, 1);
    ShapelessRecipe rmbow = new ShapelessRecipe(resultbow);
    rmbow.addIngredient(2, Material.STRING);
    rmbow.addIngredient(1, Material.BOW, -1);
    getServer().addRecipe(rmbow);

    ItemStack resultfishing_rod = new ItemStack(Material.FISHING_ROD, 1);
    ShapelessRecipe rmfishr = new ShapelessRecipe(resultfishing_rod);
    rmfishr.addIngredient(1, Material.STRING);
    rmfishr.addIngredient(1, Material.FISHING_ROD, -1);
    getServer().addRecipe(rmfishr);

    ItemStack resultflint_and_steel = new ItemStack(Material.FLINT_AND_STEEL, 1);
    ShapelessRecipe rmflints = new ShapelessRecipe(resultflint_and_steel);
    rmflints.addIngredient(1, Material.FLINT);
    rmflints.addIngredient(1, Material.FLINT_AND_STEEL, -1);
    getServer().addRecipe(rmflints);

    ItemStack resultshears = new ItemStack(Material.SHEARS, 1);
    ShapelessRecipe rmshears = new ShapelessRecipe(resultshears);
    rmshears.addIngredient(1, Material.IRON_INGOT);
    rmshears.addIngredient(1, Material.SHEARS, -1);
    getServer().addRecipe(rmshears);

    ItemStack resultmoss = new ItemStack(Material.MOSSY_COBBLESTONE, 1);
    ShapedRecipe mossrecipe = new ShapedRecipe(resultmoss);
    mossrecipe.shape(new String[] { "AAA", "ABA", "AAA" });
    mossrecipe.setIngredient('A', Material.SLIME_BALL);
    mossrecipe.setIngredient('B', Material.COBBLESTONE);
    getServer().addRecipe(mossrecipe);

    ItemStack resultsand = new ItemStack(Material.SAND, 6);
    ShapedRecipe sandrecipe = new ShapedRecipe(resultsand);
    sandrecipe.shape(new String[] { "AAA", "ABA", "AAA" });
    sandrecipe.setIngredient('A', Material.SANDSTONE);
    sandrecipe.setIngredient('B', Material.STONE);
    getServer().addRecipe(sandrecipe);
  }

  @Override
  public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args)
  {
    if (commandLabel.equalsIgnoreCase("Fixit")) {
      toggleFixit(sender);
    }
    return false;
  }

  private void toggleFixit(CommandSender sender) {
    if (!enabled((Player)sender))
    {
      this.Fixitusers.add((Player)sender);
      ((Player)sender).sendMessage(ChatColor.BLUE + "Fixit has been enabled!");
    }
    else
    {
      this.Fixitusers.remove((Player)sender);
      ((Player)sender).sendMessage(ChatColor.RED + "Fixit has been disabled!");
    }
  }

  public boolean enabled(Player player)
  {
    return this.Fixitusers.contains(player);
  }
 
  
  @EventHandler
  public void onPrepareItemCraftEvent(PrepareItemCraftEvent event) throws Exception {
      if (event.getRecipe() instanceof Recipe) {          
          CraftingInventory ci = event.getInventory();          
          ItemStack res = ci.getResult();
          for (ItemStack a : ci.getContents()) {
              if (a.getEnchantments() != null) {
                  res.addEnchantments(a.getEnchantments());
              }

              if (isLeather(res)) {
                  if (isLeather(a)) {
                    if (a.hasItemMeta()) {
                        LeatherArmorMeta meta = (LeatherArmorMeta) a.getItemMeta();
                        Color color = meta.getColor();
                        LeatherArmorMeta resultMeta = meta.clone();
                        resultMeta.setColor(color);
                        res.setItemMeta(resultMeta);
                    }
                  }
              }

          }                          
          ci.setResult(res);
      }
  }

  
  private boolean isLeather(ItemStack item) {
      switch (item.getType()) {
          case LEATHER_BOOTS:
          case LEATHER_CHESTPLATE:
          case LEATHER_HELMET:
          case LEATHER_LEGGINGS:
              return true;
      }
      
      return false;
  }

    
}