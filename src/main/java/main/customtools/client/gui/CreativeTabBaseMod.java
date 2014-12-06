package main.customtools.client.gui;

//Creates your creative tab.

import main.customtools.ModInformation;
import main.customtools.items.ItemRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CreativeTabBaseMod extends CreativeTabs
{

   public CreativeTabBaseMod(String tabLabel)
   {
      super(tabLabel);
      setBackgroundImageName(ModInformation.ID + ".png"); 
   }

   public boolean hasSearchBar()
   {
      return true;
   }

   // The tab icon is what you return here.
   //@Override
   //public ItemStack getIconItemStack()
   //{
      //return new ItemStack(ItemRegistry.exampleItem);
   //}

   @Override
   public Item getTabIconItem()
   {
      return new Item();
   }
}
