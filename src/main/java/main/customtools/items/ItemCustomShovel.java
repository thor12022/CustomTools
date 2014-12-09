package main.customtools.items;

import main.customtools.CustomTools;
import main.customtools.ModInformation;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;

public class ItemCustomShovel extends ItemSpade
{
   private String displayName;
   
   public ItemCustomShovel(ToolMaterial toolMaterial, String name, String texture)
   {
      super(toolMaterial);
      this.setTextureName(texture);
      this.setUnlocalizedName(ModInformation.ID + "." + name);
      this.setCreativeTab(CustomTools.creativeTabCustomTools);
      displayName = name;
   }
   
   @Override
   public String getItemStackDisplayName(ItemStack stack) {

      return displayName;
   }
}
