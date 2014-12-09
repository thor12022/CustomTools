package main.customtools.items;

import main.customtools.CustomTools;
import main.customtools.ModInformation;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;

public class ItemCustomAxe extends ItemAxe
{
   private String displayName;
   
   public ItemCustomAxe(ToolMaterial toolMaterial, String name, String texture)
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
