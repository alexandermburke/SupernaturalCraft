package com.sterango.spncraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class SilverOre extends Block {

protected SilverOre() {
super(Material.iron);
setHarvestLevel("pickaxe",0);
}

}